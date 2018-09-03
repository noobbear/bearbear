package com.xiong.domain.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.UserMapper;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-ssm.xml")
public class TestUser {

	@Resource
	UserServiceImpl userServiceImpl;

	@Test
	public void test() throws Exception {
		// List<User> all = userServiceImpl.findAll();
		PageInfo<?> all = userServiceImpl.findAllExtra(1, 1);
		for (Object user : all.getList()) {
			System.out.println(user);
		}
		System.out.println(all.getPrePage());
		System.out.println(all.getNextPage());
		System.out.println(all.getEndRow());
		System.out.println(all.getFirstPage());
		System.out.println(all.getPages());
	}

}
