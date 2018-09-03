package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.LoginLogMapper;
import com.xiong.domain.entity.LoginLog;
import com.xiong.domain.service.LoginLogService;

@Service
public class LoginLogServiceImpl implements LoginLogService {
	@Resource
	LoginLogMapper mapper;

	@Override
	public List<LoginLog> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<LoginLog> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<LoginLog> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean insert(LoginLog log) {
		return mapper.insert(log) > 0;
	}

}
