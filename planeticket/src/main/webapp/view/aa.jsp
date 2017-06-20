<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>航班管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/default/easyui.css">
<link  rel="stylesheet" href="${pageContext.request.contextPath}/jquery-easyui-1.5.2/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
	<script type="text/javascript">
	function openTbs(title,url){
		if($("#tabs").tabs("exists",title)){
			$("#tabs").tabs("select",title);
		}else{
			var contents="<iframe scrolling='auto' src='"+url+"' style='width:100%;height:100%;' ></iframe> ";
			
			$("#tabs").tabs("add",{
				title:title,
				content:contents,
				closable:true		
			});
			
		}
	}
	</script>
</head>
<body>
	<div class="easyui-layout" style="width: 100%; height: 600px;">
		<div data-options="region:'north',title:'项目名称',split:true"
			style=" height: 100px;">
			<h2>网上票务服务中心</h2>
		</div>
		<div data-options="region:'west',title:'控制菜单',split:true"
			style="width: 150px; height: 500px;">
			<div class="easyui-accordion" style="width: 150px; height: 500px;">
				 <div title="航班管理">
					<a href="javascript:void(0);" onclick="openTbs('航班信息','../view/Plane.jsp')">添加航班</a>
   			 		</div>
   			 		 <div title="航班管理">
					<a href="javascript:void(0);" onclick="openTbs('')">查询航班</a>
   			 		</div>
				</div>
				</div>
		<div data-options="region:'center',title:'显示网页'"
			style=" height: 500px;">
			<div   class="easyui-tabs" id="tabs" style="height: 500px;">
			</div> 
		</div>
		</div>
</body>
</html>