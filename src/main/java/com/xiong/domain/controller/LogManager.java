package com.xiong.domain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.service.LoginLogService;
import com.xiong.domain.service.impl.AnswerRecordServiceImpl;

@Controller
@RequestMapping("/log")
public class LogManager {
	static Integer PAGESIZE = 15;
	@Resource
	LoginLogService loginLogdao;
	@Resource
	AnswerRecordServiceImpl ardao;

	@RequestMapping("/llog")
	public String getLoginLog(Integer PageNo, HttpSession session) {
		if (PageNo == null) {
			PageNo = 1;
		}
		PageInfo<?> info = loginLogdao.findAllExtra(PageNo, PAGESIZE);
		session.setAttribute("ll", info.getList());
		session.setAttribute("total", info.getPages());
		session.setAttribute("current", info.getPageNum());
		session.setAttribute("last", info.getPages());
		session.setAttribute("method", "llog");
		return "redirect:/jsp/daily#panel-1";
	}

	@RequestMapping("/arlog")
	public String getAnswerRecord(Integer PageNo, HttpSession session) {
		if (PageNo == null) {
			PageNo = 1;
		}
		PageInfo<?> info = ardao.findAllExtra(PageNo, PAGESIZE);
		session.setAttribute("ar", info.getList());
		session.setAttribute("total", info.getPages());
		session.setAttribute("current", info.getPageNum());
		session.setAttribute("last", info.getPages());
		session.setAttribute("method", "arlog");
		return "redirect:/jsp/daily#panel-2";
	}
}
