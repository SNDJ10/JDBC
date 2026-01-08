package com.xworkz.rapdio.internal;

import com.xworkz.rapdio.dto.RapdioDetails;

import java.sql.*;

public class Rapdio {
    String url="jdbc:mysql://localhost:3306/rapdio_db";

    String userName="root";
    String password="root";
    public  String save(RapdioDetails rapdioDetails){
        String rows=null;
        try{

            String insertQuery="insert into rapdio_tb values (?,?,?,?)";
            String updateQuery="update rapdio_tb set name=? where id=?";
            String deleteQuery="delete from rapdio_tb where id=? and name=?";
            String readQuery="select * from rapdio_tb where id=?";

            Connection connection = DriverManager.getConnection(url,userName,password);
            PreparedStatement ps =connection.prepareStatement(insertQuery);
            ps.setInt(1,rapdioDetails.getId());
            ps.setString(2,rapdioDetails.getName());
            ps.setInt(3,rapdioDetails.getAge());
            ps.setString(4,rapdioDetails.getEmail());
            int row=ps.executeUpdate();
            if (row==1){
                rows="it is saved";
            }
            // ResultSet rs =ps.executeQuery();
//            while(rs.next()){
//                String string=  rs.getString(2);
//                System.out.println(string);
//            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  rows;
    }}
