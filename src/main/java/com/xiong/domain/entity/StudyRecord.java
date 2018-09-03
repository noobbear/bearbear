package com.xiong.domain.entity;

/**
 * 用户学习记录
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:28:32
 */
public class StudyRecord {
	/**
	 * 学习记录id
	 */
	private Integer studyId;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 学习（记录保存）时间
	 */
	private String date;

	/**
	 *
	 */
	private String content;

	/**
	 * 上次学习的超链接
	 */
	private String contentUrl;

	/**
	 * 上次学习的路线的id
	 */
	private Integer lineId;

	/**
	 * 上次学习的路线名称
	 */
	private String lineTitle;

	/**
	 * 学习过的小节id列表 例子：3,1,5,6 表示：学习过的小节的id分别是3、1、5、6
	 */
	private String nodeIdList;

	public Integer getStudyId() {
		return studyId;
	}

	public void setStudyId(Integer studyId) {
		this.studyId = studyId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date == null ? null : date.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl == null ? null : contentUrl.trim();
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public String getLineTitle() {
		return lineTitle;
	}

	public void setLineTitle(String lineTitle) {
		this.lineTitle = lineTitle == null ? null : lineTitle.trim();
	}

	public String getNodeIdList() {
		return nodeIdList;
	}

	public void setNodeIdList(String nodeIdList) {
		this.nodeIdList = nodeIdList == null ? null : nodeIdList.trim();
	}
}