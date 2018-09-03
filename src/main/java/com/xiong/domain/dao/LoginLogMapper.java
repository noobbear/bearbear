package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.LoginLog;

public interface LoginLogMapper {

	int deleteByPrimaryKey(Integer logId);

	int insert(LoginLog loginLog);

	int insertSelective(LoginLog loginLog);

	LoginLog selectByPrimaryKey(Integer logId);

	int updateByPrimaryKeySelective(LoginLog loginLog);

	int updateByPrimaryKey(LoginLog loginLog);

	List<LoginLog> findAll();
}