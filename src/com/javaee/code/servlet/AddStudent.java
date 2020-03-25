package com.javaee.code.servlet;

import com.javaee.code.jdbc.StudentHomeworkjdbc;
import com.javaee.code.jdbc.Studentjdbc;
import com.javaee.code.model.StudentHomework;
import com.javaee.code.model.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")
public class AddStudent extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        student s = new student();
        /**
         * 赋值
         */

        s.setStudentId(Long.parseLong(req.getParameter("student_Id")));
        s.setStudentName(req.getParameter("student_Name"));
//        Studentjdbc.addStudent(s);
        Boolean result = Studentjdbc.addStudent(s);

        resp.sendRedirect("main.jsp");
    }
}
