package com.xiong.domain.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Answer;
import com.xiong.domain.entity.AnswerRecord;
import com.xiong.domain.entity.Question;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.AnswerRecordService;
import com.xiong.domain.service.AnswerService;
import com.xiong.domain.service.QuestionService;

@Controller
@RequestMapping("/answer")
public class AnswerController {
	@Resource
	private HttpSession session;
	@Resource
	private AnswerService answerService;
	@Resource
	private AnswerRecordService answerRecordService;
	@Resource
	private QuestionService questionService;
	static Integer PAGESIZE = 15;

	@RequestMapping("/index")
	public ModelAndView getAnswer(String id) {
		Question question = questionService.getQuestionById(id);
		Map<String, Question> map = new HashMap<String, Question>();
		map.put("question", question);
		return new ModelAndView("front-end/jsp/problem", map);
	}

	@RequestMapping("/getRecords")
	public String getRecords(Integer PageNo, HttpSession session) {
		if (PageNo == null) {
			PageNo = 1;
		}
		PageInfo<?> info = answerRecordService.findAllExtra(PageNo, PAGESIZE);
		session.setAttribute("records", info.getList());
		session.setAttribute("total", info.getPages());
		session.setAttribute("current", info.getPageNum());
		session.setAttribute("last", info.getPages());
		for (Object q : info.getList()) {
			System.out.println(q.toString());
		}
		return "redirect:/jsp/library2";

	}

	@RequestMapping(value = "/answer", method = { RequestMethod.POST })
	@ResponseBody
	public Map<String, String> answer(String code, String input, String output, String id) {
		User user = (User) session.getAttribute("user");
		Answer answer = answerService.getAnswerByUserId(user.getUserId());
		answer.setAnswerTimes(answer.getAnswerTimes() + 1);
		String result = answerService.answer(code, input, output);
		int iscorrect = 1;
		Question question = questionService.getQuestionById(id);
		question.setTimes(question.getTimes() + 1);
		if (result.equals("ACCEPTED")) {
			answer.setFinishNumber(answer.getFinishNumber() + 1);
			iscorrect = 0;
			question.setCorrectTimes(question.getCorrectTimes() + 1);
		}
		questionService.update(question);
		answer.setCorrectRate(1.0 * answer.getFinishNumber() / answer.getAnswerTimes());
		answerService.updateAnswer(answer);
		AnswerRecord ar = new AnswerRecord();
		ar.setQuestionId(Integer.parseInt(id));
		ar.setUserId(user.getUserId());
		ar.setIscorrect(iscorrect);
		ar.setDate(new SimpleDateFormat("YYYY-dd-MM hh:mm:ss").format(new Date()));
		answerRecordService.insertRecord(ar);

		Map<String, String> map = new HashMap<String, String>();
		map.put("result", result);
		return map;
	}
}
