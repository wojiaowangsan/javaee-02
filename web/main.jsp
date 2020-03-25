<%--
  Created by IntelliJ IDEA.
  User: lenovo12345
  Date: 2020/3/13
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<form  align="center"   width="70% >
    <fieldset width="70%">
        <legend>老师</legend>
    <table align="center" border="1" width="50%" cellpadding="6" bgcolor="#7fffd4">
        <tr>
            <th colspan="2" align="center" ><a href="addHomework.jsp">添加作业</a></th>
        </tr>
        <tr>
            <th colspan="2" align="center" ><a href="addStudent.jsp ">添加学生</a></th>
        </tr>
        <tr>
            <th colspan="2" align="center" ><a href="/list">查看学生作业</a></th>
        </tr>
        <tr>
            <th colspan="2" align="center" ><a href="/studentlist">查看学生名单</a></th>
        </tr>
    </table>
    </fieldset>
</form>
<form  align="center"   width="70%>
    <fieldset width="70%">
        <legend>学生</legend>
        <table align="center" border="1" width="50%" cellpadding="6" bgcolor="#7fffd4">
            <tr>
                <th colspan="2" align="center" ><a href="addStudentHomework.jsp">提交作业</a></th>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
