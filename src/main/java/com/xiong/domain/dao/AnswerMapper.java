package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.Answer;

public interface AnswerMapper {

	int deleteByPrimaryKey(Integer answerId);

	int insert(Answer answer);

	int insertSelective(Answer answer);

	Answer selectByPrimaryKey(Integer answerId);

	Answer selectByUserId(Integer userId);

	int updateByPrimaryKeySelective(Answer answer);

	int updateByPrimaryKey(Answer answer);

	List<Answer> findAll();
}