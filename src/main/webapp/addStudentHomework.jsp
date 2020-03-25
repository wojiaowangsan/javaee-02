<%--
  Created by IntelliJ IDEA.
  User: lenovo12345
  Date: 2020/3/11
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addStudentHomework</title>
</head>
<body>
<form  align="center" method="post" action="/submitHomework"  >
    <table align="center" border="1" width="50%" cellpadding="6" bgcolor="#7fffd4">
        <tr>
            <th colspan="2" align="center" >提交作业</th>
        </tr>
        <tr>
            <td align="center" >编    号：</td>
            <td align="left" ><input type="text" name="Id"></td>
        </tr>
        <tr>
            <td align="center" >学    号：</td>
            <td align="left" ><input type="text" name="studentId"></td>
        </tr>
        <tr>
            <td align="center" >作业编号：</td>
            <td align="left" ><input type="text" name="homeworkId"></td>
        </tr>
        <tr>
            <td align="center" >作业题目：</td>
            <td align="left" ><input type="text" name="homeworkTitle"></td>
        </tr>

        <tr>
            <td align="center" >作业内容：</td>
            <td align="left" ><input type="text" name="homeworkContent"></td>
        </tr>
        <tr>
            <th colspan="2" align="center" ><input type="submit" name="submit" value="提交"></th>
        </tr>

    </table>
</form>
</body>
</html>
