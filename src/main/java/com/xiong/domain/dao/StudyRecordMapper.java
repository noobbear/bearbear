package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.StudyRecord;
import com.xiong.domain.entity.User;

public interface StudyRecordMapper {

	int deleteByPrimaryKey(Integer studyRecordId);

	int insert(StudyRecord studyRecord);

	int insertSelective(StudyRecord studyRecord);

	StudyRecord selectByPrimaryKey(Integer studyRecordId);

	int updateByPrimaryKeySelective(StudyRecord studyRecord);

	int updateByPrimaryKey(StudyRecord studyRecord);

	List<StudyRecord> findAll();
}