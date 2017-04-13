<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="/smoms/back/scripts/jquery.min.js"></script>
	<script type="text/javascript">		
		function get(e){
			return document.getElementById(e);
		}
		/* window.onload=function(){
			
		} */
		var newPwd;
		var affirmPwd;
		$(function(){	
			get('warning_1').style.display='none';
			get('warning_2').style.display='none';
  			get('affirmPwd').onblur=function(){
				newPwd=get('newPwd').value;
				affirmPwd=get('affirmPwd').value;
				if(newPwd!=affirmPwd){
					get('warning_2').style.display='block';
				}
			}
			get('newPwd').onblur=function(){
				var newPwd=get('newPwd').value.length;
				if((newPwd<6&&newPwd>0)||newPwd>16){
					get('warning_1').style.display='block';
				}
			}
			get('newPwd').onfocus=function(){
				get('warning_1').style.display='none';
			}
			get('affirmPwd').onfocus=function(){
				get('warning_2').style.display='none';
			}
  		
  		})
  		
  		function modifyInfo(){
  			if((newPwd.length<6&&newPwd.length>0)||newPwd.length>16){
				alert('请重新输入密码！');
				return;
			}
			if(newPwd!=affirmPwd){
				alert('请确认密码一致！');
				return;
			}
			var adminName = get('adminName').value;
  			$.ajax({
				type:"POST",
				url:"/smoms/admin/modifyAdminInfo.do",
				async:false,
				data:{
					'adminName':adminName,
					'newPwd':newPwd
				},
				dataType:'json',
				success:function(data){
					var res = data.result;
					console.log(res);
					if(res){
						alert('修改成功');
						window.location.href='../admin/toIndex.do';
					}else{
						alert('修改失败')
					}
				}
			})
  		}
	</script>
  </head>
  	
  <body>
    <div>
    	<div class='letter'>
			帐&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:&nbsp;<input type="text" disabled="disabled" value="周杰伦" id="adminName"/>
		</div>
    	<div class='letter'>
			密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input type="password" id="newPwd"/>
			<div class='warning' id='warning_1'><span>密码长度应为‘6-16’位</span></div>
		</div>
		<div class='password'>
			确认密码:&nbsp;<input type="password" id="affirmPwd"/>
			<div class='warning' id='warning_2'><span>密码输入不一致</span></div>
		</div>
		<div>
			<input type="button" value="修改" id="modifyInfo" onclick="modifyInfo()" />
		</div>
    </div>
  </body>
</html>
