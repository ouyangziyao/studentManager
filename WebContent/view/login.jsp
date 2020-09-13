<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生成绩管理系统登录页面</title>
<link href="../css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="outer">
		<div class="inner">
		   <form action="/student_shujia2/LoginJianChaServlet" method="post">
			<table class="table" >
				<caption><h1>学生成绩管理系统</h1> </caption>
				<tr height="30px">
					<td><big><b>账&nbsp;&nbsp;号</b></big></td>
					<td><input type="text" name="uname" class="TEXT"/> </td>
				</tr>
				<tr height="30px">
					<td><big><b>密&nbsp;&nbsp;码</b></big></td>
					<td><input class="TEXT" type="password"  name="pwd"  id="password"/> </td>
				</tr>
				 <tr height="20px" >
				   <td><input type = "radio" name = "status" value = "1"> 学生 </td>
				    <td><input type = "radio" name ="status" value = "2"> 教师</td>
				 </tr>
				<tr height="30px">
					<td colspan="2" align="right">
						<input class="TEXT" type="submit" value="            登陆系统              "/>
					</td>
				</tr>
			 </table>
			</form>
		</div>
	</div>
</body>
</html>