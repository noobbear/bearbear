package com.xiong.domain.entity;

/**
 * 学习路线章节，对应chapters表
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:07:47
 */
public class Chapter {
	/**
	 * 主键 章节id
	 */
	private Integer chapterId;

	/**
	 * 对应的学习路线id
	 */
	private Integer lineId;

	/**
	 * 该章节在路线中的序号
	 */
	private Integer chapterOrder;

	/**
	 * 章节中小节的数量
	 */
	private Integer nodeNum;

	/**
	 * 章节名称
	 */
	private String chapterName;

	public Integer getChapterId() {
		return chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public Integer getChapterOrder() {
		return chapterOrder;
	}

	public void setChapterOrder(Integer chapterOrder) {
		this.chapterOrder = chapterOrder;
	}

	public Integer getNodeNum() {
		return nodeNum;
	}

	public void setNodeNum(Integer nodeNum) {
		this.nodeNum = nodeNum;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName == null ? null : chapterName.trim();
	}
}