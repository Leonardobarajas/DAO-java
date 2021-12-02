/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class Conexion {
    public Conexion(){}
    public Connection getConexion(){
        String URL= "jdbc:mysql://localhost:3306/reto4";
        String username ="root";
        String password = "0000";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL,username,password);
            if ( conn != null ){
                System.out.println(" Conectado ");
            }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        return conn;
    }
}