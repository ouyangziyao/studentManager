<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,java.util.ArrayList"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>数据操作结果页面</title>
<link href="../css/stumainshare.css" rel="stylesheet" type="text/css">
<link href="../css/share.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="menu">
		<div class="menus">
		   <div id="menu1" class="menusel">
				<h2>
					<a href="#">学生成绩查找</a>
				</h2>
				<div class="position">
					<ul class="typeul">
						<li><a href="querygrades.jsp">学号查找成绩</a></li>
						<li><a href="#">名字查找成绩</a></li>
					</ul>
				</div>
				<h2 style="margin-top: 100px">
					<a href="addgrades.jsp">录入成绩</a>
				</h2>
				<h2 style="margin-top: 50px">
					<a href="updategrades.jsp">更新成绩</a>
				</h2>
				<h2 style="margin-top: 50px">
					<a href="deleteGrades.jsp">删除成绩</a>
				</h2>
				<h2 style="margin-top: 50px">
					<a href="picture.jsp">成绩柱形图</a>
				</h2>
				<h2 style="margin-top: 50px">
					<a href="form.jsp">成绩报表</a>
				</h2>
				<h2 style="margin-top: 50px">
					<a href="login.jsp">退出登录</a>
				</h2>
			</div>
			<div class="yang3">
			<%
			boolean flag = (boolean) session.getAttribute("flag");
			if(flag){
				out.println("操作成功，请在左侧导航栏进行下一步操作");
			}else{
				out.println("操作失败,请检查学号是否填错并重新操作");
			}
			%> 
			</div>
	<script type="text/javascript" src="../js/stumain.js"></script>
</body>
</html>