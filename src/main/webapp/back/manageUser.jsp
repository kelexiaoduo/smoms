<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="cn.mobilephone.shop.enity.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'manageUser.jsp' starting page</title> 
    
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
		function queryUserByName(){
			var name = $("[name=tmpName]").val();
			$.ajax({
				type:"POST",
				url:"/smoms/admin/queryUserByName.do",
				async:false,
				data:{
					'name':name
				},
				dataType:'json',
				success:function(data){
					if(data!=null){
						var res = data.result;
						$("[name=userId]").val(res.userId);
						$("[name=userName]").val(res.userName);
						$("[name=userRealName]").res(val.userRealName);
						$("[name=userPhoneNum]").res(val.userPhoneNum);
						$("[name=userSex]").val(res.userSex);
					}	
					
				}
			})
		}
		function updateUserInfo(){
			
		}
	</script>
  </head>
  
  <body> 
  	<div>
  		<span>请输入要查询的帐号：
  			<input type="text" name="tmpName">
  		</span>
  		<input type="button" value="搜索" onclick="queryUserByName()">
  	</div>	
    <table>
		<tr>		
			<th>编号</th>
			<td><input name="userId" id="edituser_uid" readonly="readonly" disabled="disabled"></td>
		</tr>
		<tr>
			<th>账号</th>
			<td><input name="userName" id="edituser_username" readonly="readonly" disabled="disabled"></td>
		</tr>
		<tr>
			<th>姓名</th>
			<td><input name="userRealName" id="edituser_name" readonly="readonly" disabled="disabled"></td>
		</tr>
		<tr>
			<th>电话</th>
			<td><input name="userPhoneNum" id="edituser_phone" readonly="readonly" disabled="disabled"></td>
		</tr>
		<tr>
			<th>性别</th>
			<td><input name="userSex" id="edituser_sex" readonly="readonly" disabled="disabled"></td>
		</tr>
		<tr>
			<td><input type="button" value="修改" name="updateUserInfo" id="update_user" onclick="javascript:updateUserInfo()" ></td>
		</tr>
	</table>
  </body>
</html>
