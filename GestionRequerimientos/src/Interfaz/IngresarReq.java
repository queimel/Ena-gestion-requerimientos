/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import gestionrequerimientos.BaseDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author queimel
 */
public class IngresarReq extends javax.swing.JFrame {

    private BaseDatos miBD = new BaseDatos();
    
    /**
     * Creates new form IngresarRequerimiento
     */
    public IngresarReq() {
        initComponents();
        cargarCBO("gerencia", cb_gerencia);
        cargarCBO("asignacion", cb_asignar);
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
        jSeparator1 = new javax.swing.JSeparator();
        lbl_gerencia = new javax.swing.JLabel();
        cb_gerencia = new javax.swing.JComboBox<>();
        lbl_depto = new javax.swing.JLabel();
        cb_depto = new javax.swing.JComboBox<>();
        lbl_asignar = new javax.swing.JLabel();
        cb_asignar = new javax.swing.JComboBox<>();
        lbl_encargado = new javax.swing.JLabel();
        cb_encargado = new javax.swing.JComboBox<>();
        lbl_req = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_requerimiento = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("wqwe");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Requerimiento");

        lbl_gerencia.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_gerencia.setText("Gerencia:");

        cb_gerencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cb_gerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_gerenciaActionPerformed(evt);
            }
        });

        lbl_depto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_depto.setText("Depto.:");

        cb_depto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lbl_asignar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_asignar.setText("Asignar a:");

        cb_asignar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cb_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_asignarActionPerformed(evt);
            }
        });

        lbl_encargado.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_encargado.setText("Encargado:");

        cb_encargado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lbl_req.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_req.setText("Requerimiento:");

        txt_requerimiento.setColumns(20);
        txt_requerimiento.setRows(5);
        txt_requerimiento.setText("Ingrese descripción del requerimiento");
        txt_requerimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_requerimientoFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txt_requerimiento);

        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        jButton1.setText("Volver al menú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_gerencia)
                                        .addComponent(lbl_depto)
                                        .addComponent(lbl_asignar))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_asignar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_depto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_gerencia, 0, 175, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_encargado)
                                    .addGap(61, 61, 61)
                                    .addComponent(cb_encargado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_req)
                                    .addComponent(btn_guardar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jButton1)))))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_gerencia)
                    .addComponent(cb_gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_depto)
                    .addComponent(cb_depto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_asignar)
                    .addComponent(cb_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_encargado)
                    .addComponent(cb_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_req)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_gerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_gerenciaActionPerformed
        int gerencia = cb_gerencia.getSelectedIndex();
        cargarDepto(gerencia, cb_depto);
    }//GEN-LAST:event_cb_gerenciaActionPerformed

    private void cb_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_asignarActionPerformed
        int asignacion = cb_asignar.getSelectedIndex();
        cargarEncargado(asignacion, cb_encargado);
    }//GEN-LAST:event_cb_asignarActionPerformed

    private void txt_requerimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_requerimientoFocusGained
        txt_requerimiento.setText("");
    }//GEN-LAST:event_txt_requerimientoFocusGained

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        int gerencia = cb_gerencia.getSelectedIndex();
        int depto = cb_depto.getSelectedIndex();
        int asignacion = cb_asignar.getSelectedIndex();
        String requerimiento = txt_requerimiento.getText().trim();

        boolean ingresoReq = miBD.ingresarRequerimiento(gerencia, depto, asignacion, requerimiento, true);
        
        if(ingresoReq){
            JOptionPane.showMessageDialog(null, "Requerimiento ingresado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "El requerimiento no pudo ser ingresado");
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(IngresarReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarReq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarReq().setVisible(true);
            }
        });
    }
    
    public void cargarCBO(String key, javax.swing.JComboBox<String> combo){
        
        ArrayList<String> listaCBO = miBD.cargarCB(key);
        for (int i = 0; i < listaCBO.size(); i++) {
            String item = listaCBO.get(i);
            combo.addItem(item);  
        }
    }
    
    public void cargarDepto(int gerencia, javax.swing.JComboBox<String> combo){
        combo.removeAllItems();
        combo.addItem("Seleccionar");
        ArrayList<String> listaCBO = miBD.cargarCBDepto(gerencia);
        for (int i = 0; i < listaCBO.size(); i++) {
            String item = listaCBO.get(i);
            combo.addItem(item);  
        }
    }
    
    public void cargarEncargado(int asignacion, javax.swing.JComboBox<String> combo){
        combo.removeAllItems();
        combo.addItem("Seleccionar");
        ArrayList<String> listaCBO = miBD.cargarCBEncargado(asignacion);
        for (int i = 0; i < listaCBO.size(); i++) {
            String item = listaCBO.get(i);
            combo.addItem(item);  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cb_asignar;
    private javax.swing.JComboBox<String> cb_depto;
    private javax.swing.JComboBox<String> cb_encargado;
    private javax.swing.JComboBox<String> cb_gerencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_asignar;
    private javax.swing.JLabel lbl_depto;
    private javax.swing.JLabel lbl_encargado;
    private javax.swing.JLabel lbl_gerencia;
    private javax.swing.JLabel lbl_req;
    private javax.swing.JTextArea txt_requerimiento;
    // End of variables declaration//GEN-END:variables
}
