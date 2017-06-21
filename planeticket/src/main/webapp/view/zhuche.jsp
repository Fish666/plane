<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<input type="button" value="查询" id="query" >
	<input type="button" value="修改" id="update">
	<input type="button" value="增加" id="add">
	<input type="button" value="删除" id="delete">
	<form action="${pageContext.request.contextPath}/user/insertUser.do">
		名字：<input name="uname"><br>
		密码：<input name="upwd"><br>
		真实姓名：<input name="urealname"><br>
		性别：<input name="usex"><br>
		年龄：<input name="uage"><br>
		生日：<input name="ubirthday"><br>
		省份证号：<input name="uidnum"><br>
		邮箱：<input name="uemail"><br>
		电话：<input name="uphone"><br>
		钱包：<input name="money_mid"><br>
		<button>提交</button><br>
</body>
</html>