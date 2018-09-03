package com.xiong.domain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiong.domain.vo.StudyLineVo;
import com.xiong.domain.vo.dao.StudyLineVoDao;

@Controller
@RequestMapping("/study")
public class StudyLineController {

	@Resource
	StudyLineVoDao vodao;

	@RequestMapping("/javascript")
	public String getJavaScript(HttpSession session) {
		StudyLineVo line = vodao.getLine();
		session.setAttribute("js", line);
		return "redirect:/jsp/study";
	}
}
