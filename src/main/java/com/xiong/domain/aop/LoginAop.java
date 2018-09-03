package com.xiong.domain.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xiong.domain.entity.LoginLog;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.LoginLogService;

@Service
@Aspect
@Component
public class LoginAop {
	@Resource
	private HttpSession session;
	@Resource
	private LoginLogService service;

	@Pointcut("execution(* com.xiong.domain.controller.LoginController.login(..))"
			+ "||execution(* com.xiong.domain.controller.LoginController.adminlogin(..))")
	private void beforeController() {
	}

	@After("beforeController()")
	public void afterMethod(JoinPoint jPoint) {
		Object args[] = jPoint.getArgs();
		String target = jPoint.getSignature().getName();
		User user = null;
		if (target.equals("adminlogin")) {
			user = (User) session.getAttribute("adminuser");
		} else {
			user = (User) session.getAttribute("user");
		}
		int userId = user.getUserId();
		SimpleDateFormat fmFormat = new SimpleDateFormat("YYYY-dd-MM hh:mm:ss");
		String date = fmFormat.format(new Date());
		System.out.println("aop");
		// boolean b=service.addLoginLog(date, userId);
		LoginLog log = new LoginLog();
		log.setDate(date);
		log.setUserId(userId);
		boolean b = service.insert(log);// (date, userId);
	}

}
