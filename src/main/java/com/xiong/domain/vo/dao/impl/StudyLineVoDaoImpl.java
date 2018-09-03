package com.xiong.domain.vo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xiong.domain.dao.ChapterMapper;
import com.xiong.domain.dao.NodeMapper;
import com.xiong.domain.dao.StudyLineMapper;
import com.xiong.domain.entity.Chapter;
import com.xiong.domain.entity.Node;
import com.xiong.domain.entity.StudyLine;
import com.xiong.domain.vo.ChapterVo;
import com.xiong.domain.vo.StudyLineVo;
import com.xiong.domain.vo.dao.StudyLineVoDao;

@Service
public class StudyLineVoDaoImpl implements StudyLineVoDao {

	@Resource
	StudyLineMapper linedao;
	@Resource
	ChapterMapper chapterdao;
	@Resource
	NodeMapper nodedao;

	@Override
	public StudyLineVo getLine() {
		StudyLineVo studyLineVo = new StudyLineVo();
		StudyLine line = linedao.selectByPrimaryKey(1);
		studyLineVo.setLineId(line.getLineId());
		studyLineVo.setLineName(line.getLineName());
		studyLineVo.setLinePosttime(line.getLinePosttime());
		studyLineVo.setLineDescription(line.getLineDescription());
		studyLineVo.setLine_type(line.getLineType());
		List<Chapter> chapters = chapterdao.selectByLineId(line.getLineId());
		studyLineVo.setChapterNum(chapters.size());
		List<ChapterVo> chapterVos = new ArrayList<>();
		ChapterVo chapterVo = new ChapterVo();
		for (Chapter chapter : chapters) {
			chapterVo = new ChapterVo();
			// 先获取小节，放到chaptervo，然后把chaptervo放入studylinevo
			List<Node> nodes = nodedao.selectByChapterId(chapter.getChapterId());
			chapterVo.setNodeNum(nodes.size());
			chapterVo.setChapterId(chapter.getChapterId());
			chapterVo.setChapterOrder(chapter.getChapterOrder());
			chapterVo.setLineId(chapter.getLineId());
			chapterVo.setNodes(nodes);
			chapterVo.setChapterName(chapter.getChapterName());
			chapterVos.add(chapterVo);
		}
		studyLineVo.setChaptervos(chapterVos);
		studyLineVo.setChapterNum(chapterVos.size());
		return studyLineVo;
	}

}
