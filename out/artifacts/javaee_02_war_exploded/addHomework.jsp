<%--
  Created by IntelliJ IDEA.
  User: lenovo12345
  Date: 2020/3/13
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addHomework</title>
</head>
<body>
<form  align="center" method="post" action="/addHomework"  >
    <table align="center" border="1" width="50%" cellpadding="6" bgcolor="#7fffd4">
        <tr>
            <th colspan="2" align="center" >增加作业</th>
        </tr>

        <tr>
            <td align="center" >作业编号：</td>
            <td align="left" ><input type="text" name="homework_Id"></td>
        </tr>
        <tr>
            <td align="center" >作业题目：</td>
            <td align="left" ><input type="text" name="homework_Title"></td>
        </tr>

        <tr>
            <td align="center" >作业内容：</td>
            <td align="left" ><input type="text" name="homework_Content"></td>
        </tr>
        <tr>
            <th colspan="2" align="center" ><input type="submit" name="submit" value="提交"></th>
        </tr>

    </table>
</form>
</body>
</html>
