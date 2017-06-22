<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人钱包</title>
<base href="${pageContext.request.contextPath}/">
<script type="text/javascript"
	src="/planeticket/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript"
	src="/planeticket/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="/planeticket/jquery-easyui-1.5.2/plugins/jquery.validatebox.js"></script>
<script type="text/javascript"
	src="/planeticket/jquery-easyui-1.5.2/plugins/jquery.pagination.js"></script>
<script type="text/javascript"
	src="/planeticket/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet"
	href="/planeticket/jquery-easyui-1.5.2/themes/default/easyui.css">
<link rel="stylesheet"
	href="/planeticket/jquery-easyui-1.5.2/themes/icon.css">
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
					mid:$("#qmid").val(),
				    mbankid:$("#qmbankid").val()
				
			}
			//发送ajax请求
			$("#table").datagrid("reload",data);
			<%-- $.ajax({
				url:"<%=basePath%>userServlet?cmd=queryUsers",
				type:"post",
				dataType:"json",
				data:data,
				success:function(respData){
					$("#table").datagrid("loadData",respData)
				}
				
			}); --%>
			
		}
	});
	
	    $("#update").click(function(){
		    var rows=$("#table").datagrid("getSelections");
		    if(rows.length<1){
			   alert("请选择要修改的行");
			   return;
	    }
		    $("#updateDlg").dialog("open").dialog("setTitle","修改个人钱包信息");
		    $("#updateForm").form("load",rows[0]);
		    $("#saveUrl").val("money/updateMoney.do");
		
	    })
		$("#add").click(function(){
			$("#updateForm").form("clear");
			$("#updateDlg").dialog("open").dialog("setTitle","添加个人钱包信息");
			$("#saveUrl").val("money/addMoney.do");	
			
		});

		$("#delete").click(function() {
			var rows = $("#table").datagrid("getSelections");
			if (rows.length > 0) {
				var idArr = new Array();
				$.each(rows, function(index, row) {
					//将值放入数组里面
					idArr.push(row.mid);
				})

				$.ajax({
					url : "money/deleteMoney.do",
					type : "post",
					dataType : "json",
					data : {
						ids : idArr.toString()
					},
					success : function(data) {
						//var json=eval("("+data+")");
						alert(data.tip);
						$("#table").datagrid("reload");
					}
				})
			} else {
				alert("请选择要删除的数据");
			}
		})

        $("#query").click(function(){
			
			     var data={
			    		 curPage:$("#table").datagrid("getPager").pagination("options").pageNumber,
						 pageSize:$("#table").datagrid("getPager").pagination("options").pageSize,
					     mid:$("#qmid").val(),
					     mbankid:$("#qmbankid").val()
			     }
			
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

</head>
<body>
	<form id="queryForm">
	    <label>钱包id：</label><input class="easyui-textbox" name="mid" id="qmid">
		<label>银行卡号：</label><input class="easyui-textbox" name="mbankid" id="qmbankid">
	</form>
	<input type="button" value="查询" id="query">
	<input type="button" value="修改" id="update">
	<input type="button" value="添加" id="add">
	<input type="button" value="删除" id="delete">
	<table id="table" class="easyui-datagrid"
		url="${pageContext.request.contextPath}/money/queryMoney.do" pagination="true" method="post">
		<thead>
			<tr>
				<th field="ck" checkbox="true"></th>
				<th field="mid" width="80">钱包id</th>
				<th field="mbankid" width="80">银行卡号</th>
				<th field="moneys" width="80">钱包余额</th>
				<th field="mlevel" width="80">会员等级</th>
				<th field="mcashcoupon" width="80">代金券</th>
			</tr>
		</thead>
	</table>

	<div id="updateDlg" class="easyui-dialog"
		style="width: 300px; height: 300px" closed="true">
		<input type="hidden" id="saveUrl">
		<form id="updateForm" method="post" style="width: 100%; height: 100%"
			buttons="#update-dlg-btns">
			<input type="hidden" name="mid">
			<table align="center">
				<tr>
					<td><label>银行卡号：</label></td>
					<td><input class="easyui-textbox" name="mbankid" id="umbankid" required="true" /></td>
				</tr>
				<tr>
					<td><label>钱包余额：</label></td>
					<td><input class="easyui-textbox" name="moneys" id="umoneys" required="true" /></td>
				</tr>
				<tr>
					<td><label>会员等级：</label></td>
					<td><input class="easyui-textbox" name="mlevel" id="umlevel" required="true" /></td>
				</tr>
				<tr>
					<td><label>代金券：</label></td>
					<td><input class="easyui-textbox" name="mcashcoupon" id="umcashcoupon" required="true" /></td>
				</tr>
			</table>

			<div id="update-dlg-btns" align="center">
				<a href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-ok" onclick="update();"
					style="width: 100px; height: 30px">保存</a> <a
					href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-cancel" onclick="closeDlg();"
					style="width: 100px; height: 30px">取消</a>
			</div>
		</form>
	</div>
</body>
</html>