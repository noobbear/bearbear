package com.xiong.domain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Question;
import com.xiong.domain.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	static Integer PAGESIZE = 15;
	@Resource
	QuestionService questionService;

	@RequestMapping("/index")
	public String getQuestions(Integer PageNo, HttpSession session) {
		if (PageNo == null) {
			PageNo = 1;
		}
		PageInfo<?> info = questionService.findAllExtra(PageNo, PAGESIZE);
		session.setAttribute("questions", info.getList());
		session.setAttribute("total", info.getPages());
		session.setAttribute("current", info.getPageNum());
		session.setAttribute("last", info.getPages());
		for (Object q : info.getList()) {
			System.out.println(q);
		}
		return "redirect:/jsp/library";

	}
}
