package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.ChapterMapper;
import com.xiong.domain.entity.Chapter;
import com.xiong.domain.service.ChapterService;

@Service
public class ChapterServiceImpl implements ChapterService {

	@Resource
	private ChapterMapper mapper;

	@Override
	public boolean update(Chapter chapter) {
		return mapper.updateByPrimaryKey(chapter) > 0;
	}

	@Override
	public List<Chapter> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<Chapter> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Chapter> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

}
