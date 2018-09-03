package com.xiong.domain.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xiong.domain.dao.UserMapper;
import com.xiong.domain.entity.User;

@Controller
@RequestMapping("/login")
public class LoginController {

	private User user;

	@Resource
	private UserMapper userdao;

	@RequestMapping("/login")
	public String login(String num, String password, HttpSession session) {
		session.removeAttribute("user");
		session.removeAttribute("msg");
		Map<String, String> map = new HashMap<>();
		map.put("num", num);
		map.put("password", password);
		user = userdao.findByUserNumAndPwd(map);
		if (user == null) {
			user = userdao.findByPhoneAndPwd(map);
		}
		if (user == null) {
			user = userdao.findByEmailAndPwd(map);
		}
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/jsp/index";
		} else {
			session.setAttribute("msg", "帐号或密码错误!");
			session.setAttribute("num", num);
			return "redirect:/jsp/login";
		}

	}

	@RequestMapping(value = "/adminlogin", method = { RequestMethod.POST })
	@ResponseBody
	public User adminlogin(String num, String password, HttpSession session) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("num", num);
		map.put("password", password);
		user = userdao.findByUserNumAndPwd(map);
		if (user == null) {
			user = userdao.findByPhoneAndPwd(map);
		}
		if (user == null) {
			user = userdao.findByEmailAndPwd(map);
		}
		if (user != null && user.getAdmin() == 1) {
			session.setAttribute("adminuser", user);
			return user;
		} else {
			return null;
		}

	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/jsp/login";
	}

	@RequestMapping("/adminlogout")
	public String adminLogout(HttpSession session) {
		session.removeAttribute("adminuser");
		return "redirect:/admin/html/login.html";
	}

	@ResponseBody
	@RequestMapping("/loginUser")
	public User getUser(HttpSession session) {
		User user = (User) session.getAttribute("user");
		return user;
	}

	@ResponseBody
	@RequestMapping(value = "/loginUser2", method = { RequestMethod.POST })
	public Map<String, User> getUser2(HttpSession session) {
		User user = (User) session.getAttribute("user");
		Map<String, User> map = new HashMap<String, User>();
		map.put("user", user);
		return map;
	}

}
