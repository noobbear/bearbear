package com.xiong.domain.aop;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xiong.domain.dao.AnswerMapper;
import com.xiong.domain.entity.Answer;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.AnswerService;

@Service
@Aspect
@Component
public class RegisterAop {
	@Resource
	private HttpSession session;
	@Resource
	private AnswerService service;

	@Pointcut("execution(* com.xiong.domain.controller.UserController.regist(..))")
	private void beforeController() {
	}

	@After("beforeController()")
	public void afterMethod(JoinPoint jPoint) {
		String error = null;
		error = (String) session.getAttribute("error");
		if (error == null) {
			Answer answer = new Answer();
			User user = (User) session.getAttribute("user");
			answer.setUserId(user.getUserId());
			service.insertAnswer(answer);
		}

	}
}
