<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'spgl.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="<%=path %>/css/css.css" type="text/css" rel="stylesheet" />
    <link href="<%=path %>/css/main.css" type="text/css" rel="stylesheet" />
    <link rel="shortcut icon" href="<%=path %>/images/main/favicon.ico" />
    <style>
        body{overflow-x:hidden; background:#f2f0f5; padding:15px 0px 10px 5px;}
        #searchmain{ font-size:12px;}
        #search{ font-size:12px; background:#548fc9; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF; float:left}
        #search form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
        #search form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:0 0px 0 10px; float:left; border:1px solid #FFF;}
        #search form input.text-but{height:24px; line-height:24px; width:55px; background:url(images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
        #search a.add{ background:url(images/main/add.jpg) no-repeat -3px 7px #548fc9; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF; float:right}
        #search a:hover.add{ text-decoration:underline; color:#d2e9ff;}
        #search a.manage{ background:url(images/main/dirfirst.gif) no-repeat 3px 14px #548fc9; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF; float:right}
        #search a:hover.manage{ text-decoration:underline; color:#d2e9ff;}
        #search1{ font-size:12px; background:#AFEEEE; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF; float:left}
        #search1 form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
        #search1 form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:0 0px 0 10px; float:left; border:1px solid #FFF;}
        #search1 form input.text-but{height:24px; line-height:24px; width:55px; background:url(images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
        #search1 a.add{ background:url(images/main/collapsed.jpg) no-repeat 3px 15px #AFEEEE; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#000; float:right}
        #search1 a:hover.add{ text-decoration:underline; color:gray;}
        #search1 a.manage{ background:url(images/main/dirfirst.gif) no-repeat 3px 14px #AFEEEE; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#000; float:right}
        #search1 a:hover.manage{ text-decoration:underline; color:gray;}
        #main-tab{ border:1px solid #eaeaea; background:#FFF; font-size:18px;}
        #main-tab th{ font-size:18px; background:url(images/main/list_bg.jpg) repeat-x; height:32px; line-height:32px;}
        #main-tab td{ font-size:16px; line-height:40px;}
        #main-tab td a{ font-size:12px; color:#548fc9;}
        #main-tab td a:hover{color:#565656; text-decoration:underline;}
        .bordertop{ border-top:1px solid #ebebeb}
        .borderright{ border-right:1px solid #ebebeb}
        .borderbottom{ border-bottom:1px solid #ebebeb}
        .borderleft{ border-left:1px solid #ebebeb}
        .gray{ color:#dbdbdb;}
        td.fenye{ padding:10px 0 0 0; text-align:right;}
        .bggray{ background:#f9f9f9}
    </style>
</head>
<body>
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
    <tr>
        <td width="99%" align="left" valign="top">您的位置：商品管理</td>
    </tr>
<%--    <tr>--%>
<%--        <td align="left" valign="top">--%>
<%--            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search1">--%>
<%--                <tr>--%>
<%--                    <td width="80%" style="overflow: hidden;" align="left" valign="middle">--%>
<%--                        <c:forEach items="${page1.list }" var="lb">--%>
<%--                            <form method="post" action="spxx_querySome">--%>
<%--                                <input type="hidden" name="splb.lbid" value="${lb.lbid }">--%>
<%--                                <input type="submit" name="splb.lbname" value="${lb.lbname}" class="text-but">--%>
<%--                            </form>--%>
<%--                        </c:forEach>--%>
<%--                    </td>--%>
<%--                    <td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a href="<%=path %>/goodsType/ToGoodsType" target="main" onFocus="this.blur()" class="manage">类别管理</a></td>--%>
<%--                    <td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a href="<%=path %>/jsp/splbAdd.jsp" target="main" onFocus="this.blur()" class="add">新增类别</a></td>--%>
<%--                </tr>--%>
<%--            </table>--%>
<%--        </td>--%>
<%--    </tr>--%>
    <tr>
        <td align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
                <tr>
                    <td width="90%" align="left" valign="middle">
                        <form method="post" action="<%=path%>/goods/findByNameGoodsLike">
                            <span>日期：</span>
                            <input type="text" name="g_name" class="text-word">
                            <input name="" type="submit" value="查询" class="text-but">
                        </form>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
                <tr>
                    <th align="center" valign="middle" class="borderright">排序</th>
                    <th align="center" valign="middle" class="borderright">销售总额</th>
                    <th align="center" valign="middle" class="borderright">退货总额</th>
                    <th align="center" valign="middle" class="borderright">入库总额</th>
                    <th align="center" valign="middle" class="borderright">出库总额</th>
                    <th align="center" valign="middle" class="borderright">盈亏总额</th>
                    <th align="center" valign="middle" class="borderright">创建时间</th>
                </tr>
                <c:forEach items="${monthRevenueList}" var="monthRevenue" varStatus="status">
                    <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
                        <td align="center" valign="middle" class="borderright borderbottom">${status.count}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.shze}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.thze}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.rkze}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.ckze}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.ykze}</td>
                        <td align="center" valign="middle" class="borderright borderbottom">${monthRevenue.createTime}</td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="6" align="left" valign="top" class="fenye">
            当前第${page.pageNow } 页/共${page.pageCount} 页
            <a href="<%=path %>/spxx_queryAll" target="main" onFocus="this.blur()">首页</a>
            <%--   上一页    当前页  -1    只有  当前页 大于 1 时 才可以 -1 --%>
            <c:choose>
                <c:when test="${page.pageNow>1 }">
                    <a href="<%=path %>/spxx_queryAll?pageNow=${page.pageNow-1}" target="main" onFocus="this.blur()">上一页</a>
                </c:when>
                <c:otherwise>
                    上一页
                </c:otherwise>
            </c:choose>
            <c:choose>
                <%--  总页数 小于 10    起始页 为1   尾页 为  总页数 --%>
                <c:when test="${page.pageCount <= 10 }">
                    <c:set var="begin" value="1"></c:set>
                    <c:set var="end" value="${page.pageCount}"></c:set>
                </c:when>
                <c:otherwise>
                    <%--  总页数 大于10 --%>
                    <c:set var="begin" value="${page.pageNow-5}"></c:set>
                    <c:set var="end" value="${page.pageNow+4 }"></c:set>
                    <%--  解决  头溢出 问题 --%>
                    <c:if test="${begin < 1}">
                        <c:set var="begin" value="1"></c:set>
                        <c:set var="end" value="10"></c:set>
                    </c:if>
                    <%-- 解决 尾 溢出 问题 --%>
                    <c:if test="${end >page.pageCount}">
                        <c:set var="begin" value="${page.pageCount-9 }"></c:set>
                        <c:set var="end" value="${page.pageCount}"></c:set>
                    </c:if>
                </c:otherwise>
            </c:choose>
            <c:forEach begin="${begin}" end="${end}" var="i">
                <a href="<%=path %>/spxx_queryAll?pageNow=${i}" target="main" onFocus="this.blur()"><span class="current">${i }</span></a>
            </c:forEach>
            <c:choose>
                <%-- 下一页  当前页 +1  只有  当前页 小于 总页数 时 才可以加1 --%>
                <c:when test="${page.pageNow  <page.pageCount }">
                    <a href="<%=path %>/spxx_queryAll?pageNow=${page.pageNow+1}" target="main" onFocus="this.blur()">下一页</a>
                </c:when>
                <c:otherwise>
                    下一页
                </c:otherwise>
            </c:choose>
            <a href="<%=path %>/spxx_queryAll?pageNow=${page.pageCount}" target="main" onFocus="this.blur()">尾页</a>
        </td>
    </tr>
</table>
</body>

</html>

