<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${msg}</title>
    <link rel="stylesheet" type="text/css" href="../../../CSS/mainstyle.css">
</head>
<body>
<%--action="${pageContext.request.contextPath}/index/issue" method="post"--%>
<%--<textarea class="biaoti" style="font-family: sans-serif;color:hotpink;" placeholder="未央最大的论坛系统上线了" name="headLine"></textarea>--%>
<form action="${pageContext.request.contextPath}/index/reply?postId=${postId}" method="post">
<textarea class="huifuneirong" style="font-family: sans-serif;color:hotpink;" placeholder="请输入您的评论信息" name="content"></textarea>
<textarea class="huifuchuangjianzhe" style="font-family: sans-serif;color:hotpink;" placeholder="请输入您的匿名信息" name="userName"></textarea>
<button class="huifufabu" type="submit" value="发布">回复</button>
</form>
<%--    <br><input type="textarea" placeholder="内容" name="content"></br>--%>
<%--    <br><input type="text" placeholder="创建者" name="creator"></br>--%>
<%--    <br><input type="submit" value="提交"></br>--%>

</body>
</html>
