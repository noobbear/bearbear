package com.xiong.domain.dao;

import java.util.List;

import com.xiong.domain.entity.Node;

public interface NodeMapper {

	int deleteByPrimaryKey(Integer nodeId);

	int insert(Node node);

	int insertSelective(Node node);

	Node selectByPrimaryKey(Integer nodeId);

	int updateByPrimaryKeySelective(Node node);

	int updateByPrimaryKey(Node node);

	List<Node> findAll();

	List<Node> selectByChapterId(Integer chapterId);
}