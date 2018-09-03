<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户信息</title>
		<link rel="stylesheet" href="/css/base.css" />
	<link rel="stylesheet" href="/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="/css/style.css" />
	<link rel="stylesheet" href="/css/userinfo.css" />
	<link rel="stylesheet" type="text/css" href="/font/css/font-awesome.css" />
	<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="/js/userInfo.js"></script>
</head>
	<body>
		<div id="header"></div>
		
		<div style="margin-top: 70px;" class="container">
			<div class="user-info">
				<div class="user-info left">
					<div class="left-top">
						<div class="left-top tx">
							<img src="${user.icon }" id="iicon"/>
							<a href="#">更换头像</a>
						</div>
						<span class="user-name" title="${user.username}">${user.username}</span>
					</div>
					<div class="left-menu">
						<span class="menu-title">
							账户管理
						</span>
						<ul>
							<li>
								<a href="javascript:;" id="password-div">密码设置</a>
							</li>
							<li>
								<a href="javascript:;" id="info-div"  class="active">信息设置</a>
							</li>
							<li>
								<a href="javascript:;" id="study-div">学习情况</a>
							</li>
							<li>
								<a href="javascript:;" id="problem-div">刷题情况</a>
							</li>
						</ul>
					</div>
				</div>
				<!--信息设置、学习情况、刷题情况div-->
				<div class="password-div">
					<div class="main-header">
						<span>
							密码设置
						</span>
					</div>
					<div class="main-content">
						<form id="pwdform" action="/user/changepwd" method="post">
							<ul>
								<li>
									<label>旧密码：</label>
									<input type="password" name="present_pwd" />
									<span id="present_pwd">${cpwd}</span>
								</li>
								<li>
									<label>新密码：</label>
									<input type="password" name="new_pwd" />
									<span id="new_pwd"></span>
								</li>
								<li>
									<label>重复密码：</label>
									<input type="password" name="rep_pwd" />
									<span id="rep_pwd"></span>
								</li>
								<li class="password-sub"><input type="submit" value="保存修改" /></li>
							</ul>

						</form>
					</div>
				</div>
				<div class="info-div  show">
					<div class="main-header">
						<span>
							信息设置
						</span>
						<a href="javascript:;">点我修改</a>
					</div>
					<div class="main-content">
						<form action="/user/update" method="post" onsubmit="return checkage();">
							<ul>
								<li>
									<label>昵称：</label>
									<input type="text" name="username" value="${user.username}" />
									<span id="username">
										请输入昵称
									</span>
								</li>
								<li>
									<label>邮箱：</label>
									<input type="text" name="useremail" value="${user.email}" />
									<span id="useremail">
										请输入邮箱
									</span>
								</li>
								<li>
									<label>年龄：</label>
									<input type="text" name="userage" value="${user.age}" id="ageInput"/>
									<span id="userage">
										请输入年龄
									</span>
								</li>
								<li>
									<label>手机：</label>
									<input type="text" name="userphone" value="${user.phone}" />
									<span id="userphone">
										请输入手机
									</span>
								</li>
								<li>
									<label for="man">男</label>
									<input type="radio" name="sex" value="0" <c:if test="${user.sex!='女'}">checked="true"</c:if> id="man" class="sex" />
									<label for="woman">女</label>
									<input type="radio" name="sex" value="1" <c:if test="${user.sex=='女'}">checked="true"</c:if> id="woman" class="sex" />
								</li>
								<li>
									<input type="submit" value="保存修改" class="info-sub" />
								</li>
							</ul>
						</form>
					</div>
				</div>
				<div class="study-div">
					<div class="main-header">
						<span>
							学习情况
						</span>
					</div>
					<div class="main-content">
						<span class="cls-header">
							您学习过的课程:
						</span>
						<ul>
							<li>
								<label>10天学习c语言</label>
								<div class="progress">
								  <div class="progress-bar" aria-valuemax="100" style="width: 60%;">
								    60%
								  </div>
								</div>
							</li>
							<li>
								<label>Java</label>
								<div class="progress">
								  <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
								    60%
								  </div>
								</div></i>
							</li>
						</ul>
					</div>
				</div>
				<div class="problem-div">
					<div class="main-header">
						<span>答题情况</span>
					</div>
					<div class="main-content">
						<i class="icon-lightbulb" style="font-size: 50px;color: gold;"></i>
						<ul>
							<li>
								<label>
									您总答题数：
								</label>
								<input name="times" value="0" readonly="readonly" id="answerTimes"/>
								<span>哇！看来您很勤奋</span>
							</li>
							<li>
								<label>
									您正确答题数：
								</label>
								<input name="times" value="0" readonly="readonly" id="finishNumber"/>
								<span>一个词，牛逼</span>
							</li>
							<li>
								<label>
									您的正确率：
								</label>
								<input name="times" value="0%" readonly="readonly" id="correctRate"/>
								<span>膜拜大神</span>
							</li>
							<li>
								<label>
									您的星指数是：
								</label>
								<label id="star" class="starnum" style="color: red;display: flex;flex-direction: row;">
								
								</label>
							</li>
						</ul>
						<i class="glyphicon glyphicon-thumbs-up" style="font-size: 100px;color: gold;"></i>
					</div>
				</div>
			</div>
			<!-- 头像处理      -->
			<div class="fixed-box">
				<div class="tx-box">
					<div class="fixbox-header">
						<span>
							更换头像
						</span>
						<i class="icon-remove" style="float: right;"></i>
					</div>
					<div class="fixbox-bottom">
						<!--选择了文件之后 用jq提交表单  -->
						<form action="#" method="post">
							<img src="${user.icon }" id='iconnn'/>
							<a href="javascript:;" id="clickme">点击换一张</a>
							<input type="file" id="inputfile" class="ihide" onchange="iconn(this)" name="txfile" accept="image/gif,image/jpeg,image/jpg,image/png" />
							<input type="hidden" name="userId" value="1" />
							<input type="button" class="tx-change" value="确定修改" onclick="change()"></input>
							<input type="button" class="tx-cancel" value="取消"></input>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div id="footer" style="position: absolute;bottom: 0;width: 100%;"></div>
	</body>
	<script type="text/javascript">
			$("#header").load("/html/header.html",function(data,status,xhr){
			})
			$("#footer").load("/html/footer.html",function(data,status,xhr){})
				function checkage(){
		//提交验证
		var patrn = /^[0-9]*$/;
		if(!patrn.test($(".info-div form #userage").prev().val())){
			alert("年龄不符合规则")
			return false;
		}
		return true;
	}
	</script>
	<script>
		function iconn(t){
			var oFReader = new FileReader();  
            var file = document.getElementById('inputfile').files[0];  
            oFReader.readAsDataURL(file);  
            oFReader.onloadend = function(oFRevent){  
            var src = oFRevent.target.result;   
			$('#iconnn').attr('src',src);
		}
		}
		function change(){
             var formData = new FormData();
             formData.append("myfile", document.getElementById("inputfile").files[0]);   
             $.ajax({
                 url: "/user/iconn",
                 type: "POST",
                 data: formData,
                 /**
                 *必须false才会自动加上正确的Content-Type
                 */
                 contentType: false,
                 /**
                 * 必须false才会避开jQuery对 formdata 的默认处理
                 * XMLHttpRequest会对 formdata 进行正确的处理
                 */
                 processData: false,
                 success: function (data) {
                   
                         alert("上传成功！");
                   
                    	$('#iicon').attr('src',data);
                     
                 },
                 error: function () {
                     alert("上传失败！");
                     $("#imgWait").hide();
                 }
             });
		}
	</script>

</html>