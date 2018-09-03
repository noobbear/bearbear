package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.User;

public interface UserService {
	boolean regist(User user);

	boolean update(User user);

	List<User> findAll();

	List<User> findAll(Integer PageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer PageNum, Integer pageSize);
}
