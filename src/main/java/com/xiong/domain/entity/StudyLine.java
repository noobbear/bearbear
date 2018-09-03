package com.xiong.domain.entity;

/**
 * 学习路线
 * 
 * @author 广东技术师范学院 熊熊网学习平台
 * @date 2018年1月6日 上午10:24:43
 */
public class StudyLine {
	/**
	 * 学习路线id
	 */
	private Integer lineId;

	/**
	 * 学习路线名称
	 */
	private String lineName;

	/**
	 * 章节数量
	 */
	private Integer chapterNum;

	/**
	 * 学习路线描述
	 */
	private String lineDescription;

	/**
	 * 学习路线作者
	 */
	private String lineAuthor;

	/**
	 * 学习路线上传时间
	 */
	private String linePosttime;

	/**
	 * 学习路线类型
	 */
	private String lineType;

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName == null ? null : lineName.trim();
	}

	public Integer getChapterNum() {
		return chapterNum;
	}

	public void setChapterNum(Integer chapterNum) {
		this.chapterNum = chapterNum;
	}

	public String getLineDescription() {
		return lineDescription;
	}

	public void setLineDescription(String lineDescription) {
		this.lineDescription = lineDescription == null ? null : lineDescription.trim();
	}

	public String getLineAuthor() {
		return lineAuthor;
	}

	public void setLineAuthor(String lineAuthor) {
		this.lineAuthor = lineAuthor == null ? null : lineAuthor.trim();
	}

	public String getLinePosttime() {
		return linePosttime;
	}

	public void setLinePosttime(String linePosttime) {
		this.linePosttime = linePosttime == null ? null : linePosttime.trim();
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String line_type) {
		this.lineType = line_type;
	}
}