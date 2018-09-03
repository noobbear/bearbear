package com.xiong.domain.entity;

/**
 * 用户答题情况，对应answer_table
 * 
 * @author 广东技术师范学院 15软件工程 熊熊网学习平台
 * @date 2018年1月6日 上午9:56:28
 */
public class Answer {
	/**
	 * 主键-id
	 */
	private Integer answerId;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 用户答题次数
	 */
	private Integer answerTimes;

	/**
	 * 用户完成数量
	 */
	private Integer finishNumber;

	/**
	 * 用户正确率
	 */
	private Double correctRate;

	/**
	 * 用户排名
	 */
	private Integer place;

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAnswerTimes() {
		return answerTimes;
	}

	public void setAnswerTimes(Integer answerTimes) {
		this.answerTimes = answerTimes;
	}

	public Integer getFinishNumber() {
		return finishNumber;
	}

	public void setFinishNumber(Integer finishNumber) {
		this.finishNumber = finishNumber;
	}

	public Double getCorrectRate() {
		return correctRate;
	}

	public void setCorrectRate(Double correctRate) {
		this.correctRate = correctRate;
	}

	public Integer getPlace() {
		return place;
	}

	public void setPlace(Integer place) {
		this.place = place;
	}
}