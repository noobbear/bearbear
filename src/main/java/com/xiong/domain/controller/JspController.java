package com.xiong.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/jsp")
public class JspController {
	private static String FE = "front-end/jsp/";
	private static String BE = "back-end/jsp/";

	@RequestMapping("/index")
	public String turnToFEIndex() {
		return FE + "index";
	}

	@RequestMapping("/play")
	public String turnToFEPlay() {
		return FE + "vedioplay";
	}

	@RequestMapping("/library")
	public String turnToFELibrary() {
		return FE + "library";
	}

	@RequestMapping("/library2")
	public String turnToFELibrary2() {
		return FE + "library2";
	}

	@RequestMapping("/problem")
	public String turnToFEProblem() {
		return FE + "problem";
	}

	@RequestMapping("/study")
	public String turnToFEStudy() {
		return FE + "study";
	}

	@RequestMapping("/login")
	public String turnToFELogin() {
		return FE + "login";
	}

	@RequestMapping("/userInfo")
	public String turnToFEUserInfo() {
		return FE + "userInfo";
	}

	@RequestMapping("/register")
	public String turnToFERegister() {
		return FE + "register";
	}

	@RequestMapping("/user")
	public String turnToBEUser() {
		return BE + "user";
	}

	@RequestMapping("/learn")
	public String turnToBELearn() {
		return BE + "learn";
	}

	@RequestMapping("/text")
	public String turnToBEText() {
		return BE + "text";
	}

	@RequestMapping("/daily")
	public String turnToBEDaily() {
		return BE + "daily";
	}

}
