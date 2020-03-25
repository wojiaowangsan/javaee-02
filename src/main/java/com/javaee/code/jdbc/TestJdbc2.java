package com.javaee.code.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/*
手动关闭链接
*/
public class TestJdbc2 {
    public static String getMysql(){
        Connection connect = null;
        Statement statement=null;
        ResultSet resultSet=null;
        String url ="jdbc:mysql://127.0.0.1:3306/wmr?serverTimezone=UTC";
        String driverName="com.mysql.cj.jdbc.Driver";
        String sqlString="select * from student limit 10";
//        String driverName="oracle.jdbc.OracleDriver";
        try{
            Class.forName(driverName);

                connect= DriverManager.getConnection(url,"root","121429");
                statement=connect.createStatement();
                resultSet=statement.executeQuery(sqlString);
                while (resultSet.next()){
                    System.out.println(resultSet.getLong(1));
                }


            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }finally {

            if(null!=connect){
                try {
                    connect.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null!=statement){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(null!=resultSet){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(connect);


        return null;
    }
    public static void main (String[] args){
        getMysql();
    }
}

