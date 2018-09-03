package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.NodeMapper;
import com.xiong.domain.entity.Node;
import com.xiong.domain.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {
	@Resource
	NodeMapper mapper;

	@Override
	public List<Node> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<Node> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Node> list = mapper.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean update(Node node) {
		return mapper.updateByPrimaryKey(node) > 0;
	}
}
