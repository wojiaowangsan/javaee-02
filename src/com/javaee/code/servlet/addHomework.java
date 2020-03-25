package com.javaee.code.servlet;

import com.javaee.code.jdbc.Homeworkjdbc;
import com.javaee.code.jdbc.Studentjdbc;
import com.javaee.code.model.homework;
import com.javaee.code.model.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/addHomework")
public class addHomework extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
       homework h= new homework();
        /**
         * 赋值
         */

        h.setHomeworkId(Long.parseLong(req.getParameter("homework_Id")));
        h.setHomeworkName(req.getParameter("homework_Title"));
        h.setHomeworkContent(req.getParameter("homework_content"));
        Boolean result = Homeworkjdbc.addHomework(h);

        resp.sendRedirect("main.jsp");
    }
}
