$(function() {
	$(".left-top.tx img").mouseenter(function() {
		$(this).next().animate({
			top: '-30px'
		}, 'fast');
	});
	$(".left-top.tx").mouseleave(function() {
		$(this).find("a").animate({
			top: '0px'
		}, 'fast');
	});
	$(".user-info .left-menu ul li a").each(function() {
		$(this).click(function() {
			$(".user-info .left-menu ul li a").removeClass();
			$(this).addClass("active");
		});
	})

	$("#password-div").click(function() {
		$(".user-info .study-div,.info-div,.problem-div").each(function() {
			$(this).removeClass("show");
		});
		$(".user-info .password-div").addClass("show");
	});
	$("#info-div").click(function() {
		$(".user-info .password-div,.study-div,.info-div,.problem-div").each(function() {
			$(this).removeClass("show");
		});
		$(".user-info .info-div").addClass("show");
	});
	$("#study-div").click(function() {
		$(".user-info .password-div,.study-div,.info-div,.problem-div").each(function() {
			$(this).removeClass("show");
		});
		$(".user-info .study-div").addClass("show");
	});
	$("#problem-div").click(function() {
		$(".user-info .password-div,.study-div,.info-div,.problem-div").each(function() {
			$(this).removeClass("show");
		});
		$(".user-info .problem-div").addClass("show");
		$.ajax({
			async : "true",
			url : "/user/answer",
			dataType : "json",
			type : "post",
			success : function(answer) {
				$("#answerTimes").val(answer.answerTimes);
				if($("#answerTimes").val()>=0){
					$("#answerTimes").next().html("同志还需努力！");
				}
				if($("#answerTimes").val()>=50){
						$("#answerTimes").next.html("哎哟，不错呦！");
				}
				if($("#answerTimes").val()>=100){
					$("#answerTimes").next().html("哎哟，不错呦！继续努力！");
				}
				
				$("#finishNumber").val(answer.finishNumber);
				if($("#finishNumber").val()>=0){
					$("#finishNumber").next().html("同志还需努力！");
				}
				if($("#finishNumber").val()>=50){
					$("#finishNumber").next().html("哎哟，不错呦！");
				}
				if($("#finishNumber").val()>=100){
					$("#finishNumber").next().html("哎哟，不错呦！继续努力！");
				}
				var rate=(answer.correctRate)*100;
				$("#correctRate").val(rate+"%");
				if(rate>=0){
					$("#correctRate").next().html("同志还需努力！");
				}if(rate>=40){
					$("#correctRate").next().html("哎哟，不错呦！");
				}if(rate>=80){
					$("#correctRate").next().html("膜拜大神！");
				}
				var n = rate/20;
				if(n==0){
					$("#star").html("<label class='glyphicon glyphicon-star-empty'></label>");
				}else{
					$("#star").html("");
					for(var i=1;i<=n;i++){
						$("#star").html($("#star").html()+"<label class='glyphicon glyphicon-star'></label>");
					}
				}
			}
		});
	});
	
	/*修改密码校验处理*/
	var bf1 = false,
		bf2 = false,
		bf3 = false;
	var pwdform = $("#pwdform");
	if($("#present_pwd").html() == "当前密码不正确，请重新修改"){
		$("#present_pwd").css("color","red");
		$("#password-div").click();
	}
	$("#present_pwd").prev().blur(function() {
		var spantext=$("#present_pwd");
		if(this.value == null||this.value.length == 0) {
			spantext.html("旧密码不能为空");
			spantext.css("color","red");
			$(this).css("border", "1px solid red");
			bf1 = false;
		} else if(this.value.length < 8 || this.value.length > 16) {
			spantext.html("旧密码长度不正确");
			$(this).css("border", "1px solid red");
			spantext.css("color","red");
			bf1 = false;
		} else {
			$(this).css("border", "1px solid green");
			bf1 = true;
			spantext.css("color","green");
			spantext.html("");
		}
	});
	$("#new_pwd").prev().blur(function() {
		var spantext=$("#new_pwd");
		if(this.value == null|| this.value.length == 0) {
			spantext.html("新密码不能为空");
			spantext.css("color","red");
			$(this).css("border", "1px solid red");
			bf2 = false;
		} else if(this.value.length < 8 || this.value.length > 16) {
			spantext.html("新密码长度不正确");
			spantext.css("color","red");
			$(this).css("border", "1px solid red");
			bf2 = false;
		} else {
			$(this).css("border", "1px solid green");
			spantext.css("color","green");
			bf2 = true;
			spantext.html("");
		}
		$("#rep_pwd").prev().blur();
	});
	$("#rep_pwd").prev().blur(function() {
		var spantext=$("#rep_pwd");
		var newpwd=$("#new_pwd").prev().val();
		if(this.value == null||this.value.length ==0 ) {
			spantext.html("重复密码不能为空");
			spantext.css("color","red");
			$(this).css("border", "1px solid red");
			bf3 = false;
		} else if($(this).val() != newpwd) {
			spantext.html("重复密码不一致");
			spantext.css("color","red");
			$(this).css("border", "1px solid red");
			bf3 = false;
		} else {
			$(this).css("border", "1px solid green");
			bf3 = true;
			spantext.html("");
			spantext.css("color","green");
		}
	});
	pwdform.submit(function() {
		return bf1 && bf2 && bf3;
	});
	/**用户信息处理***/
	var username=$(".info-div form #username").prev().val();//username
	var useremail=$(".info-div form #useremail").prev().val();//useremail
	var userage=$(".info-div form #userage").prev().val();//userage
	var userphone=$(".info-div form #userphone").prev().val();//userphone
	var sex=$(".info-div form input:radio[name='sex']:checked").val();//sex
	function closeThem(){
		$(".info-div form input").each(function(){
			$(this).attr("readonly","readonly");
		});
		$(".info-div form :radio").each(function(){
			$(this).attr("disabled","disabled");
		});		
	}
	function resetThem(){
		console.log(username+" "+useremail+" "+sex);
		$(".info-div form #username").prev().val(username);
		$(".info-div form #useremail").prev().val(useremail);
		$(".info-div form #userage").prev().val(userage);
		$(".info-div form #userphone").prev().val(userphone);
//		$(".info-div form input:radio[checked]").removeAttr("checked");
		if (sex=="0") {
			$(".info-div form input#man").prop("checked","checked");
			$(".info-div form input#woman").removeAttr("checked");
			
		} else{
			$(".info-div form input#woman").prop("checked","checked");
			$(".info-div form input#man").removeAttr("checked");		
		}
	}
	function openThem(){
		$(".info-div form input").each(function(){
			$(this).removeAttr("readonly");
		});
		$(".info-div form :radio").each(function(){
			$(this).removeAttr("disabled");
		});
	}
	closeThem();
	$(".info-div.show .main-header a").click(function(){
		if($(this).html()=="点我修改"){
			$(this).html("取消修改");
			openThem();
		}else{
			$(this).html("点我修改");
			resetThem();
			closeThem();
		}
		$(".info-div.show .main-content .info-sub").toggleClass("show");
	});
  
	
	
	/*点击显示修改头像*/
	$(".left-top.tx").find("a").click(function() {
		var h = screen.height;
		var w = screen.width;
		$(".fixed-box").css({
			"height": '' + h,
			"width": '' + w
		});
		$(".fixed-box").fadeToggle("normal");
		$(".tx-box").slideToggle("normal");
	});
	/*点击隐藏修改头像*/
	$(".tx-box .fixbox-header .icon-remove").click(function() {
		console.log(this);
		$(".tx-box").slideToggle("normal");
		$(".fixed-box").fadeToggle("normal");
	});
	/*点击隐藏修改头像*/
	$(".tx-cancel").click(function() {
		console.log(this);
		$(".tx-box").slideToggle("normal");
		$(".fixed-box").fadeToggle("normal");
	});
	/*点击选择文件*/
	$("#clickme").click(function() {
		$(":file").click();
	});


});