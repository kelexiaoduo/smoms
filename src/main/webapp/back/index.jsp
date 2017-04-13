<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>后台管理员主页</title>
        <link type="text/css" rel="stylesheet" media="all" href="../back/styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../back/styles/global_color.css" /> 
    </head>
    <body class="index">
        <!--导航区域开始-->
        <div id="index_navi">
        <ul id="menu">
			<!-- 产品管理（产品上架、下架、修改） -->
		    <li>产品管理<a href="../admin/managePhone.do"  class="manage_phone"></a></li>
		    <!-- 用户信息的管理修改 -->
		    <li>用户管理<a href="../admin/manageUser.do" class="manage_user"></a></li>
		    <!-- 自己信息的修改 -->
		    <li>修改密码<a href="../admin/modifyInf.do" class="modify_inf"></a></li>
		    <!-- 文章信息的管理（增加、、删除、修改） -->
		    <li>文章管理<a href="../admin/manageArticle.do" class="manage_article"></a></li>
		    <!-- 订单信息的管理（未发货订单、已发货订单修改） -->
		    <li>订单管理<a href="../admin/manageOrders.do" class="manage_orders"></a></li>
		    <!-- 退出登陆 -->
		    <li>退出<a href="../admin/loginOut.do" class="login_out"></a></li>
		</ul>
        </div>
    </body>
</html>
