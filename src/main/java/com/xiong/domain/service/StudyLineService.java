package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.StudyLine;

public interface StudyLineService {
	boolean update(StudyLine studyLine);

	List<StudyLine> findAll();

	List<StudyLine> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);
}
