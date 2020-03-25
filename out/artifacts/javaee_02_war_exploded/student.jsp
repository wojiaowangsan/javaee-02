<%@ page import="com.javaee.code.model.StudentHomework" %>
<%@ page import="com.javaee.code.jdbc.Studentjdbc" %>
<%@ page import="com.javaee.code.model.student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lenovo12345
  Date: 2020/3/13
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showStudent</title>
</head>
<body>
<table align="center" width="960" border="1"
       bgcolor="black" cellpadding="1" cellspacing="1">
    <tr align="center" bgcolor="#7fffd4" height="50">
        <td>学生学号</td>
        <td>学生姓名</td>

    </tr>
        <%
          List<student> list = Studentjdbc.selectAll();
          if(null == list || list.size() <= 0){
              out.print("None data.");
          }else {
              for (student  s : list){
      %>
    <tr align="center" bgcolor="white" height="30">

        <td><%=s.getStudentId()%></td>
        <td><%=s.getStudentName()%></td>

    </tr>
        <%
              }
          }
      %>
</body>
</html>
