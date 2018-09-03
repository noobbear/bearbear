package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.StudyRecordMapper;
import com.xiong.domain.entity.StudyRecord;
import com.xiong.domain.service.StudyRecordService;

@Service
public class StudyRecordServiceImpl implements StudyRecordService {

	@Resource
	private StudyRecordMapper mapper;

	@Override
	public boolean update(StudyRecord studyRecord) {
		return mapper.updateByPrimaryKey(studyRecord) > 0;
	}

	@Override
	public List<StudyRecord> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<StudyRecord> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<StudyRecord> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

}
