package com.xiong.domain.service;

import java.util.List;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.BooleanArraySerializer;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.AnswerRecord;

public interface AnswerRecordService {
	List<AnswerRecord> findAll();

	List<AnswerRecord> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);

	boolean insertRecord(AnswerRecord ar);
}
