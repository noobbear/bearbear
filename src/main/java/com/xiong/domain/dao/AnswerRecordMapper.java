package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.AnswerRecord;

public interface AnswerRecordMapper {

	int deleteByPrimaryKey(Integer answerRecordId);

	int insert(AnswerRecord answerRecord);

	int insertSelective(AnswerRecord answerRecord);

	AnswerRecord selectByPrimaryKey(Integer answerRecordId);

	int updateByPrimaryKeySelective(AnswerRecord answerRecord);

	int updateByPrimaryKey(AnswerRecord answerRecord);

	List<AnswerRecord> findAll();
}