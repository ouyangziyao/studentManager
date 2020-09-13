<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,Entity.StudentEntity"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>成绩查询结果页面</title>
<link href="../css/stumainshare.css" rel="stylesheet" type="text/css">
<link href="../css/share.css" rel="stylesheet" type="text/css">
<link href="../css/query.css" rel="stylesheet" type="text/css">
<link href="../css/queryview.css" rel="stylesheet" type="text/css">
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
			<table align="center" border="1" width="50%" cellpadding="6" >
				<tr>
					<th colspan="7" align="center" >查询到的学生成绩信息</th>
				</tr>
				<tr>
					<th>名字</th>
					<th>学号</th>
					<th>班级</th>
					<th>数学</th>
					<th>Java</th>
					<th>英语</th>
					<th>体育</th>
				</tr>
				<c:forEach var="U" items="${list}">
					<tr>
						<td>${U.num}</td>
						<td>${U.name}</td>
						<td>${U.cla}</td>
						<td>${U.math}</td>
						<td>${U.java}</td>
						<td>${U.english}</td>
						<td>${U.sport}</td>

					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<script type="text/javascript">
		var arr = new Array();
		var index = 0;
		<c:forEach items="${list}" var="lst">
		arr[index] = "${lst.num}";
		index++;
		</c:forEach>
		if(arr.length<1){
			alert("不存在");
		}
	</script>
	<script type="text/javascript" src="../js/stumain.js"></script>
</body>
</html>