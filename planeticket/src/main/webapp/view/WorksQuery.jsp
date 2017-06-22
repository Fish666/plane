<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>机组人员信息</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
<script type="text/javascript">
$(function(){
	
	$("#query").click(function(){
		var data={
			/* curPage:$("#table").datagrid("getPager").pagination("options").pageNumber,
			   pageSize:$("#table").datagrid("getPager").pagination("options").pageSize, */
			   fendplace:$("#fe").val(),
			   fplanenum:$("#fp").val()
				
		}
		
		//发送ajax请求
		$("#table").datagrid("load",data);
	})

})
</script>
</head>
<body>
  <form id="queryForm">
   <input type="text" name="fendplace" id="fe">目的地<br>
    <input type="text" name="fplanenum" id="fp">航班号
     </form>
    <input type="submit" value="查询" id="query">
  
   <table id="table" class="easyui-datagrid"  url="${pageContext.request.contextPath}/works//queryWorks.do" pagination="true"  method="post">
		<thead>
			<tr>
				<th field="ck" checkbox="true">1</th>
				<th field="wcaptain"  width="80">机长</th>
				<th field="wairline"  width="80">空姐</th>
				
			</tr>
		</thead>
	</table> 
</body>
</html>