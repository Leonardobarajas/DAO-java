/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ControladorCRUD;
import model.AutorDAO;

/**
 *
 * @author ACER
 */
public class crudAutor extends javax.swing.JFrame {

    /**
     * Creates new form crudAutor
     */
    public crudAutor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnconsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdatos = new javax.swing.JTable();
        btnVistaEliminar = new javax.swing.JButton();
        btnvistainsertar = new javax.swing.JButton();
        btnvistaactualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        setForeground(new java.awt.Color(204, 0, 204));

        btnconsultar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        jtdatos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        jtdatos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jtdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Nacionalidad", "Edad"
            }
        ));
        jtdatos.setGridColor(new java.awt.Color(102, 0, 0));
        jScrollPane1.setViewportView(jtdatos);

        btnVistaEliminar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnVistaEliminar.setText("Eliminar un Registro");
        btnVistaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaEliminarActionPerformed(evt);
            }
        });

        btnvistainsertar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnvistainsertar.setText("Insertar un Registro");
        btnvistainsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistainsertarActionPerformed(evt);
            }
        });

        btnvistaactualizar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnvistaactualizar.setText("Actualizar un Registro ");
        btnvistaactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistaactualizarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CRUD.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVistaEliminar)
                        .addGap(75, 75, 75)
                        .addComponent(btnvistainsertar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnconsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnvistaactualizar)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVistaEliminar)
                    .addComponent(btnvistainsertar)
                    .addComponent(btnvistaactualizar))
                .addGap(32, 32, 32)
                .addComponent(btnconsultar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnVistaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaEliminarActionPerformed
        crudAutor h = new crudAutor();
        AutorDAO aut1 = new AutorDAO();
        EliminarRegistro g = new EliminarRegistro();
        InsertarRegistro t = new InsertarRegistro();
        ActualizarRegistro actua1 = new ActualizarRegistro();
        ControladorCRUD control1 = new ControladorCRUD(h, aut1, g,t,actua1);
        g.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVistaEliminarActionPerformed

    private void btnvistainsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistainsertarActionPerformed
        crudAutor h = new crudAutor();
        AutorDAO aut1 = new AutorDAO();
        EliminarRegistro g = new EliminarRegistro();
        InsertarRegistro t = new InsertarRegistro();
        ActualizarRegistro actua1 = new ActualizarRegistro();
        ControladorCRUD control1 = new ControladorCRUD(h, aut1, g,t,actua1);
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvistainsertarActionPerformed

    private void btnvistaactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistaactualizarActionPerformed
        crudAutor h = new crudAutor();
        AutorDAO aut1 = new AutorDAO();
        EliminarRegistro g = new EliminarRegistro();
        InsertarRegistro t = new InsertarRegistro();
        ActualizarRegistro actua1 = new ActualizarRegistro();
        ControladorCRUD control1 = new ControladorCRUD(h, aut1, g,t,actua1);
        actua1.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btnvistaactualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnVistaEliminar;
    public javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnvistaactualizar;
    private javax.swing.JButton btnvistainsertar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtdatos;
    // End of variables declaration//GEN-END:variables
}
