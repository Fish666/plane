<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买机票</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/ficket/insertFicket.do">
		出发地：<input name="tstartplace"><br>
		目的地：<input name="tendplace"><br>
		舱位：<input name="tcabin"><br>
		日期：<input name="tdate"><br>
		座位：<input name="tsit"><br>
		儿童：<input name="tchidren"><br>
		幼儿：<input name="baby"><br>
		姓名：<input name="tname"><br>
		价钱：<input name="tprice"><br>
		<button>提交</button>
</body>
</html>