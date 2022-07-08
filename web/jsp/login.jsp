<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>操作员登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="jsp/css/alogin.css" rel="stylesheet" type="text/css" />
   
</head>
<body>

    <form id="form1" action="<%= path%>/user/login" method="post">
    <div class="Main">
        <ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB">
            	<table style="margin-top: 20px; margin-left: 20px;">
	            	<tr>
	            		<td rowspan="2"></td>
	            		<td style="vertical-align:top;"></td>
	            	</tr>
	            	<tr>
	            		<td style="vertical-align: text-top;"><small></small></td>
	            	</tr>
            	</table>
            </li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li>
	                    <span class="left login-text">用户名：</span> 
	                    <span style="left">
	                        <input id="Text1" type="text" class="txt" name="username"/>
	                    </span>
                   	</li>
                    <li>
	                    <span class="left login-text">密码：</span> 
	                    <span style="left">
	                       <input id="Text2" type="password" class="txt" name="password" />
	                    </span>
                    </li>
					
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C"><span class="btn"><input name="" type="image" src="jsp/images/login/btnlogin.gif" onclick="return aa()" /></span></li>
            <li class="middle_D"></li>
            <li class="bottom_A"></li>
  
        </ul>
    </div>
    
    </form>
</body>
</html>