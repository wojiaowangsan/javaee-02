package com.javaee.code.servlet;



import com.javaee.code.jdbc.StudentHomeworkjdbc;
import com.javaee.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@WebServlet("/submitHomework")
public class AddStudentHomeworkServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        StudentHomework sh = new StudentHomework();
        /**
         * 赋值
         */
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sh.setStudentId(Long.getLong(req.getParameter("studentId")));
        sh.setHomeworkId(Long.getLong((req.getParameter("homeworkId"))));
        sh.setHomeworkContent(req.getParameter("homeworkContent"));
        sh.setCreateTime(new Date());
        sh.setHomeworkTitle(req.getParameter("homeworkTitle"));
        sh.setId(Long.getLong(req.getParameter("Id")));
        StudentHomeworkjdbc.addStudentHomework(sh);

        resp.sendRedirect(",main.jap");

    }
}
