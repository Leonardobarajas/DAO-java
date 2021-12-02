/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class AutorDAO {
    Conexion conexion;
    //data acces object
    public AutorDAO(){
        conexion = new Conexion();
    }

    public String InsertAutor(String autNombre,String autNacionalidad,int autEdad){
            String respuesta =null;
            try{
                Connection accesodb = conexion.getConexion();
                String sql ="INSERT INTO autor(nombre, nacionalidad, edad) VALUES(?,?,?)";
                PreparedStatement statement = accesodb.prepareStatement(sql);
                statement.setString(1, autNombre);
                statement.setString(2, autNacionalidad);
                statement.setInt(3, autEdad);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0){
                    respuesta="Inserción exitosa!";
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        return respuesta;
    }
    public ArrayList<AutorModel> listarAutor(){
        ArrayList<AutorModel> autores = new ArrayList<>();
        AutorModel edi;
        try{
            Connection accesodb = conexion.getConexion();
            String select1 = "SELECT * FROM autor";
            Statement statement1 = accesodb.createStatement();
            ResultSet result = statement1.executeQuery(select1);
            while(result.next()){
                edi = new AutorModel();
                edi.setAutId(result.getInt(1));
                edi.setAutNombre(result.getString(2));
                edi.setAutNacionalidad(result.getString(3));
                edi.setAutEdad(result.getInt(4));
                autores.add(edi);
                /*System.out.println(edi);*/
            }
        }catch(Exception ex){
                ex.printStackTrace();        
            }
        return autores;
    }
    public String DeleteAutor(int autId){
        String respuesta1 = null;
         try{
                Connection accesodb = conexion.getConexion();
                String sql ="DELETE FROM autor WHERE ID=?";
                PreparedStatement statement = accesodb.prepareStatement(sql);
                statement.setInt(1,autId);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0){
                    respuesta1="Eliminación Exitosa!";
                }
         }catch(Exception ex){
                ex.printStackTrace();
            }
        return respuesta1;
    }
    public String UpdateAutor(String autNombre,String autNacionalidad,int autEdad,int autID){
        String respuesta2 = null;
        try{
            Connection accesodb = conexion.getConexion();
            String sql = "UPDATE autor SET nombre=?, nacionalidad=?, edad=? WHERE id=?";
            PreparedStatement statement = accesodb.prepareStatement(sql);
            statement.setString(1,autNombre);
            statement.setString(2,autNacionalidad);
            statement.setInt(3,autEdad);
            statement.setInt(4,autID);
            int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0){
                    respuesta2="Actualización Exitosa!";
                }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return respuesta2;
    }
}
