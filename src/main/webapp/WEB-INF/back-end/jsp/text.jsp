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
<style type="text/css">
#pageText {
	display: flex;
	flex-direction: row;
	justify-content: center;
}
</style>
</head>
<body>
	<div id="header"></div>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div id="Bt" class="page-header">
					<h1>
						题库管理 <small>Control abroad</small>
					</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="/admin/html/index.html">首页</a></li>
					<li><a href="/manager/users">用户管理</a></li>
					<li class="active"><a href="#">题库管理</a></li>
					<li><a href="/jsp/learn">学习路线管理</a></li>
					<li><a href="/log/llog">日志管理</a></li>
					<li class="disabled"><a href="#">其他</a></li>
				</ul>
			</div>
		</div>
		<nav class="navbar navbar-default" role="navigation">

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a id="Tj" href="#">添加题目</a></li>
				<li><a id="Sc" href="#">删除题目</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" />
				</div>
			</form>
			<button type="submit" class="btn btn-default">查询</button>
		</div>
		</nav>
		<table class="table">
			<thead>
				<tr>
					<th>题目ID</th>
					<th>题目类型</th>
					<th>题目标题</th>
					<th>答题人次</th>
					<th>正确答题人次</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${qs}" var="q">
				<tr>
					<td><strong>${q.questionId}</strong></td>
					<td>${q.type}</td>
					<td>${q.questionTitle}</td>
					<td>${q.times}</td>
					<td>${q.correctTimes}</td>
					<td>
						<button id="check" type="submit" class="btn btn-info">修改</button>
						<button class="btn btn-danger ">删除</button>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>

		<div id="pageText">
			<ul class="pagination">
				<li><a href="/manager/users?PageNo=1" id="Previous"
					title="第一页"> <label class="glyphicon glyphicon-menu-left"></label>
				</a></li>
				<li><a href="/questionManager/index?PageNo=${current-1}">pre</a></li>
				<li><a href="/questionManager/index?PageNo=${current}">${current}</a></li>
				<li><a href="/questionManager/index?PageNo=${current+1}">next</a></li>
				<li><a href="/questionManager/index?PageNo=${last}" id="Next"
					title="最后一页"> <label class="glyphicon glyphicon-menu-right"></label>
				</a></li>
			</ul>
		</div>




		<div class="modal fade" id="addModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h2 align="center">添加题目</h2>
						<form role="form">
							<div class="form-group">
								<label for="">题目类型</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">题目标题</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">题目描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输入描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输出描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输入文件位置</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输出文件位置</label><input type="text"
									class="form-control" id="" />
							</div>
							<button type="submit" class="btn btn-default">添加</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!--删除-->
		<div class="modal fade" id="delModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h2 align="center">删除题目</h2>
						<form role="form">
							<div class="form-group">
								<label for="">题目ID</label><input type="text"
									class="form-control" id="" />
							</div>
							<button type="submit" class="btn btn-default">删除</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!--查询-->
		<div class="modal fade" id="checkModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h2 align="center">题目信息</h2>
						<form role="form">
							<div class="form-group">
								<label for="">题目ID</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">题目描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输入描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输出描述</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输入文件位置</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">输出文件位置</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">答题人次</label><input type="text"
									class="form-control" id="" />
							</div>
							<div class="form-group">
								<label for="">正确答题人次</label><input type="text"
									class="form-control" id="" />
							</div>
							<button type="submit" class="btn btn-default">修改</button>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
	<script type="text/javascript" src="/admin/js/jquery-3.2.1.min.js"></script>
	<script src="/admin/js/bootstrap.min.js" type="text/javascript"
		charset="utf-8"></script>
	<script>
		$("#header").load('/admin/html/header.html',
				function(data, status, xhr) {
				});
		$("#Tj").click(function() {
			$("#addModal").modal();
		});
		$("#Sc").click(function() {
			$("#delModal").modal();
		});
		$("#check").click(function() {
			$("#checkModal").modal();
		});
	</script>
</body>
</html>