<%--
  Created by IntelliJ IDEA.
  User: ZW150
  Date: 2022/8/29
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>404</h1><br><br>
<%--
    request.setAttribute("requestStu",stu);
    session.setAttribute("sessionStu",stu);
    model.addAttribute("modelStu",stu);
    map.put("mapStu",stu);
    modelMap.addAttribute("modelMapStu",stu);
--%>
request:${requestStu},${requestStu.name},${requestStu.age}<br><br>
sessionStu:${sessionStu}<br><br>
model:${modelStu}<br><br>
map:${mapStu}<br><br>
modelMap:${modelMapStu}
<br><br>
<h2>main..........</h2><br><br>
<table width="500px" border="1">
    <caption>学生信息表</caption>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
