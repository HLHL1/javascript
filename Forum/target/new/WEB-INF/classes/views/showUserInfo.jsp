<%--
  Created by IntelliJ IDEA.
  User: 刘志乐
  Date: 2019/5/26
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--<jsp:useBean id="userInfo" type="com.forum.pojo.UserInfo" scope="session"></jsp:useBean>--%>
<html>
<head>
    <title>窜天猴论坛</title>
    <meta charset="UTF-8">
    <link href="../../../CSS/mainstyle.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="container">
    <jsp:include page="../../../header.jsp"></jsp:include>

    <div id="page">
        <div id="panel">
            <div class="user">
                <div class="up">
                    <h3 class="userName">用户名：${msg1}</h3>
                </div>
                <div class="down">
                    <p class="userId">用户ID：${msg2}</p>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>