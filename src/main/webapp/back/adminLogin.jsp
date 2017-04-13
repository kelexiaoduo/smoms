<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
	<head>
		<title>后台登录</title>
		<script src="../front/scripts/jquery.js" type="text/javascript"></script>
		<script src="../front/scripts/jquery.cookie.js" type="text/javascript"></script>
		<script src="../back/scripts/adminLogin.js" type="text/javascript"></script>
		<link href="../back/styles/adminLogin.css" rel="stylesheet" type="text/css"/>
		
	</head>
	
	<body>
	
		<div class="header">
			<div class="container">
				<h1>
					<a href="#"><img src="../back/images/adminLogin/logo_s.png"></a>
					<i></i>
				</h1>
			</div>
		</div>
		<div class="login" style="background: url('../back/images/adminLogin/login_bg.jpg') 0px 0px no-repeat;">
			<div class="container">
				<div class="span span-l"></div>
				<div class="span span-r" >
					<div class="form">
						<div class="mt">
							<h3>管理员登录</h3>
						</div>
						<div class="mc"> 
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon2"><i class="fa fa-user"></i> </span>
									<input type="text" name="adminName" class="form-control" placeholder="请输入账号" id="adminName" maxlength="20">
								</div>
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon2"><i class="fa fa-lock"></i> </span>
									<input type="password" name="adminPwd" class="form-control" placeholder="请输入密码" id="adminPwd" maxlength="20">
								</div>
								<div class="input-group">
									<div class="login-btn">
										<input type="submit" id="loginbtn" class="btn btn-img" tabindex="6" name="subscribe" value="登&nbsp;&nbsp;&nbsp;&nbsp;录"  onclick="javascript:checkForm()" >
									</div>
								</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="footer"></div>
		
	</body>
</html>
