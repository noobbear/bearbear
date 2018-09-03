package com.xiong.domain.entity;

/**
 * 用户答题记录，对应answer_record_table
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:04:07
 */
public class AnswerRecord {
	/**
	 * 主键 id
	 */
	private Integer recordId;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 题目id
	 */
	private Integer questionId;

	/**
	 * 正确答题标识，0正确，1错误
	 */
	private Integer iscorrect;

	/**
	 * 答题时间
	 */
	private String date;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getIscorrect() {
		return iscorrect;
	}

	public void setIscorrect(Integer iscorrect) {
		this.iscorrect = iscorrect;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date == null ? null : date.trim();
	}
}