package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Question;

public interface QuestionService {
	public Question getQuestionById(String id);

	boolean update(Question question);

	List<Question> findAll();

	List<Question> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);

}
