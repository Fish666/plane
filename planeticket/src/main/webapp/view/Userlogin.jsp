<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String path=request.getContextPath();
   String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
<script type="text/javascript" src="<%=basePath%>jquery-easyui-1.5.2/plugins/jquery.pagination.js"></script>
<script type="text/javascript" src="<%=basePath%>jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>
<link 	rel="stylesheet" href="<%=basePath%>jquery-easyui-1.5.2/themes/default/easyui.css">
<link  	rel="stylesheet" href="<%=basePath%>jquery-easyui-1.5.2/themes/icon.css">
</head>
<script type="text/javascript">
$(function(){
	//通过table标签得的一个分页插件
	var pp=$("#table").datagrid("getPager");	
	$(pp).pagination({			
		pageSize:10,
		pageList:[2,3,5,10],
		beforePageText:"第",	
		afterPageText:"页    共{pages}页",
		displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
		onSelectPage:function(curPage,pageSize){
			var data={
					curPage:curPage,
					pageSize:pageSize,
					username:$("#qusername").val(),
					realname:$("#qrealname").val(),
					startDate:$("#start").val(),
					endDate:$("#end").val(),
			}
			//发送ajax请求
			//$("#table").datagrid("reload",data);
			$.ajax({
				url:"<%=basePath%>userServlet?cmd=queryUsers",
				type:"post",
				dataType:"json",
				data:data,
				success:function(respData){
					$("#table").datagrid("loadData",respData)
				}
				
			});
			
		}
	});
	
//修改用户信息
	$("#update").click(function(){
		//获取选中行，如果选中了多行，则获取的是第一个选中行
		var row=$("#table").datagrid("getSelected");
		$("#uusername").textbox({
			readonly:true
		});
		$("#updateDlg").dialog("open").dialog("setTitle","修改用户信息");
		$("#saveUrl").val("<%=basePath%>user/updateUser.do");
		
		//直接将row里面的数据一次性赋值给有name属性的标签，并且name属性必须与row里面的属性想对应
		$("#updateForm").form("load",row);
	})
	
//添加用户信息
	$("#insert").click(function(){
		$("#updateForm").form("clear");
		$("#updateDlg").dialog("open").dialog("setTitle","增加用户信息");
		$("#saveUrl").val("user/insertUser.do");
		
		//发送ajax请求添加
		$.ajax({
			url:$("#").val(),
			type:"post",
			dataType:"json",
			data:$("#updateForm").serialize(),
			success:function(resp){
				alert(resp.tip);
				$("#updateDlg").dialog("close");
				$("#table").datagrid("reload");
			}
		});
		
	});
	
//删除用户信息	
	$("#delete").click(function(){
		var rows=$("#table").datagrid("getSelections");
		if(rows.length>0){
			var idArr=new Array();
			$.each(rows,function(index,row){
				//将值放入数组里面
				idArr.push(row.id);
			})
			
			$.ajax({
				url:"<%=basePath%>user/deleteUser.do",
				type:"post",
				dataType:"json",
				data:{
					ids:idArr.toString()
				},
				success:function(data){
					//var json=eval("("+data+")");
					alert(data.tip);
					$("#table").datagrid("reload");
				}						
			})
		}else{
			alert("请选择要删除的数据");
		}
	})
//查询用户信息	
	$("#query").click(function(){
		var data={
				username:$("#qusername").val(),
		}
		//发送ajax请求
		$("#table").datagrid("load",data);
	})
	
})
function update(){

	$("#updateForm").form("submit",
			{
				url:$("#saveUrl").val(),
				onSubmit:function(){
			
					return $(this).form('validate');
				},
				success:function(data){
					var json=eval("("+data+")");
					alert(json.tip);
					$("#updateDlg").dialog("close");
					$("#table").datagrid("reload");
				}
		
			});
	
}
function closeDlg(){
	$("#updateForm").form("clear");
	$("#updateDlg").dialog("close");
}

</script>
<body>
	<form id="queryForm">
		<label>用户名：</label><input class="easyui-textbox" name="uname" id="qusername">
	</form>
	<input type="button" value="查询" id="query">
	<input type="button" value="修改" id="update">
	<input type="button" value="增加" id="insert">
	<input type="button" value="删除" id="delete">
	<table id="table" class="easyui-datagrid"  url="user/queryUser.do" pagination="true"  method="post">
		<thead>
			<tr>
				<th field="ck" checkbox="true"></th>
				<th field="uid" width="80" >用户id</th>
				<th field="uname"  width="80">用户名</th>
				<th field="upwd"  width="80">用户密码</th>
				<th field="urealname"  width="80">真实姓名</th>
				<th field="usex"  width="80">性别</th>
				<th field="uage"  width="80">年龄</th>
				<th field="ubirthday"  width="80">生日</th>
				<th field="uidnum"  width="80">身份证号</th>
				<th field="uemail"  width="80">邮箱</th>
				<th field="uphone"  width="80">电话</th>
				<th field="money_mid"  width="80">钱包</th>
				<!-- <th field="createDate" data-options="formatter:function(createDate){
					return new Date(createDate).toLocaleString();
					}" width="150">添加时间</th> -->
			</tr>
		</thead>
	</table>
	
	<div id="updateDlg" class="easyui-dialog" style="width:300px;height:300px" closed="true">
		<input type="hidden" id="saveUrl">
		<form id="updateForm" method="post" style="width:100%;height:100%" buttons="#update-dlg-btns">
			<input type="hidden" name="uid">
			<table align="center">
				<tr>
					<td><label>用户名：</label></td>
					<td><input class="easyui-textbox" name="uname" id="uuname" data-options="required:true"/></td>
				</tr>
				<tr>
					<td><label>用户密码：</label></td>
					<td><input class="easyui-textbox" name="upwd" id="uupwd"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>真实姓名：</label></td>
					<td><input class="easyui-textbox" name="urealname" id="uurealname"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>性别：</label></td>
					<td><input class="easyui-textbox" name="usex" id="uusex"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>年龄：</label></td>
					<td><input class="easyui-textbox" name="uage" id="uuage"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>生日：</label></td>
					<td><input class="easyui-textbox" name="ubirthday" id="uubirthday"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>身份证号：</label></td>
					<td><input class="easyui-textbox" name="uidnum" id="uuidnum"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>邮箱：</label></td>
					<td><input class="easyui-textbox" name="uemail" id="uuemail"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>电话：</label></td>
					<td><input class="easyui-textbox" name="uphone" id="uuphone"  required="true"/></td>
				</tr>
				
				<tr>
					<td><label>钱包：</label></td>
					<td><input class="easyui-textbox" name="money_id" id="umoney_id"  required="true"/></td>
				</tr>
				
				
			</table>
			
			<div id="update-dlg-btns" align="center">
				<a href="javascript:void(0);" class="easyui-linkbutton" 
					iconCls="icon-ok" onclick="update();" style="width:100px;height:30px" >保存</a>
					<a href="javascript:void(0);" class="easyui-linkbutton" 
					iconCls="icon-cancel" onclick="closeDlg();" style="width:100px;height:30px">取消</a>
			</div>
		</form>
		
	</div>
</body>
</html>