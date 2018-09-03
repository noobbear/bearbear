package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.Chapter;

public interface ChapterMapper {

	int deleteByPrimaryKey(Integer chapterId);

	int insert(Chapter chapter);

	int insertSelective(Chapter chapter);

	Chapter selectByPrimaryKey(Integer chapterId);

	int updateByPrimaryKeySelective(Chapter chapter);

	int updateByPrimaryKey(Chapter chapter);

	List<Chapter> findAll();

	List<Chapter> selectByLineId(Integer lineId);
}