/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.AutorDAO;
import view.ActualizarRegistro;
import view.crudAutor;
import view.EliminarRegistro;
import view.InsertarRegistro;

/**
 *
 * @author ACER
 */
public class ControladorCRUD implements ActionListener{
    
    crudAutor vistacrud = new crudAutor();
    EliminarRegistro vistaEliminar = new EliminarRegistro();
    InsertarRegistro vistaInsertar = new InsertarRegistro();
    ActualizarRegistro vistaActualizar = new ActualizarRegistro();
    AutorDAO aut = new AutorDAO();
    
    
    public ControladorCRUD (crudAutor vistacrud, AutorDAO aut, EliminarRegistro vistaEliminar,InsertarRegistro vistaInsertar,ActualizarRegistro vistaActualizar){
        this.vistacrud = vistacrud;
        this.aut = aut;
        this.vistacrud.btnconsultar.addActionListener(this);
        /*this.vistacrud.btninsertar.addActionListener(this);
        this.vistacrud.btneliminar.addActionListener(this);
        this.vistacrud.btnactualizar.addActionListener(this);*/
        //
        this.vistaEliminar = vistaEliminar;
        this.vistaEliminar.btnEliminarReg.addActionListener(this);
        //
        this.vistaInsertar = vistaInsertar;
        this.vistaInsertar.btnInsertarReg.addActionListener(this);
        //
        this.vistaActualizar = vistaActualizar;
        this.vistaActualizar.btnActualizar.addActionListener(this);
    }
    public void InicializarCRUD(){
        
    }
    public void LlenarTabla(JTable jtdatos){
        DefaultTableModel modeloT = new DefaultTableModel();
        jtdatos.setModel (modeloT);
        
        modeloT.addColumn("ID");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Nacionalidad");
        modeloT.addColumn("Edad");
        
        Object[] columna = new Object[4];
        
        int numAutores = aut.listarAutor().size();
        
        for (int i = 0; i < numAutores; i++) {
            columna[0] = aut.listarAutor().get(i).getAutId();
            columna[1] = aut.listarAutor().get(i).getAutNombre();
            columna[2] = aut.listarAutor().get(i).getAutNacionalidad();
            columna[3] = aut.listarAutor().get(i).getAutEdad();
            modeloT.addRow(columna);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       /*if(e.getSource()== vistacrud.btninsertar){
           String nombre = vistacrud.nombre.getText();
           String nacionalidad = vistacrud.nacionalidad.getText();
           int edad = Integer.parseInt(vistacrud.edad.getText());
           
           String respuesta = aut.InsertAutor(nombre, nacionalidad, edad);
           
           if(respuesta != null){
               JOptionPane.showMessageDialog(null, respuesta);
           }
           else{
               JOptionPane.showMessageDialog(null, "Error");
           }
       }*/
       if(e.getSource()==vistacrud.btnconsultar){
           LlenarTabla(vistacrud.jtdatos);
       }
      /* if(e.getSource()==vistacrud.btneliminar){
           int id = Integer.parseInt(vistacrud.id.getText());
           String respuesta1= aut.DeleteAutor(id);
           if(respuesta1 != null){
               JOptionPane.showMessageDialog(null, respuesta1);
           }
           else{
               JOptionPane.showMessageDialog(null, "Error");
           }
       }*/
       /*if(e.getSource()==vistacrud.btnactualizar){
           int id = Integer.parseInt(vistacrud.id.getText());
           String nombre = vistacrud.nombre.getText();
           String nacionalidad = vistacrud.nacionalidad.getText();
           int edad = Integer.parseInt(vistacrud.edad.getText());
           String respuesta2 = aut.UpdateAutor(nombre, nacionalidad, edad, id);
           if(respuesta2 != null){
               JOptionPane.showMessageDialog(null, respuesta2);
           }
           else{
               JOptionPane.showMessageDialog(null, "Error");
           }
       }*/
        if (e.getSource() == vistaEliminar.btnEliminarReg) {
            int id = Integer.parseInt(vistaEliminar.IdEliminar.getText());
            String respuesta1 = aut.DeleteAutor(id);
            if (respuesta1 != null) {
                JOptionPane.showMessageDialog(null, respuesta1);
                //vistaEliminar.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        if(e.getSource()== vistaInsertar.btnInsertarReg){
           String nombre = vistaInsertar.InsNombre.getText();
           String nacionalidad = vistaInsertar.InsNacionalidad.getText();
           int edad = Integer.parseInt(vistaInsertar.InsEdad.getText());
           
           String respuesta = aut.InsertAutor(nombre, nacionalidad, edad);
           
           if(respuesta != null){
               JOptionPane.showMessageDialog(null, respuesta);
           }
           else{
               JOptionPane.showMessageDialog(null, "Error");
           }
       }
       if(e.getSource()==vistaActualizar.btnActualizar){
           int id = Integer.parseInt(vistaActualizar.IdActualizar.getText());
           String nombre = vistaActualizar.NombreActualizar.getText();
           String nacionalidad = vistaActualizar.NacionalidadActualizar.getText();
           int edad = Integer.parseInt(vistaActualizar.EdadActualizar.getText());
           String respuesta2 = aut.UpdateAutor(nombre, nacionalidad, edad, id);
           if(respuesta2 != null){
               JOptionPane.showMessageDialog(null, respuesta2);
           }
           else{
               JOptionPane.showMessageDialog(null, "Error");
           }
       }        
    }
    
}
