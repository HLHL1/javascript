<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: Administrator--%>
  <%--Date: 2019/5/27 0027--%>
  <%--Time: 下午 16:26--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
    <div id="login">
        <h1>Login</h1>
        <form action="${pageContext.request.contextPath }/user/login" method="post">
            <br><input type="text" placeholder="用户名" name="userName"></br>
            <br><input type="text" placeholder="密码" name="passWord"></br>
            <br><button class="but" type="submit">登录</button></br>
        </form>
        <a href="${pageContext.request.contextPath }/regist.jsp" class="toRegist">去注册</a>
        <%--<br><button class="but" href="regist.jsp">注册</button></br>--%>
    </div>
</body>
</html>

