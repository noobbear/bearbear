package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.UserMapper;
import com.xiong.domain.entity.User;
import com.xiong.domain.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private SqlSessionFactoryBean factory;
	@Resource
	private UserMapper userdao;
	private SqlSession sqlsession;

	@Override
	public boolean regist(User user) {
		boolean tf = false;
		try {
			sqlsession = factory.getObject().openSession();
			int count = userdao.CountofUserNum(user.getUsernum());
			if (count == 0) {
				int insert = userdao.insert(user);
				if (insert == 1) {
					tf = true;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return tf;
		} finally {
			sqlsession.commit();
		}
		return tf;
	}

	@Override
	public boolean update(User user) {
		boolean tf = false;
		try {
			sqlsession = factory.getObject().openSession();
			int n = userdao.updateByPrimaryKeySelective(user);
			if (n == 1) {
				tf = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return tf;
		} finally {
			sqlsession.commit();
		}
		return tf;
	}

	@Override
	public List<User> findAll() {
		return userdao.findAll();
	}

	@Override
	public List<User> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userdao.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> list = userdao.findAll();
		PageInfo<?> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
}
