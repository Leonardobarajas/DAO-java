/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;
import controllers.*;
import java.util.ArrayList;
import view.*;
import model.*;


/**
 *
 * @author ACER
 */
public class Reto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crudAutor vista1 = new crudAutor();
        AutorDAO aut1 = new AutorDAO();
        EliminarRegistro eli1 = new EliminarRegistro();
        InsertarRegistro insert1 = new InsertarRegistro();
        ActualizarRegistro actua1 = new ActualizarRegistro();
        ControladorCRUD control1 = new ControladorCRUD(vista1,aut1,eli1,insert1,actua1);
        
        vista1.setVisible(true);
        /*AutorDAO ji = new AutorDAO();
        ArrayList<AutorModel> vector = ji.listarAutor();
        System.out.println(vector);*/
    }
    
}
