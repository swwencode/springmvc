<%--
  Created by IntelliJ IDEA.
  User: ZW150
  Date: 2022/8/29
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br>
<a href="/demo.action">你有本事点一下试试</a><br><br>
<form action="/one/demo.action" method="get">
    <input type="submit" value="提交">
</form>
<form action="/one.action" method="get">
    姓名：<input name="name">
    年龄：<input name="age">
    <input type="submit" value="提交">
</form><br><br>
<form action="/two.action" method="post">
    姓名：<input name="name">
    年龄：<input name="age">
    <input type="submit" value="提交">
</form><br><br>
<form action="/three/小灰灰/18.action" method="post">
    <%--姓名：<input name="name">--%>
    <%--年龄：<input name="age">--%>
    <input type="submit" value="提交">
</form><br><br>
<form action="/four.action" method="post">
    <h3>数据提交，请求参数名称与action方法参数名称不一致</h3>
    姓名：<input name="name">
    年龄：<input name="age">
    <input type="submit" value="提交">
</form><br><br>
<form action="/five.action" method="post">
    <h3>手动提取数据</h3>
    姓名：<input name="name">
    年龄：<input name="age">
    <input type="submit" value="提交">
</form><br><br>
<a href="/data.action">参数啥来着？</a><br><br>
<a href="/datatwo.action">起名字好难啊</a><br><br>
<form action="/mydate.action">
    日期：<input type="date" name="date">
    <input type="submit" value="提交">
</form>
</body>
</html>
