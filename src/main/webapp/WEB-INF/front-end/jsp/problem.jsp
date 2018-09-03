<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>答题</title>
			<script type="text/javascript" src="/js/jquery.js"></script>
		<link rel="stylesheet" type="text/css" href="/css/MyList.css" />
		<link rel="stylesheet" href="/css/style.css" />
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
		<script type="text/javascript" src="/js/bootstrap.js"></script>
</head>
	<body>
		<div id="header"></div>
		<div class="container">
			<div class="answer-top">
				<div class="answer-top-title">
					<div><button class="btn btn-primary" id="pre"><label class="glyphicon glyphicon-arrow-left"></label>&nbsp;上一题</button></div>
					<h2>${question.questionTitle}</h2>
					<div><button class="btn btn-primary" id="next">下一题&nbsp;<label class="glyphicon glyphicon-arrow-right"></label></button></div>
				</div>
			</div>
			<div class="answer-body">
				<div class="answer-body-top">
					<div class="answer-limit text-center badge">
						<span class="glyphicon glyphicon-time"><h4>时间限制：400ms</h4></span>
						<span class="glyphicon glyphicon-exclamation-sign"><h4>内存限制：2mb</h4></span>
					</div>
					<div style="float:right">
						<button class="btn btn-success" data-toggle="modal" data-target="#myModal"><label class="glyphicon glyphicon-pencil"></label>&nbsp;答题</button>
					</div>
				</div>
				<div class="answer-body-body">
					<div class="answer-description">
						<div class="answer-description-title">
							<span>题目描述</span>
						</div>
						<div class="answer-description-content">
							<span>${question.questionDetail} 
							</span>
						</div>
					</div>
					<div class="answer-description">
						<div class="answer-description-title">
							<span>输入描述</span>
						</div>
						<div class="answer-description-content">
							<span>${question.inputDetail}</span>
						</div>
					</div>
					<div class="answer-description">
						<div class="answer-description-title">
							<span>输出描述</span>
						</div>
						<div class="answer-description-content">
							<span>${question.outputDetail}</span>
						</div>
					</div>
					<div class="answer-description">
						<div class="answer-description-title">
							<span>样本输入</span>
						</div>
						<div class="answer-description-content">
							<span>${question.inputFile}</span>
						</div>
					</div>

					<div class="answer-description">
						<div class="answer-description-title">
							<span>样本输出</span>
						</div>
						<div class="answer-description-content">
							<span>${question.outputFile}</span>
						</div>
					</div>

				</div>
			</div>

			<!-- 模态框（Modal） -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog" style="width:50%">
					<div class="modal-content">
						<div class="modal-header" style="padding-bottom:0">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<div class="modal-top">
								<div class="modal-top-title">
									<h2>${question.questionTitle}
									</h2>
									<h1 id="result" style="color:red"></h1>
									<div style="display: inline;float: right;" class="dropdown">
										<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" id="dropdownMenu1" style="width:80px">C&nbsp;<span class="caret"></span>
    									</button>
    									
										<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1" style="min-width:80px">
											<li style="width:80px">
												<a href="#" onclick="clickLan(this)">C</a>
											</li>
											<li style="width:80px">
												<a href="#" onclick="clickLan(this)">JAVA</a>
											</li>
										</ul>
									</div>
								</div>
							</div>
							<div class="modal-body-top">
								<div class="modal-limit">
									<span class="glyphicon glyphicon-time"><h5>时间限制：300ms</h5></span>
									<span class="glyphicon glyphicon-exclamation-sign"><h5>内存限制：2mb</h5></span>
								</div>
							</div>
						</div>
						<div class="modal-body" style="padding:0">
							<!--  <form action="/answer/answer" method="post">-->
							<textarea name="code" rows="30" cols="20" wrap="hard" style="width:100%;resize: none;" id="code">

								</textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-primary" onclick="submitCode('${question.inputFile}','${question.outputFile}',${question.questionId })">submit</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
							<!--  </form> -->
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal -->
			</div>
		</div>
		<div id="footer"></div>

		<script>
		
		    $('#myModal').on('show.bs.modal',
		    function() {
		    	$.ajax({
		    		async : "false",
		    		url : "/login/loginUser2",
		    		dataType : "json",
		    		type : "post",
		    		success : function(json) {
		    			
		    			if (json.user == null) {
		    				alert("请先登录");
		    				window.location.href="/jsp/login";
		    			}
		    		},
		    		error:function(){
		    			alert("server error");
		    		}
		    	});
		    });
	
			function submitCode(input,output,id){
							var code=$('#code').val();
							var data=new Object();
							data.code=code;
							data.input=input;
							data.output=output;
							data.id=id;
							$.ajax({
								type:'post',
								dataType:'json',
								data:data,
								url:"/answer/answer",
								success:function(data){
									alert(data.result);
									$('#result').html(data.result);
								},
								error:function(){
									alert("server error");
								}
								
							});
						
				
			}
			function clickLan(t){
				$('#dropdownMenu1').html(t.innerText+"&nbsp;<span class='caret'></span>");
			}
			$('#modal').on('showas')
			 $("textarea").on('keydown',function(e) {
                if (e.keyCode == 9) {
                    e.preventDefault();
                    var indent = '    ';
                    var start = this.selectionStart;
                    var end = this.selectionEnd;
                    var selected = window.getSelection().toString();
                    selected = indent + selected.replace(/\n/g, '\n' + indent);
                    this.value = this.value.substring(0, start) + selected
                            + this.value.substring(end);
                    this.setSelectionRange(start + indent.length, start
                            + selected.length);
                }
            });
			$("#header").load('/html/header.html',function (data, status, xhr) {});
		$("#footer").load('/html/footer.html',function (data,status,xhr) {});
		</script>

	</body>

</html>