package com.javaee.code.jdbc;
import com.javaee.code.model.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class StudentHomeworkjdbc {
    public static void main(String[]args){
        List <StudentHomework>list =selectAll();
        for (StudentHomework sh : list){
            System.out.println(sh.getHomeworkContent());
        }
    }
    public static void addStudentHomework(StudentHomework sh){
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
//        String allUrl=url+"?user=root&password=121429";
        String driverName="com.mysql.cj.jdbc.Driver";
        Boolean a=false;
        String sqlString="insert into school_s_homework(id,homework_title,homework_content,create_time,student_id,homweork_id) values(?,?,?,?,?,?)";
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
                System.out.println(sh.getId());
                ps.setLong(1,sh.getId());
                System.out.println(sh.getId());
                ps.setString(2,sh.getHomeworkTitle());
                ps.setString(3,sh.getHomeworkContent());
                ps.setDate(4, (Date) sh.getCreateTime());
                ps.setLong(6,sh.getHomeworkId());
                ps.setLong(5,sh.getStudentId());
                int row = ps.executeUpdate();
                if(row > 0){
                    System.out.println("成功添加了 " + row + "条数据！ ");
                    a=true;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<StudentHomework>selectAll(){
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
//        String allUrl=url+"?user=root&password=121429";
        String driverName="com.mysql.cj.jdbc.Driver";
        String sqlString="SELECT * FROM school_s_homework";
        try {
            // 加载驱动
            Class.forName(driverName);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<StudentHomework> list = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(url,"root","121429")) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                        StudentHomework sh = new StudentHomework();
                        sh.setId(resultSet.getLong("id"));
                        sh.setStudentId(resultSet.getLong("student_id"));
                        sh.setHomeworkId(resultSet.getLong("homework_id"));
                        sh.setHomeworkTitle(resultSet.getString("homework_title"));
                        sh.setHomeworkContent(resultSet.getString("homework_content"));
                        sh.setCreateTime(resultSet.getTimestamp("create_time"));
                        list.add(sh);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }
}
