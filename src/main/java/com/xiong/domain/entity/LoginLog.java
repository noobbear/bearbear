package com.xiong.domain.entity;

/**
 * 用户登录日志 对应login_log_table
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:11:13
 */
public class LoginLog {
	/**
	 * 日志id
	 */
	private Integer logId;

	/**
	 * 用户登录时间
	 */
	private String date;

	/**
	 * 用户id
	 */
	private Integer userId;

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date == null ? null : date.trim();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}