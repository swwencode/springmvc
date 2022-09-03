<%--
  Created by IntelliJ IDEA.
  User: ZW150
  Date: 2022/9/1
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>日期</h2>
原样日期:${yuan}<br>
术后日期:${hou}<br>
标签：<fmt:formatDate value="${three}" pattern="yyyy-MM-dd"></fmt:formatDate>
</body>
</html>
