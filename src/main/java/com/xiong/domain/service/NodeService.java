package com.xiong.domain.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xiong.domain.entity.Node;

public interface NodeService {
	boolean update(Node node);

	List<Node> findAll();

	List<Node> findAll(Integer pageNum, Integer pageSize);

	PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize);
}
