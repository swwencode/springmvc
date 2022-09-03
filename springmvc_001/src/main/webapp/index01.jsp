<%--
  Created by IntelliJ IDEA.
  User: ZW150
  Date: 2022/8/30
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--导入jquery--%>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<a href="javascript:show()">访问学生集合</a><br><br>
<div id="mydiv">.......</div>
<script type="text/javascript">
    function show() {
        $.ajax({
            url:"/ajax.action",
            type:"get",
            dataType:"json",
            success:function (list) {
                var s = "";
                $.each(list,function (index, stu) {
                    s += "姓名：" + stu.name + "，年龄：" + stu.age + "<br>";
                })
                $("#mydiv").html(s);
            }
        });
    }
</script>
</body>
</html>
