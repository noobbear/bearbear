package com.xiong.domain.entity;

/**
 * 学习路线对应的章节的小节
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:13:26
 */
public class Node {
	/**
	 * 主键 小节id
	 */
	private Integer nodeId;

	/**
	 * 小节对应的章节的id
	 */
	private Integer chapterId;

	/**
	 * 该小节在对应章节中的序号
	 */
	private Integer nodeOrder;

	/**
	 * 视频url
	 */
	private String videoUrl;

	/**
	 * 小节名称
	 */
	private String nodeName;

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getChapterId() {
		return chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}

	public Integer getNodeOrder() {
		return nodeOrder;
	}

	public void setNodeOrder(Integer nodeOrder) {
		this.nodeOrder = nodeOrder;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl == null ? null : videoUrl.trim();
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName == null ? null : nodeName.trim();
	}
}