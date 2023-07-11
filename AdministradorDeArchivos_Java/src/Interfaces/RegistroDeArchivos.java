/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Archivo;
import Clases.ExportarAExcel;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class RegistroDeArchivos extends javax.swing.JFrame {

    private ArrayList<Archivo> archivosAProcesar;
    private String tipo;
    
    public RegistroDeArchivos(ArrayList<Archivo> archivosAProcesar, String tipo) {
        initComponents();
        this.archivosAProcesar = archivosAProcesar;
        insertarDatosEnTabla();
        this.tipo = tipo;
    }
    
    public RegistroDeArchivos() {
        initComponents();
    }
    
    public void insertarDatosEnTabla() {

        String Ver[][] = new String[archivosAProcesar.size()][6];
        Archivo aux = new Archivo();

        for (int i = 0; i < archivosAProcesar.size(); i++) {
            aux = archivosAProcesar.get(i);

            Ver[i][0] = aux.getNombre();
            Ver[i][1] = aux.getAutor();
            Ver[i][2] = aux.getTipoDeArchivo();
            Ver[i][3] = aux.getTamanio();
            Ver[i][4] = aux.getFechaDeCreacion();
            Ver[i][5] = aux.getFechaDeModificacion();
        }
        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
                Ver,
                new String[]{
                    "Nombre", "Autor", "Tipo de archivo", "Tamaño", "Fecha de creacion", "Fecha de modificacion"
                }
        ));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegistro = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Autor", "Tipo de archivo", "Tamanio", "Fecha de creacion", "Fecha de modificacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRegistro);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Registro de archivos");

        btnExportar.setText("Exportar en Excel");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(324, 324, 324))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportar)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        
        var opc = JOptionPane.showConfirmDialog(this, """
                                                      Estas seguro de exportar esta tabla? Ten encuenta que si ya habias exportado el registro para esta tabla
                                                      se sobreescribira.
                                                      
                                                      En otras palabras si ya exportaste el registro de archivos de textos y luego eliminaste o creaste mas archivos e intentas
                                                      exportar el nuevo registro, el registro anterior (archivo excel exportado) se sobreescribira por uno nuevo.                                                      
                                                      """);
        
        if(opc == JOptionPane.OK_OPTION){
        ExportarAExcel exportar;
            try {
                exportar = new ExportarAExcel();
                exportar.exportarExcel(tbRegistro, tipo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btnExportarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeArchivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRegistro;
    // End of variables declaration//GEN-END:variables
}
