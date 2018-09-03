<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>题库</title>
<style>
#check-timuleft {
	width: 200px;
	float: left;
}
</style>
</head>
<link rel="stylesheet" href="/css/bootstrap.css" />
<link rel="stylesheet" href="/css/base.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />
<script src="/js/bootstrap.min.js" type="text/javascript"
	charset="utf-8"></script>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
	<body>
		<div id="header"></div>
		<div style="margin-top: 60px;height: 745px;" class="container">			
			<div class="row clearfix">
				<div class="col-xs-8 column">									
					
					<table class="table table-striped" id="status_table">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									题目PID
								</th>
								<th>
									是否通过
								</th>
								
								<th>
									时间
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${records}" var="re">
							<tr>
								<td>
									${re.recordId}
								</td>
								<td>
									<a href="/answer/index?id=${re.questionId}" >${re.questionId}</a>
								</td>
								<td>
									<c:if test="${re.iscorrect==0 }">正确</c:if>
									<c:if test="${re.iscorrect==1 }">错误</c:if> 
								</td>
								
								<td>
									${re.date}
								</td>
							</tr>	
							</c:forEach>
						</tbody>
					</table>					
<!--------------------------------------------------------------------------------------------------------------------------->
<!--------------------------------------------------------------------------------------------------------------------------->	
<!--------------------------------------------------------------------------------------------------------------------------->																	
					<div id="pagestatus">
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
						    <li><a href="#">6</a></li>
						    <li>
						      <a href="#"id="Next">
						        <label class="glyphicon glyphicon-menu-right"></label>
						      </a>
						    </li>
						  </ul>
					</div>
					
				</div>
				<div class="col-xs-4 column">
					<div class="panel-group" id="panel-376353">
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">全部题型</a>
							</div>
							<div class="panel-collapse collapse in">
								<div class="panel-body">
									<a href="/question/index" id="timu">题目</a>
								</div>
								<div class="panel-body">
									<a href="/answer/getRecords" id="status">状态</a>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">字符串</a>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">数组</a>
							</div>							
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">函数</a>
							</div>							
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">指针</a>
							</div>							
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">排序</a>
							</div>							
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">回溯法</a>
							</div>							
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">
								<a class="panel-title">穷举法</a>
							</div>							
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="footer"></div>
	</body>
	
	<script>
		
		
		$("#header").load('/html/header.html',function(data,status,xhr){});
		$("#footer").load('/html/footer.html',function(data,status,xhr){});
		//默认全部关闭
		$(".panel-body").each(function(){
			$(this).slideUp();
		});
		$(".panel-heading .panel-title").each(function(){
			$(this).click(function(){
				//隐藏所有
					$(".panel-body").each(function(){
						$(this).slideUp();
					});
				$(this).parent().siblings().children().slideToggle();//自身隐藏或显示
				
				
			})
		});
					
			
        $("#status_table tr:even").css("background-color", "#37e95233");
	</script>
	
</html>