<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!--<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">-->
	<title>熊熊网学习平台</title>
	<link rel="icon" href="/images/bearIcon.ico"/>
	<link rel="stylesheet" href="/css/bootstrap.css"/>
	<link rel="stylesheet" href="/css/base.css"/>
	<link rel="stylesheet" href="/css/header.css"/>
	<link rel="stylesheet" type="text/css" href="/css/style.css"/>
	<script type="text/javascript" src="/js/jquery-3.2.1.min.js">
	</script>
</head>
<body>
	<div id="header"></div>
	<div>
		<div class="banner">
			<div class="banImg">
				<ul>
				<li><img src="/images/bg_1.jpg"/></li>
				<li><img src="/images/bg_2.jpg"/></li>
				<li><img src="/images/bg_3.jpg"/></li>
				<li><img src="/images/bg_4.jpg"/></li>
				<li><img src="/images/bg_5.jpg"/></li>
				</ul>
			</div>
			<div class="odinTro">
				<ul>
					<li>
						<div class="container">
							<h1>HTML</h1>
							<div>
								<p>超文本标记语言（英语：HyperText Markup Language，简称：HTML）是一种用于创建网页的标准标记语言。</p>
								<p>您可以使用 HTML 来建立自己的 WEB 站点，HTML 运行在浏览器上，由浏览器来解析。</p>
								<p>在本教程中，您将学习如何使用 HTML 来创建站点。HTML 很容易学习！相信您能很快学会它！</p>
							</div>
							  <p><a class="btn btn-primary btn-lg" href="#">开始学习</a></p>
						</div>
					</li>
					<li>
						<div class="container"> 
							<h1>JavaScript</h1>
								<p>JavaScript 是 Web 的编程语言。</p>
								<p>所有现代的 HTML 页面都使用 JavaScript。
								<p>JavaScript 非常容易学。
								<p>本教程将教你学习从初级到高级JavaScript知识。</p>
								
							  <p><a class="btn btn-primary btn-lg" href="/study/javascript">开始学习</a></p>
						</div>
					</li>
					<li>
						<div class="container">
							<h1>php</h1>
							  <p>PHP 是一种创建动态交互性站点的强有力的服务器端脚本语言。</p>
							  <p>PHP 是免费的，并且使用非常广泛。同时，对于像微软 ASP 这样的竞争者来说，PHP 无疑是另一种高效率的选项。</p>
							  <p><a class="btn btn-primary btn-lg" href="#">开始学习</a></p>
						</div>
					</li>
					<li>
						<div class="container">
							<h1>SQL</h1>
							  <p>
								SQL 是用于访问和处理数据库的标准的计算机语言。
								</p>
								<p>在本教程中，您将学到如何使用 SQL 访问和处理数据系统中的数据，这类数据库包括：MySQL、SQL Server、Access、Oracle、Sybase、DB2 等等。</p>
							  <p><a class="btn btn-primary btn-lg" href="#">开始学习</a></p>
						</div>
					</li>
					<li>
						<div class="container">
							<h1>JAVA</h1>
							  <p>Java 是由Sun Microsystems公司于1995年5月推出的高级程序设计语言。</p>
							  <p>Java可运行于多个平台，如Windows, Mac OS，及其他多种UNIX版本的系统。</p>
							  <p>本教程通过简单的实例将让大家更好的了解JAVA编程语言。</p>
							  <p><a class="btn btn-primary btn-lg" href="#">开始学习</a></p>
						</div>
					</li>
				</ul>
			</div>
			<div class="order">
				<ol>
					<li class="active"></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ol>
			</div>
	</div>
	<div class="major_intro">
		<div class="introTitle">
			<h1>有趣、轻松的学习编程，让你收获更多！</h1>
			<p>学习你喜欢的精彩课程</p>
		</div>
		<div class="majLogo">
			<ul class="logolist">
				<li><a href="#"><img src="/images/html.png" alt=""></a></li>
				<li><a href="#"><img src="/images/javascript.png" alt=""></a></li>
				<li><a href="#"><img src="/images/php.png" alt=""></a></li>
				<li><a href="#"><img src="/images/sql.png" alt=""></a></li>
				<li><a href="#"><img src="/images/java.png" alt=""></a></li>
			</ul>
		</div>
	</div>
	<div class="range">
			<div class="range_last">
				<div class="range_title">
					<label>最新排名&nbsp;&nbsp;</label>
					<a href="#">查看更多</a>
				</div>
				<div class="range_table">
					<table class="table table-striped">
						<tr class="success">
							<th>名次</th>
							<th>昵称</th>
							<th>分数</th>
							<th>题数</th>
						</tr>
						<tr>
							<td>1</td>
							<td>sb</td>
							<td>10</td>
							<td>1</td>
						</tr>
						<tr>
							<td>2</td>
							<td>sb</td>
							<td>20</td>
							<td>1</td>
						</tr>
						<tr>
							<td>3</td>
							<td>sb</td>
							<td>30</td>
							<td>1</td>
						</tr>
					</table>
					
				</div>
				<div style="margin-left: 10px;">
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

		</div>
	<!--<div style="width: 100px;height: 103px;"></div>-->
	</div>
	<div id="footer"></div>
</body>
	<script type="text/javascript">
		$("#header").load('/html/header.html',function(data,status,xhr){
			

		});
		$(".order ol li").mouseenter(function(){
			$(this).addClass("active")
			.siblings()
			.removeClass("active");
			$(".odinTro ul li").eq($(this).index())
			.fadeIn("fast")
			.siblings().fadeOut();
			$(".banImg ul li").eq($(this).index())
			.fadeIn("fast")
			.siblings().fadeOut();
		});
		$(".logolist li img").mouseenter(function(){
			$(this).animate({
				width:'120px',
				height:'120px'
			});
		})
		$(".logolist li img").mouseout(function(){
			$(this).animate({
				width:'60px',
				height:'60px'
			});
		})
	$("#footer").load('/html/footer.html',function(data,status,xhr){});
	</script>
</html>