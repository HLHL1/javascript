<%--
  Created by IntelliJ IDEA.
  User: 毕竞舸
  Date: 2019/5/28
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
    <link rel="stylesheet" type="text/css" href="../../../CSS/mainstyle.css">
</head>
<body>
<%--action="${pageContext.request.contextPath}/index/issue" method="post"--%>
    <form action="${pageContext.request.contextPath}/index/issue" method="post">
    <textarea class="biaoti" style="font-family: sans-serif;color:hotpink;" placeholder="请输入您的HeadLine" name="headLine"></textarea>
    <textarea class="neirong" style="font-family: sans-serif;color:hotpink;" placeholder="请输入您的发帖内容" name="content"></textarea>
    <textarea class="chuangjianzhe" style="font-family: sans-serif;color:red;" placeholder="请输入发帖匿名" ;color:hotpink; name="creator"></textarea>
    <button class="fabu" type="submit" value="发布">发布</button>
    </form>
<%--    <br><input type="textarea" placeholder="内容" name="content"></br>--%>
<%--    <br><input type="text" placeholder="创建者" name="creator"></br>--%>
<%--    <br><input type="submit" value="提交"></br>--%>

</body>
</html>
