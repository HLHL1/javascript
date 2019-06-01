<%--
  Created by IntelliJ IDEA.
  User: 刘志乐
  Date: 2019/5/26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.forum.pojo.Floor" %>
<%@ page import="com.forum.pojo.Post" %>
<%--<jsp:useBean id="post" type="com.forum.pojo.Post" scope="session"></jsp:useBean>--%>
<%--<% ArrayList<Floor> floors = (ArrayList<Floor>) session.getAttribute("floors"); %>--%>
<% List<Floor> floors = (List<Floor>)request.getAttribute("msg4"); %>
<% Post post=(Post) request.getAttribute("msg5");%>
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
            <div class="post">
                <div class="up">
                    <h3 class="title"><%= post.getHeadLine() %></h3>
                    <a href="${pageContext.request.contextPath}/user/userInfo?userName=<%= post.getCreator()%>"><p class="creator"><%= post.getCreator() %></p></a>
                </div>
                <div class="down">
                    <p class="content"><%= post.getContent() %></p>
                    <div class="repeat">
                        <a href="${pageContext.request.contextPath}/user/jump1?postId=<%= post.getPostId()%>"><p class="btn">点击回复</p></a>
                    </div>
                </div>
            </div>

            <%
                for (Floor floor : floors){
                    %>
                <div class="floor">
                    <div class="up">
                        <p class="content"><%= floor.getContent() %></p>
                        <a href="${pageContext.request.contextPath }/user/userInfo?userName=<%= floor.getUserName() %>"><p class="creator"><%= floor.getUserName() %></p></a>
                    </div>
                </div>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>