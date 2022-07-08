<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>库存管理</title>
	<link rel="shortcut icon" href="<%=path %>/jsp/images/favicon.ico" />
	<link href="css/css.css" type="text/css" rel="stylesheet" />
	<script type="text/javascript" src="js/dtree.js"></script>
	<script type="text/javascript" src="js/sdmenu.js"></script>
	<script type="text/javascript">
		// <![CDATA[
		var myMenu;
		window.onload = function() {
			myMenu = new SDMenu("my_menu");
			myMenu.init();
		};
		// ]]>
	</script>
	
	<style>
		#footer{font-size:12px;}
		.footer_pad{padding:7px 9px 5px 9px;}
		#main{background:#f2f0f5; padding:15px 0px 10px 5px; height: 880px; }
	</style>
</head>
<body>
<!-- top start  -->
<%
	System.out.println(path);
	System.out.println(basePath);
%>
	<div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="header">
		  <tr>
		    <td align="left" valign="top" id="logo"><img src="images/main/logo.gif" width="74" height="64"></td>
		    <td align="left" valign="top" id="header-name" style="padding-left:8px; ">库存管理系统<br><small style="color: gray;"></small></td>
		    <td align="left" valign="bottom" height="100%" >
			    <table width="100%" height="10%" style="padding-bottom: 20px;"  border="0" cellspacing="0" cellpadding="0">
			      <tr>
			        <td align="right" width="100%" id="header-right">
			        	<a href="<%=path%>/user/cancellation" target="_blank" onFocus="this.blur()" class="admin-out">注销</a>
			            <a href="index.jsp" target="_blank" onFocus="this.blur()" class="admin-home">首页</a>
			        	<a href="login.jsp" target="_blank" onFocus="this.blur()" class="admin-index">登录</a>
			            <span>
							<!-- 日历 -->
							<SCRIPT type=text/javascript src="js/clock.js"></SCRIPT>
							<SCRIPT type=text/javascript>showcal();</SCRIPT>
			            </span>
			        </td>
			      </tr>
			    </table>
		</table>
	</div>
<!-- top end  -->
<!-- center start -->
	<div style="border: 0;">
	<table width="100%" height="100%">
		<tr>
<!-- left start -->
			<td width="194" valign="top" style="overflow-x:hidden; background:url(WEB-INF/jsp/images/main/leftbg.jpg) left top repeat-y #f2f0f5;">
				<div style="overflow-x:hidden; width:194px;">
					<div id="left-top">
						<div><img src="images/main/member.gif" width="44" height="44" /></div>
				    	<span>用户：${thisUser.username}<br></span>
					</div>
				    <div style="float: left" id="my_menu" class="sdmenu">
				    	
				    	<div>
					        <span>基础资料</span>
					        <a href="<%= path%>/supplier/toSupplier" target="main" onFocus="this.blur()">供应商管理</a>
					        <a href="<%= path%>/customer/toCustomer" target="main" onFocus="this.blur()">客户管理</a>
					        <a href="<%= path%>/goods/ToGoods" target="main" onFocus="this.blur()">商品管理</a>
				      	</div>
				      	
				    	<div class="collapsed">
					        <span>进货管理</span>
					        <a href="<%=path%>/warehousing/StockIn" target="main" onFocus="this.blur()">进货入库</a>
					        <a href="<%=path%>/warehousing/toReturnGoods" target="main" onFocus="this.blur()">退货出库</a>
						</div>
				      	<div>
					        <span>销售管理</span>
					        <a href="<%=path%>/customerOrder/SalesIssue" target="main" onFocus="this.blur()">销售出库</a>
				      	</div>
				      	
				      	<div>
					        <span>营收管理</span>
					        <a href="<%=path%>/revenue/toYyslList" target="main" onFocus="this.blur()">月份营收查询</a>
				      	</div>
				      		      	
				      	
				      	<div>
					        <span>系统管理</span>
					        <a href="<%=path%>/user/toUser" target="main" onFocus="this.blur()">用户管理</a>
				      	</div>
				      	
			      	</div>
				</div>
			</td>
<!-- left end -->
<!-- main start -->
			<td valign="top" height="100%">
				<div >
					<iframe id="main" scrolling="auto" src="<%= path%>/jsp/main.jsp" name="main" height="100%" width="100%"></iframe>
				</div>
			</td>
		</tr>

	</table>
	</div>
</body>
</html>

