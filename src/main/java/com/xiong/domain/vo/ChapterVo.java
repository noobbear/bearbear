package com.xiong.domain.vo;

import java.util.List;

import com.xiong.domain.entity.Node;

public class ChapterVo {
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

	/**
	 * 章节的小节
	 */
	private List<Node> nodes;

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
		this.chapterName = chapterName;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "ChapterVo [chapterId=" + chapterId + ", lineId=" + lineId + ", chapterOrder=" + chapterOrder
				+ ", nodeNum=" + nodeNum + ", chapterName=" + chapterName + ", nodes=" + nodes.toString() + "]";
	}

}
