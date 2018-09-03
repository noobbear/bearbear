package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.StudyRecord;

public interface StudyRecordService {
	boolean update(StudyRecord studyRecord);

	List<StudyRecord> findAll();

	List<StudyRecord> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);
}
