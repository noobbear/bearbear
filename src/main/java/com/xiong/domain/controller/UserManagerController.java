package com.xiong.domain.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/manager")
public class UserManagerController {
	static Integer PAGESIZE = 15;

	@Resource
	private UserServiceImpl impl;

	/**
	 * 分页获取用户
	 */
	@RequestMapping("/users")
	public String getUsers(Integer PageNo, HttpSession session) {
		if (PageNo == null) {
			PageNo = 1;
		}
		PageInfo<?> info = impl.findAllExtra(PageNo, PAGESIZE);
		session.setAttribute("users", info.getList());
		session.setAttribute("total", info.getPages());
		session.setAttribute("current", info.getPageNum());
		session.setAttribute("last", info.getPages());
		return "redirect:/jsp/user";
	}

}
