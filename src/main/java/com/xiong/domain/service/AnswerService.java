package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Answer;

public interface AnswerService {
	public Answer getAnswerById(String id);

	public String answer(String code, String input, String output);

	List<Answer> findAll();

	List<Answer> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);

	boolean insertAnswer(Answer answer);

	boolean updateAnswer(Answer answer);

	Answer getAnswerByUserId(Integer id);

}
