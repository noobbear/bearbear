package com.xiong.domain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.dao.QuestionMapper;
import com.xiong.domain.dao.StudyLineMapper;
import com.xiong.domain.entity.Question;
import com.xiong.domain.entity.StudyLine;
import com.xiong.domain.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Resource
	private QuestionMapper questionDao;

	@Override
	public Question getQuestionById(String id) {
		Question question = questionDao.selectByPrimaryKey(Integer.parseInt(id));
		return question;
	}

	@Override
	public List<Question> findAll() {
		return questionDao.findAll();
	}

	@Override
	public List<Question> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return questionDao.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Question> list = questionDao.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean update(Question question) {
		return questionDao.updateByPrimaryKey(question) > 0;
	}
}
