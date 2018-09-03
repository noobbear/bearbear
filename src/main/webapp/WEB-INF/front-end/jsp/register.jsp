<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/base.css" />
<link rel="stylesheet" href="/css/style.css" />
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<div id="header"></div>
	<div class="register">
		<div class="rgst_form">
			<p>帐号注册-快速登录</p>
			<p style="color:red;font-size:12px;">${error}</p>
			<form action="/user/regist" method="post" onsubmit="return check();">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="账号" id="usernum" name="usernum" value="${usernum}"/>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" placeholder="密码" name="password" id="password"/>
				</div>
				<div class="form-inline">
					<div class="rgst_submit form-group">
						<button type="submit" class="form-control btn btn-warning">
							<label>注册</label>
						</button>
					</div>
					<div class="rgst_reset form-group">
						<button type="reset" class="form-control btn-primary" id="reset">
							<label>重置</label>
						</button>
					</div>
				</div>
			</form>
			<div class="other">
				<label>第三方登录</label>
				<div class="icon">
					<ul>
						<li><a href="javascript:;" title="微信"></a></li>
						<li><a href="javascript:;" title="QQ"></a></li>
						<li><a href="javascript:;" title="新浪"></a></li>
						<li><a href="javascript:;" title="邮箱"></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="rg_footer">
		<p>Copyright © 2015 BearBear.com. All Rights Reserved.
			广ICP备000000001号.</p>
	</div>
</body>
<script type="text/javascript">
	$("#header").load("/html/header.html", function(data, status, xhr) {
		<!--$("#Islogin").hide();-->
	});
	function check(){
		var num=$("#usernum").val();
		var pwd=$("#password").val();
		console.log(num.length+" -- "+pwd.length);
		if(num.length<8||num.length>16){
			alert("帐号长度为8-16个字符");
			return false;
		}
		if(pwd.length<8||pwd.length>16){
			alert("密码长度为8-16个字符");
			return false;
		}
		return true;
	}
	$(function(){
		$("#reset").click(function(){
			$("#usernum").val("");
			$("#password").val("");
		});
	});
</script>
</html>
