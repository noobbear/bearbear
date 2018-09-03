<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>new jsp</title>
<link rel="stylesheet" type="text/css"
	href="/admin/css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css"
	href="/admin/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="/admin/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/admin/css/index.css" />
<script src="/admin/js/jquery-3.2.1.js" type="text/javascript"
	charset="utf-8"></script>
</head>
<body>
	<div id="header"></div>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div id="Bt" class="page-header">
					<h1>
						日志管理 <small>Control abroad</small>
					</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="/admin/html/index.html">首页</a></li>
					<li><a href="/jsp/user">用户管理</a></li>
					<li><a href="/jsp/text">题库管理</a></li>
					<li><a href="/jsp/learn">学习路线管理</a></li>
					<li class="active"><a href="#">日志管理</a></li>
					<li class="disabled"><a href="#">其他</a></li>
				</ul>
			</div>
		</div>

		<div class="tabbable" id="tabs-402396">
			<ul class="nav nav-tabs">
				<li id="section1" class="active"><a href="#panel-1"
					data-toggle="tab">用户登录日志</a></li>
				<li id="section2"><a href="#panel-2" data-toggle="tab">用户答题情况</a>
				</li>
				<li id="section3"><a href="#panel-3" data-toggle="tab">用户答题记录</a>
				</li>
				<li id="section4"><a href="#panel-4" data-toggle="tab">用户学习记录</a>
				</li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="panel-1">
					<table class="table">
						<thead>
							<tr>
								<th>日志ID</th>
								<th>登录时间</th>
								<th>用户ID</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ll}" var="l">
							<tr>
								<td><strong>${l.logId}</strong></td>
								<td>${l.date}</td>
								<td>${l.userId}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="tab-pane" id="panel-2">
					<table class="table">
						<thead>
							<tr>
								<th>答题ID</th>
								<th>用户名ID</th>
								<th>答题次数</th>
								<th>完成数量</th>
								<th>正确率</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><strong>1</strong></td>
								<td>1</td>
								<td>10</td>
								<td>20</td>
								<td>100%</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="tab-pane" id="panel-3">
					<table class="table">
						<thead>
							<tr>
								<th>记录ID</th>
								<th>用户名ID</th>
								<th>题目ID</th>
								<th>是否正确</th>
								<th>时间</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><strong>1</strong></td>
								<td>1</td>
								<td>1</td>
								<td>Y</td>
								<td>2017/12/28</td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="tab-pane" id="panel-4">
					<table class="table">
						<thead>
							<tr>
								<th>记录ID</th>
								<th>用户名ID</th>
								<th>时间</th>
								<th>学习内容</th>
								<th>上次学习的超链接</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><strong>1</strong></td>
								<td>1</td>
								<td>2017/12/28</td>
								<td>Java</td>
								<td>http:XXX.com</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="change">
				<a class="change-left" href="/log/llog?PageNo=${current-1}" ></a>
				<a class="change-right" href="/log/llog?PageNo=${current+1}"></a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$("#header").load('/admin/html/header.html', function(data, status, xhr) {
	});
</script>
<script>
	$("#section1").click(function() {
		$(".nav-tabs li").removeClass();
		$(".tab-pane").removeClass().toggleClass("tab-pane");
		$(this).addClass("active");
		var a = $("#section1 a").attr("href");
		a = a.substring(1, a.length);
		$("#" + a).removeClass().toggleClass("tab-pane active");
	});
	$("#section2").click(function() {
		$(".nav-tabs li").removeClass();
		$(".tab-pane").removeClass().toggleClass("tab-pane");
		$(this).addClass("active");
		var a = $("#section2 a").attr("href");
		a = a.substring(1, a.length);
		$("#" + a).removeClass().toggleClass("tab-pane active");
	});
	$("#section3").click(function() {
		$(".nav-tabs li").removeClass();
		$(".tab-pane").removeClass().toggleClass("tab-pane");
		$(this).addClass("active");
		var a = $("#section3 a").attr("href");
		a = a.substring(1, a.length);
		$("#" + a).removeClass().toggleClass("tab-pane active");
	});
	$("#section4").click(function() {
		$(".nav-tabs li").removeClass();
		$(".tab-pane").removeClass().toggleClass("tab-pane");
		$(this).addClass("active");
		var a = $("#section4 a").attr("href");
		a = a.substring(1, a.length);
		$("#" + a).removeClass().toggleClass("tab-pane active");
	});
	

</script>

</html>
