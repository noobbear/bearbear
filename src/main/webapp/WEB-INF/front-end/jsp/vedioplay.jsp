<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>视频播放-${node.nodeName}</title>
		<link rel="icon" href="bearIcon.ico"/>
		<link rel="stylesheet" type="text/css" href="/css/base.css"/>
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="/css/style.css"/>
		<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
		<style type="text/css">
			.player{
				margin-top: 60px;
			}
			#footer{
				width: 100%;
				position: fixed;
				bottom: 0;
			}
		</style>
	</head>
	<body>
		<div id="header"></div>
		<div class="container player">
			
			<div class="embed-responsive embed-responsive-16by9">
			  <iframe id="ifplayer" class="embed-responsive-item" src="${node.videoUrl}"></iframe>
			</div>
		</div>
		<div id="footer"></div>
	</body>
	<script type="text/javascript">
		$(function(){
		//$("#myPlayer").attr("src","fun.mp4");
		//$("#ifplayer").attr("src","ftp://139.199.0.48/xiong/fun.mp4");
		})
		$("#header").load('/html/header.html',function(data,status,xhr){});
		$("#footer").load('/html/footer.html',function(data,status,xhr){});
	</script>
</html>