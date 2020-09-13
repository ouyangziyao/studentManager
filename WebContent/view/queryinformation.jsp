<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,Entity.StudentEntity"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息查询页面</title>
<link href="../css/stumainshare.css" rel="stylesheet" type="text/css">
<link href="../css/stumain.css" rel="stylesheet" type="text/css">
<link href="../css/query.css" rel="stylesheet" type="text/css">
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
			<form class="yang" action="/student_shujia2/NumQueryInformationServlet">
				学号查找&nbsp;&nbsp;&nbsp;<input type="text" name="number"
					style="height: 25px; width: 200px;"> <input type="submit"
					value="确定" style="height: 20px; width: 30px">&nbsp;&nbsp;&nbsp;
			</form>
		</div>
	</div>
	
	<script type="text/javascript" src="../js/stumain.js"></script>
</body>
</html>