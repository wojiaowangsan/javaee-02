package com.javaee.code.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class TestJdbcV3 {
    public static String getMysql(){

        String url ="jdbc:mysql://127.0.0.1:3306/wmr?serverTimezone=UTC";
        String driverName="com.mysql.cj.jdbc.Driver";
        String sqlString="select * from student limit 10";
//        String driverName="oracle.jdbc.OracleDriver";
        try{
            Class.forName(driverName);//手动注册

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        int n=100;
        while(n-->0){
      try(Connection connect=DriverManager.getConnection(url,"root","121429")){
          try( Statement statement=connect.createStatement()){
              try(ResultSet resultSet=statement.executeQuery(sqlString)){

                  while (resultSet.next()){
                      System.out.println(resultSet.getLong(1));
                  }
              }
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
        }



        return null;
    }
    public static void main (String[] args){
        getMysql();
    }
}
