<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,Entity.StudentEntity"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息查询结果页面</title>
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
			<table id="table1" align="center" border="1" width="50%" cellpadding="6">
				<tr>
					<th colspan="7" align="center">查询到的学生信息</th>
				</tr>
				<tr>
					<th align="center">名字</th>
					<th align="center">学号</th>
					<th align="center">班级</th>
					<th align="center">性别</th>
					<th align="center">出生日期</th>
				</tr>
				<%
					List<StudentEntity> list = (List<StudentEntity>) request.getAttribute("list");
				if (list == null || list.size() < 1) {
					out.print("不存在 ");
				} else {
					for (StudentEntity s : list) {
				%>
				<tr align="center">
					<td><%=s.getName()%></td>
					<td><%=s.getNum()%></td>
					<td><%=s.getCla()%></td>
					<td><%=s.getSex()%></td>
					<td><%=s.getBirth()%></td>
				</tr>

				<%
					}
				}
				%>
			</table>
		</div>
	</div>
	<script type="text/javascript" src="../js/stumain.js"></script>
</body>
</html>