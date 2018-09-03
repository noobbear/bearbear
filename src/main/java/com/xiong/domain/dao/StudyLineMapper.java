package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.StudyLine;
import com.xiong.domain.entity.User;

public interface StudyLineMapper {

	int deleteByPrimaryKey(Integer lineId);

	int insert(StudyLine studyLine);

	int insertSelective(StudyLine studyLine);

	StudyLine selectByPrimaryKey(Integer lineId);

	int updateByPrimaryKeySelective(StudyLine studyLine);

	int updateByPrimaryKey(StudyLine studyLine);

	List<StudyLine> findAll();
}