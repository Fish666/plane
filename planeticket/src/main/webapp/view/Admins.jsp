<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/admins/adminsLogin.do" method="post">
      <input type="text" name="adname">账号
      <input type="password" name="adpwd">密码<br>
      <input type="submit" name="登录">
    </form>
    </div>
</body>
</html>