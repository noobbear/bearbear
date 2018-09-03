package com.xiong.domain.entity;

/**
 * 题目 对应question_table
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:16:51
 */
public class Question {
	/**
	 * 题目id
	 */
	private Integer questionId;

	/**
	 * 题目描述
	 */
	private String questionDetail;

	/**
	 * 输入描述
	 */
	private String inputDetail;

	/**
	 * 输出描述
	 */
	private String outputDetail;

	/**
	 * 输入文件位置
	 */
	private String inputFile;

	/**
	 * 输出文件位置
	 */
	private String outputFile;

	/**
	 * 答题人称
	 */
	private Integer times;

	/**
	 * 正确答题人次
	 */
	private Integer correctTimes;

	/*
	 * 题目类型
	 */
	private String type;

	/*
	 * 题目标题
	 */
	private String questionTitle;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDetail() {
		return questionDetail;
	}

	public void setQuestionDetail(String questionDetail) {
		this.questionDetail = questionDetail;
	}

	public String getInputDetail() {
		return inputDetail;
	}

	public void setInputDetail(String inputDetail) {
		this.inputDetail = inputDetail;
	}

	public String getOutputDetail() {
		return outputDetail;
	}

	public void setOutputDetail(String outputDetail) {
		this.outputDetail = outputDetail;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Integer getCorrectTimes() {
		return correctTimes;
	}

	public void setCorrectTimes(Integer correctTimes) {
		this.correctTimes = correctTimes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

}