package com.xiong.domain.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.tomcat.util.http.fileupload.ProgressListener;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.eclipse.jdt.internal.compiler.util.Sorting;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.xiong.domain.dao.AnswerMapper;
import com.xiong.domain.dao.UserMapper;
import com.xiong.domain.entity.Answer;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserMapper userdao;

	@Resource
	private AnswerMapper answerdao;

	@Resource
	private SqlSessionFactoryBean factory;

	@Resource
	private UserServiceImpl userserviceimpl;

	private Answer answer;

	@RequestMapping("/regist")
	public String regist(String usernum, String password, HttpSession session) {
		User user = new User();
		user.setUsernum(usernum);
		user.setPassword(password);
		// 随机生成昵称
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
		String name = "xxw" + format.format(new Date()) + new Random().nextInt(1000);
		user.setUsername(name);
		// 默认男性
		user.setSex("男");
		if (userserviceimpl.regist(user)) {
			session.removeAttribute("user");
			session.setAttribute("user", user);
			return "redirect:/jsp/index";
		} else {
			session.setAttribute("error", "注册失败,用户已存在！");
			session.setAttribute("usernum", usernum);
			return "redirect:/jsp/register";
		}
	}

	@RequestMapping("/update")
	public String update(String username, String useremail, String userage, String userphone, String sex,
			HttpSession session) {
		User user = (User) session.getAttribute("user");
		user.setUsername(username);
		user.setEmail(useremail);
		user.setPhone(userphone);
		user.setAge(Integer.parseInt(userage));
		user.setSex("0".equals(sex) ? "男" : "女");
		boolean update = userserviceimpl.update(user);
		if (update) {
			session.setAttribute("user", user);
			return "redirect:/jsp/userInfo";
		} else {
			return "redirect:/jsp/userInfo";
		}
	}

	@RequestMapping("changepwd")
	public String changePwd(String present_pwd, String new_pwd, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (user.getPassword().equals(present_pwd)) {
			user.setPassword(new_pwd);
			if (userserviceimpl.update(user)) {
				session.removeAttribute("user");
				session.removeAttribute("cpwd");
				return "redirect:/jsp/login";
			}
		} else {
			session.setAttribute("cpwd", "当前密码不正确，请重新修改");
		}
		return "redirect:/jsp/userInfo";
	}

	/**
	 * 获取用户答题情况
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/answer")
	public Answer getAnswer(HttpSession session) {
		User user = (User) session.getAttribute("user");
		Answer answer = null;
		if (user != null && user.getUserId() != null) {
			answer = answerdao.selectByUserId(user.getUserId());
		}
		return answer;
	}

	@RequestMapping(value = "/iconn", method = { RequestMethod.POST })
	@ResponseBody
	public String test(MultipartFile myfile, HttpServletRequest request, HttpSession session) throws IOException {
		System.out.println("comming!");
		String path = request.getSession().getServletContext().getRealPath("WEB-INF/front-end/icon");
		System.out.println("path>>" + path);
		User user = (User) session.getAttribute("user");
		String fileName = myfile.getOriginalFilename();
		System.out.println("fileName>>" + fileName);
		user.setIcon("/icon/" + fileName);
		userdao.updateByPrimaryKey(user);

		File dir = new File(path, fileName);
		System.out.println("dir.exists()>>" + dir.exists());
		if (!dir.exists()) {
			dir.mkdirs();
		}
		System.out.println("dir.exists()>>" + dir.exists());
		// MultipartFile自带的解析方法
		myfile.transferTo(dir);

		return "/icon/" + fileName;
	}
}
