<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="icon" href="/images/bearIcon.ico"/>
	<title>学习页面</title>
	<link rel="stylesheet" href="/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/base.css" />
	<link rel="stylesheet" href="/css/style.css" />
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
	<div id="header"></div>
	<div class="banner" style="background-image: url(/images/bg_1.jpg);">
			<div class="sdy_pad container">
				<h1 class="sdy_title">HTML/CSS</h1>
				<p>学习路线的介绍</p>
				<div class="start">
					<button class="btn btn-success btn-lg" id="btn_start">
						<p>开始学习</p>
						<span>&nbsp;|&nbsp;&nbsp;</span>
						<label class="glyphicon glyphicon-star-empty">							
						</label>						
					</button>
				</div>
			</div>
	</div>
	<div class="sdy_container">
		<div class="sdy_main">
			<p class="sdy_intro">
				<label>简介</label>：帮助开发者在Android Studio中快速开发C
				（或C++）的动态库，并能自动将so和java应用一起打
				包成apk。包括方法签名的学习，以及常见异常的分析和
			处理
			</p>
			<ul class="sdy_nav nav nav-tabs nav-justified">
				<!--标签页-->
			  <li role="presentation" class="active"><a href="#">章节</a></li>
			  <li role="presentation"><a href="#">评论</a></li>
			  <li role="presentation"><a href="#">笔记</a></li>
			</ul>
			<div class="sdy_chapter">
				<div class="panel panel-info">
				<c:forEach items="${js.chaptervos}" var="j">
					<div class="panel-heading">
						${j.chapterName}
					</div>
					<c:forEach items="${j.nodes}" var="node">
					<div class="panel-body">
						${node.nodeName}&nbsp;<label class="glyphicon glyphicon-exclamation-sign"></label>
						<a class="sdy-play btn btn-danger" href="/video/play?id=${node.nodeId}">播放</a>
					</div>
					</c:forEach>
				</c:forEach>
	
				</div>
			</div>
		</div>
		<div class="right_container">
			<div class="sdy_download">
				<div class="download_container">
					<div class="sourcename"><label>10天学习C语言</label></div>
					<button class="btn btn-primary loaddown">立即下载</button>
				</div>
			</div>
		</div>
	</div>
		<div id="footer"></div>
</body>
<script type="text/javascript">
			$("#btn_start").click(function(){
						$("#btn_start label").removeClass("glyphicon-star-empty").addClass("glyphicon-star");
						$("#btn_start p").html("继续学习");
					});
			$("#header").load('/html/header.html',function (data, status, xhr) {});
			$("#footer").load('/html/footer.html',function(data,status,xhr){});
</script>
</html>