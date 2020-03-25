package com.javaee.code.jdbc;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class TestJdbc {
    public static String getMysql(){
        Connection connect = null;
        Statement statement=null;
        ResultSet resultSet=null;
        String url ="jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC";
        String driverName="com.mysql.cj.jdbc.Driver";
        String sqlString="select * from school_s_homework limit 10";
//        String driverName="oracle.jdbc.OracleDriver";
        DriverManager.setLogWriter(new PrintWriter(System.out));
//            Class.forName(driverName);
            try {
                connect = DriverManager.getConnection(url, "root", "121429");
                statement = connect.createStatement();
                resultSet = statement.executeQuery(sqlString);

                while (resultSet.next()) {
                    System.out.println(resultSet.getLong(1));
                }
                connect.close();
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        System.out.println(connect);


        return null;
    }
    public static void main (String[] args){
        getMysql();
    }
}
