<%@ page import="com.forum.pojo.Post" %><%--
  Created by IntelliJ IDEA.
  User: 刘志乐
  Date: 2019/5/26
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="com.forum.pojo.Post" %>
<% List<Post> posts = (List<Post>)request.getAttribute("msg3"); %>
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
        <div class="fixPanel">
            <a href="${pageContext.request.contextPath}/user/jump"><p class="issue">发帖</p></a>
        </div>

        <div id="panel">

            <%
                for (Post post:posts) {
            %>

            <div class="post">
                <div class="up">
                    <a href="${pageContext.request.contextPath }/floor/getFloor?postId=<%=post.getPostId()%>" target="_blank"><h3 class="titlePreview"><%= post.getHeadLine() %></h3></a>
                    <a href="${pageContext.request.contextPath }/user/userInfo?userName=<%= post.getCreator()%>" target="_blank"><p class="creator"><%= post.getCreator() %></p></a>
                </div>
                <div class="down">
                    <a href="${pageContext.request.contextPath }/floor/getFloor?postId=<%=post.getPostId()%>" target="_blank"><p class="postPreview"><%= post.getContent() %></p></a>
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
