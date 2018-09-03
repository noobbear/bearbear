<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>熊熊网学习平台-登录</title>
	<link rel="stylesheet" href="/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/base.css" />
	<link rel="stylesheet" href="/css/style.css" />
	<script type="text/javascript" src="/js/jquery-3.2.1.min.js" ></script>
</head>
<body>
	<div id="header"></div>
	<div class="login">
		<div class="log_form">
			<p>用户登录</p>
			<p style="color:red;font-size:12px;">${msg}</p>
			<form action="/login/login" method="post">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="账号/手机号/邮箱" name="num" value="${num}"/>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="password" placeholder="密码" />
				</div>
				<div class="form-inline">
					<div class="log_submit form-group">
						<button type="submit" class="form-control btn btn-warning"><label>登录</label></button>
					</div>
					<div class="log_reset form-group">
						<a type="reset" href="/jsp/register" class="form-control btn btn-primary"><label> 注册 </label></a>
					</div>
				</div>
			</form>
			<div class="other">
				<label>第三方登录</label>
				<div class="icon">
					<ul>
						<li>
							<a href="javascript:;" title="微信"></a>
						</li>
						<li>
							<a href="javascript:;" title="QQ"></a>
						</li>
						<li>
							<a href="javascript:;" title="新浪"></a>
						</li>
						<li>
							<a href="javascript:;" title="邮箱"></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="lg_footer">
		<p>Copyright © 2015 BearBear.com. All Rights Reserved. 广ICP备000000001号.</p>
	</div>
</body>
<script type="text/javascript">
	$("#header").load("/html/header.html",function(data,status,xhr){
		$("#logined").hide();
		$("#unlogin").show();
	});
</script>
</html>