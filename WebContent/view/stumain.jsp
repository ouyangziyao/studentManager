<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>学生菜单页面</title>
<link href="../css/stumainshare.css" rel="stylesheet" type="text/css">
<link href="../css/stumain.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="menu">
		<div class="menus">
			<div id="menu1" class="menusel">
				<h2>
					<script type="text/javascript">var flag = 1;</script>
					<c:forEach var="u" items="${list}">
					<a href="#">${u.name}</a>同学，欢迎你！
					</c:forEach>
				</h2>
				<h2>
					<a href="#">我的成绩</a>
				</h2>
				<div class="position">
					<ul class="typeul">
						<li><a href="querygrades.jsp">学号查找成绩</a></li>
						<li><a href="#">名字查找成绩</a></li>
					</ul>
				</div>
				
				<h2 style="margin-top: 100px">
					<a href="picture.jsp">成绩柱形图</a>
				</h2>
				
				<h2 style="margin-top: 100px">
					<a href="login.jsp">退出登录</a>
				</h2>
				
			</div>
		</div>
	</div>
	<script type="text/javascript" src="../js/stumain.js"></script>
</body>
</html>