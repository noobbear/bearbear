package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.Question;

public interface QuestionMapper {

	int deleteByPrimaryKey(Integer questionId);

	int insert(Question question);

	int insertSelective(Question question);

	Question selectByPrimaryKey(Integer questionId);

	int updateByPrimaryKeySelective(Question question);

	int updateByPrimaryKey(Question question);

	List<Question> findAll();
}