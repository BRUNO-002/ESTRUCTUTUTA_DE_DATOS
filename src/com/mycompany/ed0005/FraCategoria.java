/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ed0005;
import dao.CategoriaDAO;
import dto.Categoria;
import javax.swing.JOptionPane;
public class FraCategoria extends javax.swing.JFrame {
    CategoriaDAO cateDAO=new CategoriaDAO();
    public FraCategoria() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnMostrr = new javax.swing.JButton();
        btnOrdenarBurbuja = new javax.swing.JButton();
        btnInsertarAlInicio = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblCodigo.setText("CODIGO");
        lblCodigo.setToolTipText("");

        lblNombre.setText("NOMBRE");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrr.setText("Mostrar");
        btnMostrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrrActionPerformed(evt);
            }
        });

        btnOrdenarBurbuja.setText("Ordenar Burbuja");
        btnOrdenarBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarBurbujaActionPerformed(evt);
            }
        });

        btnInsertarAlInicio.setText("Insertar al inicio");
        btnInsertarAlInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAlInicioActionPerformed(evt);
            }
        });

        btnFinal.setText("Final");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarAlInicio)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnAgregar)))
                        .addGap(53, 53, 53)
                        .addComponent(btnOrdenarBurbuja)
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrr)
                                .addGap(44, 44, 44)
                                .addComponent(btnFinal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenarBurbuja)
                    .addComponent(btnInsertarAlInicio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMostrr)
                    .addComponent(btnFinal))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrrActionPerformed
        JOptionPane.showMessageDialog(rootPane,cateDAO.leer());
    }//GEN-LAST:event_btnMostrrActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Categoria cate=new Categoria();
        cate.setCodiCate(Integer.parseInt(txtCodigo.getText()));
        cate.setNombreCate(txtNombre.getText());
        cate.setSig(null);
        cateDAO.agregar(cate);
        JOptionPane.showMessageDialog(rootPane,"Agregó correctamente");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarBurbujaActionPerformed
        cateDAO.ordenarPorCodigo();
        JOptionPane.showMessageDialog(rootPane, "La lista ha sido ordenada por codigo--Presione mostrar para ver el resultado");
    }//GEN-LAST:event_btnOrdenarBurbujaActionPerformed

    private void btnInsertarAlInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAlInicioActionPerformed
        Categoria cate=new Categoria();
        cate.setCodiCate(Integer.parseInt(txtCodigo.getText()));
        cate.setNombreCate(txtNombre.getText());
        cate.setSig(null);
        
        cateDAO.agregarAlInicio(cate);
        JOptionPane.showMessageDialog(rootPane,"Se agregó al inicio correctamente");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnInsertarAlInicioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        System.exit(0);
        JOptionPane.showMessageDialog(rootPane,"Gracias por usar mi programa :))");
    }//GEN-LAST:event_btnFinalActionPerformed

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
            java.util.logging.Logger.getLogger(FraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FraCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FraCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnInsertarAlInicio;
    private javax.swing.JButton btnMostrr;
    private javax.swing.JButton btnOrdenarBurbuja;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
