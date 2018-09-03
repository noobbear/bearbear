package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.LoginLog;

public interface LoginLogService {
	boolean insert(LoginLog log);

	List<LoginLog> findAll();

	List<LoginLog> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);
}
