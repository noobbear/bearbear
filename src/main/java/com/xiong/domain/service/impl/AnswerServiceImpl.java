package com.xiong.domain.service.impl;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiong.domain.MyThreadExecutor;
import com.xiong.domain.dao.AnswerMapper;
import com.xiong.domain.entity.Answer;
import com.xiong.domain.Task;
import com.xiong.domain.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {
	@Resource
	private AnswerMapper answerDao;

	@Override
	public Answer getAnswerById(String id) {
		Answer answer = answerDao.selectByPrimaryKey(Integer.parseInt(id));
		return answer;
	}

	@Override
	public String answer(String code, String input, String output) {
		ThreadPoolExecutor executor = MyThreadExecutor.getThreadExecutor();
		Future<String> f = executor.submit(new Task(code, 1000L, 10000000000L, input, output));
		try {
			return f.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FAILED";
	}

	@Override
	public List<Answer> findAll() {
		return answerDao.findAll();
	}

	@Override
	public List<Answer> findAll(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return answerDao.findAll();
	}

	@Override
	public PageInfo<?> findAllExtra(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Answer> list = answerDao.findAll();
		PageInfo<?> info = new PageInfo<>(list);
		return info;
	}

	@Override
	public boolean insertAnswer(Answer answer) {

		int i = answerDao.insert(answer);
		return i > 0;
	}

	@Override
	public boolean updateAnswer(Answer answer) {
		int i = answerDao.updateByPrimaryKey(answer);
		return i > 0;
	}

	@Override
	public Answer getAnswerByUserId(Integer id) {

		return answerDao.selectByUserId(id);
	}

}
