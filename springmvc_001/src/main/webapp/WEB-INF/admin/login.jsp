<%--
  Created by IntelliJ IDEA.
  User: ZW150
  Date: 2022/9/1
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>登录</h2><br>
<form action="/login">
账号：<input name="name"><br>
密码：<input type="password" name="password"><br>
<input type="submit" value="登录">
<input type="button" value="重置"><br>
</form><br>
${msg}
</body>
</html>
