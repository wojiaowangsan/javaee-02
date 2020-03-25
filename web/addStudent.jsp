<%--
  Created by IntelliJ IDEA.
  User: lenovo12345
  Date: 2020/3/11
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddStudent</title>
</head>
<body>
<form  align="center" method="post" action="/addStudent" border="1" width="50%" cellpadding="6">
    学号：<input name="student_Id" type="text" align="center"><br>
    姓名：<input name="student_Name" type="text" align="center"><br>
    <input type="submit" value="添加" name="submit">

</form>
</body>
</html>
