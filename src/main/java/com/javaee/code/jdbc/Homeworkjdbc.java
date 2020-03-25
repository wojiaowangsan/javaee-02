package com.javaee.code.jdbc;

import com.javaee.code.model.StudentHomework;
import com.javaee.code.model.homework;
import com.javaee.code.model.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Homeworkjdbc {
    public static void main(String[]args) {
        System.out.println("111");
    }
    public static Boolean addHomework(homework h){
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
//        String allUrl=url+"?user=root&password=121429";
        String driverName="com.mysql.cj.jdbc.Driver";
        Boolean a=false;
        String sqlString="insert into school_homework(homework_Id,homework_Title,homework_Content) values(?,?,?)";
        try {
            // 加载驱动
            Class.forName(driverName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<student> list = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(url,"root","121429")) {
            try(PreparedStatement ps = connection.prepareStatement(sqlString);){
//                try(ResultSet resultSet = ps.executeQuery(sqlString)){
                // 获取执行结果
//                student s=new student();
                ps.setLong(1,h.getHomeworkId());
                ps.setString(2, h.getHomeworkName());
                ps.setString(3,h.getHomeworkContent());
                int row = ps.executeUpdate();
                if(row > 0){
                    System.out.println("成功添加了 " + row + "条数据！ ");
                    a=true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return a;
    }
}
