package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.StudyLineMapper;
import com.xiong.domain.entity.StudyLine;
import com.xiong.domain.service.StudyLineService;

@Service
public class StudyLineServiceImpl implements StudyLineService {
	@Resource
	private StudyLineMapper mapper;

	@Override
	public List<StudyLine> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<StudyLine> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<StudyLine> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean update(StudyLine studyLine) {
		return mapper.updateByPrimaryKey(studyLine) > 0;
	}
}
