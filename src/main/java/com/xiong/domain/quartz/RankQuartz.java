package com.xiong.domain.quartz;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class RankQuartz extends QuartzJobBean {
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {

	}

}
