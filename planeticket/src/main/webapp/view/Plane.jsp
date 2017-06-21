<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>航班信息</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/plane/insertPlane.do" >
<!-- 	出发时间 到达时间 出发地，目的地 航班号 每个舱座位数量 机票数量 航空公司
 -->		
 		航班号：<input name="fplanenum"><br>
		出发时间：<input name="fstartdate" type="date"><br>
		价钱：<input name="fprice"><br>
		出发地：<input name="fstartplace"><br>
		目的地：
		<select name="fendplace"> 
		<option value="北京">北京</option> 
		<option value="上海">上海</option>
		<option value="拉萨">拉萨</option> 
		<option value="海南">海南</option>  
		</select> <br>
		到达时间：<input name="fenddate" type="date"><br>
		
		公司名称：
		<label><input name="fcompany" type="radio" value="北部航空 " />北部航空 </label> 
		<label><input name="fcompany" type="radio" value="南部航空" />南部航空 </label> <br>
		座位数量：
		<label><input name="fsitcount" type="radio" value="300" />300 </label> 
		<label><input name="fsitcount" type="radio" value="200" />200</label> 
		<label><input name="fsitcount" type="radio" value="100" />100 </label> <br>
		<button>提交</button>
		</form>
</body>
</html>