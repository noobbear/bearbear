package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Chapter;

public interface ChapterService {
	boolean update(Chapter chapter);

	List<Chapter> findAll();

	List<Chapter> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);
}
