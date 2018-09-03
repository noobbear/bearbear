<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>new jsp</title>
			<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap-theme.css"/>
		<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap-theme.min.css"/>
		<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="/admin/css/index.css"/>
<style type="text/css">
#pagetimu-1,#pagetimu-2,#pagetimu-3 {
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
						学习路线管理 <small>Control abroad</small>
					</h1>
				</div>
				<ul class="nav nav-tabs">
					<li><a href="/admin/html/index.html">首页</a></li>
					<li><a href="/jsp/user">用户管理</a></li>
					<li><a href="/jsp/text">题库管理</a></li>
					<li class="active"><a href="#">学习路线管理</a></li>
					<li><a href="/jsp/daily">日志管理</a></li>
					<li class="disabled"><a href="#">其他</a></li>
				</ul>

				<div class="tabbable" id="tabs-402396">
					<ul class="nav nav-tabs">
						<li id="section1" class="active"><a href="#panel-1"
							data-toggle="tab">学习路线总表</a></li>
						<li id="section2"><a href="#panel-2" data-toggle="tab">章节总表</a>
						</li>
						<li id="section3"><a href="#panel-3" data-toggle="tab">小节总表</a>
						</li>
					</ul>
					<nav class="navbar navbar-default" id="check-1" role="navigation">
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a id="Tj-1" href="#">添加路线</a></li>
								<li><a id="Sc-1" href="#">删除路线</a></li>
							</ul>

							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div>
							</form>
							<button type="submit" class="btn btn-default">查询</button>
						</div>
					</nav>
					<nav class="navbar navbar-default" id="check-2" role="navigation">
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a id="Tj-2" href="#">添加章节</a></li>
								<li><a id="Sc-2" href="#">删除章节</a></li>
							</ul>

							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div>
							</form>
							<button type="submit" class="btn btn-default">查询</button>
						</div>
					</nav>
					<nav class="navbar navbar-default" id="check-3" role="navigation">
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a id="Tj-3" href="#">添加小节</a></li>
								<li><a id="Sc-3" href="#">删除小节</a></li>
							</ul>

							<form class="navbar-form navbar-left" role="search">
								<div class="form-group">
									<input type="text" class="form-control" />
								</div>
							</form>
							<button type="submit" class="btn btn-default">查询</button>
						</div>
					</nav>
					<div class="tab-content">
						<div class="tab-pane active" id="panel-1">
							<table class="table">
								<thead>
									<tr>
										<th>路线ID</th>
										<th>学习路线名称</th>
										<th>章节数量</th>
										<th>学习路线描述</th>
										<th>学习路线作者</th>
										<th>学习路线上传时间</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><strong>1</strong></td>
										<td>路线1</td>
										<td>10</td>
										<td>好</td>
										<td>小明</td>
										<td>2017/12/29</td>
										<td>
											<button id="check-01" type="submit" class="btn btn-info">修改</button>
											<button class="btn btn-danger ">删除</button>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						
					<div id="pagetimu-1">
						<ul class="pagination">
						    <li>
						      <a href="#" id="Previous">
						        <label class="glyphicon glyphicon-menu-left"></label>
						      </a>
						    </li>
						    <li><a href="#">1</a></li>
						    <li><a href="#">2</a></li>
						    <li><a href="#">3</a></li>
						    <li><a href="#">4</a></li>
						    <li><a href="#">5</a></li>
						    <li>
						      <a href="#"id="Next">
						        <label class="glyphicon glyphicon-menu-right"></label>
						      </a>
						    </li>
						  </ul>
					</div>		
						<div class="tab-pane" id="panel-2">
							<table class="table">
								<thead>
									<tr>
										<th>章节ID</th>
										<th>章节对应学习路线ID</th>
										<th>章节序号</th>
										<th>章节的小节数量</th>
										<th>章节名称</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><strong>1</strong></td>
										<td>1</td>
										<td>10</td>
										<td>20</td>
										<td>老鹰抓小鸡</td>
										<td>
											<button id="check-02" type="submit" class="btn btn-info">修改</button>
											<button class="btn btn-danger ">删除</button>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div id="pagetimu-2">
						<ul class="pagination">
						    <li>
						      <a href="#" id="Previous">
						        <label class="glyphicon glyphicon-menu-left"></label>
						      </a>
						    </li>
						    <li><a href="#">1</a></li>
						    <li><a href="#">2</a></li>
						    <li><a href="#">3</a></li>
						    <li><a href="#">4</a></li>
						    <li><a href="#">5</a></li>
						    <li>
						      <a href="#"id="Next">
						        <label class="glyphicon glyphicon-menu-right"></label>
						      </a>
						    </li>
						  </ul>
					</div>		
						<div class="tab-pane" id="panel-3">
							<table class="table">
								<thead>
									<tr>
										<th>小节ID</th>
										<th>对应的章节ID</th>
										<th>小节序号</th>
										<th>小节的视频url</th>
										<th>小节名称</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><strong>1</strong></td>
										<td>1</td>
										<td>1</td>
										<td>http:XXX.com</td>
										<td>小鸡抓老鹰</td>
										<td>
											<button id="check-03" type="submit" class="btn btn-info">修改</button>
											<button class="btn btn-danger ">删除</button>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div id="pagetimu-3">
						<ul class="pagination">
						    <li>
						      <a href="#" id="Previous">
						        <label class="glyphicon glyphicon-menu-left"></label>
						      </a>
						    </li>
						    <li><a href="#">1</a></li>
						    <li><a href="#">2</a></li>
						    <li><a href="#">3</a></li>
						    <li><a href="#">4</a></li>
						    <li><a href="#">5</a></li>
						    <li>
						      <a href="#"id="Next">
						        <label class="glyphicon glyphicon-menu-right"></label>
						      </a>
						    </li>
						  </ul>
					</div>		
						
					</div>


					

					<div class="modal fade" id="addModal-1" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">添加路线</h2>
									<form role="form">
										<div class="form-group">
											<label for="">学习路线名称</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="1">章节数量</label><input type="email"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习路线描述</label><input type="password"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习任务作者</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">添加</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="delModal-1" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">删除路线</h2>
									<form role="form">
										<div class="form-group">
											<label for="">路线ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">删除</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="checkModal-1" tabindex="-1"
						role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">学习路线信息</h2>
									<form role="form">
										<div class="form-group">
											<label for="">路线ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习路线名称</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节数量</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习路线描述</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习路线作者</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">学习路线上传时间</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">修改</button>
									</form>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal -->
					</div>

					<div class="modal fade" id="addModal-2" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">添加章节</h2>
									<form role="form">
										<div class="form-group">
											<label for="">章节对应路线ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节序号</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节的小节数量</label><input type="email"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节名称</label><input type="password"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">添加</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!--删除-->
					<div class="modal fade" id="delModal-2" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">删除章节</h2>
									<form role="form">
										<div class="form-group">
											<label for="">章节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">删除</button>
									</form>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal -->
					</div>
					<!--查询-->
					<div class="modal fade" id="checkModal-2" tabindex="-1"
						role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">章节信息</h2>
									<form role="form">
										<div class="form-group">
											<label for="">章节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节对应的学习路线ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节序号</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">对应小节序号</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">章节名称</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">修改</button>
									</form>
								</div>
							</div>
						</div>
					</div>

					<div class="modal fade" id="addModal-3" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">添加小节</h2>
									<form role="form">
										<div class="form-group">
											<label for="">对应的章节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节序号</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节视频url</label><input type="email"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节名称</label><input type="password"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">添加</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!--删除-->
					<div class="modal fade" id="delModal-3" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">删除小节</h2>
									<form role="form">
										<div class="form-group">
											<label for="">小节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">删除</button>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!--查询-->
					<div class="modal fade" id="checkModal-3" tabindex="-1"
						role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h2 align="center">小节信息</h2>
									<form role="form">
										<div class="form-group">
											<label for="">小节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">对应章节ID</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节序号</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节视频url</label><input type="text"
												class="form-control" id="" />
										</div>
										<div class="form-group">
											<label for="">小节名称</label><input type="text"
												class="form-control" id="" />
										</div>
										<button type="submit" class="btn btn-default">修改</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
				<script src="/admin/js/jquery-3.2.1.min.js" type="text/javascript"
					charset="utf-8"></script>
				<script src="/admin/js/bootstrap.min.js" type="text/javascript"
					charset="utf-8"></script>
				<script>
				$(document).ready(function() {
					$("#header").load('/admin/html/header.html',function(data,status,xhr){});
     				$("#check-2").hide();
     				$("#check-3").hide();
     				$("#pagetimu-2").hide();
     				$("#pagetimu-3").hide();
     				
				});
				
				$("#section1").click(function(){
					$(".nav-tabs li").removeClass();
					$(".tab-pane").removeClass().toggleClass("tab-pane");
					$(this).addClass("active");
					var a =$("#section1 a").attr("href");
					a=a.substring(1,a.length);
					$("#"+a).removeClass().toggleClass("tab-pane active");
					$("#check-1").show();
					$("#check-2").hide();
					$("#check-3").hide();
					$("#pagetimu-1").show();
					$("#pagetimu-2").hide();
     				$("#pagetimu-3").hide();
				});
				$("#section2").click(function(){
					$(".nav-tabs li").removeClass();
					$(".tab-pane").removeClass().toggleClass("tab-pane");
					$(this).addClass("active");
					var a =$("#section2 a").attr("href");
					a=a.substring(1,a.length);
					$("#"+a).removeClass().toggleClass("tab-pane active");
					$("#check-1").hide();
					$("#check-2").show();
					$("#check-3").hide();
					$("#pagetimu-2").show();
					$("#pagetimu-1").hide();
     				$("#pagetimu-3").hide();
				});	
				$("#section3").click(function(){
					$(".nav-tabs li").removeClass();
					$(".tab-pane").removeClass().toggleClass("tab-pane");
					$(this).addClass("active");
					var a =$("#section3 a").attr("href");
					a=a.substring(1,a.length);
					$("#"+a).removeClass().toggleClass("tab-pane active");
					$("#check-1").hide();
					$("#check-2").hide();
					$("#check-3").show();
					$("#pagetimu-3").show();
					$("#pagetimu-1").hide();
     				$("#pagetimu-2").hide();
				});		
				
				$("#Tj-1").click(function(){
					$("#addModal-1").modal();
				});
				$("#Sc-1").click(function(){
					$("#delModal-1").modal();
				});
				$("#Tj-2").click(function(){
					$("#addModal-2").modal();
				});
				$("#Sc-2").click(function(){
					$("#delModal-2").modal();
				});
				$("#Tj-3").click(function(){
					$("#addModal-3").modal();
				});
				$("#Sc-3").click(function(){
					$("#delModal-3").modal();
				});
				
				$("#check-01").click(function(){
					$("#checkModal-1").modal();
				});
				$("#check-02").click(function(){
					$("#checkModal-2").modal();
				});
				$("#check-03").click(function(){
					$("#checkModal-3").modal();
				});
			</script>
</body>
</html>