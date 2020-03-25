package com.javaee.code.jdbc;

import com.javaee.code.model.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Studentjdbc {
    public static void main(String[]args){
        List<student > list =selectAll();
        for (student  s: list){
            System.out.println(s.getStudentId());
        }
    }
    public static Boolean addStudent(student s){
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
//        String allUrl=url+"?user=root&password=121429";
        String driverName="com.mysql.cj.jdbc.Driver";
        Boolean a=false;
        String sqlString="insert into school_student(student_id,student_name) values(?,?)";
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
                ps.setLong(1,s.getStudentId());
                ps.setString(2,s.getStudentName());
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
    public static List<student>selectAll(){
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
//        String allUrl=url+"?user=root&password=121429";
        String driverName="com.mysql.cj.jdbc.Driver";
        String sqlString="SELECT * FROM school_student";
        try {
            // 加载驱动
            Class.forName(driverName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<student> list = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(url,"root","121429")) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                        student s = new student();

                        s.setStudentId(resultSet.getLong("student_id"));
                        s.setStudentName(resultSet.getString("student_name"));
                        list.add(s);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }
}
