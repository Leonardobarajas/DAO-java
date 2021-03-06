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
public class InsertarRegistro extends javax.swing.JFrame {

    /**
     * Creates new form InsertarRegistro
     */
    public InsertarRegistro() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        btnInsertarReg = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        InsNombre = new javax.swing.JTextField();
        InsNacionalidad = new javax.swing.JTextField();
        InsEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Nacionalidad");

        Edad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Edad.setText("Edad");

        btnInsertarReg.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnInsertarReg.setText("Insertar");

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        InsNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        InsNacionalidad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        InsEdad.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Edad))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InsNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(InsNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(btnInsertarReg))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InsEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnRegresar)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnInsertarReg)
                    .addComponent(InsNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(InsEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        crudAutor h = new crudAutor();
        AutorDAO aut1 = new AutorDAO();
        EliminarRegistro eli1 = new EliminarRegistro();
        InsertarRegistro t = new InsertarRegistro();
        ActualizarRegistro actua1 = new ActualizarRegistro();
        ControladorCRUD control1 = new ControladorCRUD(h, aut1, eli1,t,actua1);
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    public javax.swing.JTextField InsEdad;
    public javax.swing.JTextField InsNacionalidad;
    public javax.swing.JTextField InsNombre;
    public javax.swing.JButton btnInsertarReg;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
