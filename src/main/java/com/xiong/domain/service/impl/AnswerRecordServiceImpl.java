package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.AnswerRecordMapper;
import com.xiong.domain.entity.AnswerRecord;
import com.xiong.domain.service.AnswerRecordService;

@Service
public class AnswerRecordServiceImpl implements AnswerRecordService {

	@Resource
	private AnswerRecordMapper mapper;

	@Override
	public List<AnswerRecord> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<AnswerRecord> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<AnswerRecord> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean insertRecord(AnswerRecord ar) {
		int i = mapper.insert(ar);
		return i > 0;
	}

}
