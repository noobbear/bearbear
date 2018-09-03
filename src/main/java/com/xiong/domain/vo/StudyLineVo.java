package com.xiong.domain.vo;

import java.util.List;

public class StudyLineVo {
	/**
	 * 学习路线id
	 */
	private Integer lineId;

	/**
	 * 学习路线类型
	 */
	private String line_type;

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
	 * 学习路线的章节
	 */
	private List<ChapterVo> chaptervos;

	public Integer getLineId() {
		return lineId;
	}

	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}

	public String getLine_type() {
		return line_type;
	}

	public void setLine_type(String line_type) {
		this.line_type = line_type;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
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
		this.lineDescription = lineDescription;
	}

	public String getLineAuthor() {
		return lineAuthor;
	}

	public void setLineAuthor(String lineAuthor) {
		this.lineAuthor = lineAuthor;
	}

	public String getLinePosttime() {
		return linePosttime;
	}

	public void setLinePosttime(String linePosttime) {
		this.linePosttime = linePosttime;
	}

	public List<ChapterVo> getChaptervos() {
		return chaptervos;
	}

	public void setChaptervos(List<ChapterVo> chaptervos) {
		this.chaptervos = chaptervos;
	}

	@Override
	public String toString() {
		return "StudyLineVo [lineId=" + lineId + ", line_type=" + line_type + ", lineName=" + lineName + ", chapterNum="
				+ chapterNum + ", lineDescription=" + lineDescription + ", lineAuthor=" + lineAuthor + ", linePosttime="
				+ linePosttime + ", chaptervos=" + chaptervos.toString() + "]";
	}

}
