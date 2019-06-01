<%@ page import="com.forum.pojo.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: 刘志乐
  Date: 2019/5/28
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--<jsp:useBean id="user" class="com.forum.pojo.UserInfo" scope="request"></jsp:useBean>--%>

<%--<html>--%>
<%--<head>--%>
    <%--<title>窜天猴论坛</title>--%>
    <%--<meta charset="UTF-8">--%>
    <%--<link href="CSS\mainstyle.css" rel="stylesheet" type="text/css">--%>
<%--</head>--%>
<body>

<div id="container">
    <div id="header">
        <h1 class="title">窜天猴论坛</h1>
        <% UserInfo user = (UserInfo) request.getSession().getAttribute("msg"); %>
        <a href="${pageContext.request.contextPath }/user/userInfo?userName=<%= user.getUserName() %>"><p id="user"><%= user.getUserName() %></p></a>
    </div>
</div>

</body>
<%--</html>--%>
