package com.xiong.domain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiong.domain.dao.NodeMapper;
import com.xiong.domain.entity.Node;

@Controller
@RequestMapping("/video")
public class VideoPlay {

	@Resource
	NodeMapper nodedao;

	@RequestMapping("/play")
	public String play(Integer id, HttpSession session) {
		Node node = nodedao.selectByPrimaryKey(id);
		session.setAttribute("node", node);
		return "redirect:/jsp/play";
	}
}
