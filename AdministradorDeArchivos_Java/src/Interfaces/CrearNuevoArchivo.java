package Interfaces;

import Clases.*;
import static Interfaces.Principal.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CrearNuevoArchivo extends javax.swing.JFrame {

    private String tipoDeArchivo;
    private String ruta;
    private boolean archivoCreado;

    public CrearNuevoArchivo(String tipoDeArchivo) {
        initComponents();
        this.tipoDeArchivo = tipoDeArchivo;
    }

    public CrearNuevoArchivo(String tipoDeArchivo, String ruta) {
        initComponents();
        this.tipoDeArchivo = tipoDeArchivo;
        this.ruta = ruta;
    }

    public CrearNuevoArchivo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreArchi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreArchi = new javax.swing.JTextField();
        lbAutorArchi = new javax.swing.JLabel();
        txtAutorArchi = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbNombreArchi.setText("Nombre del archivo:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Definir archivo");

        lbAutorArchi.setText("Autor del archivo:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAutorArchi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutorArchi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNombreArchi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreArchi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreArchi)
                    .addComponent(txtNombreArchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutorArchi)
                    .addComponent(txtAutorArchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void marcandoVacios() {
        JTextField[] listaTxt = {txtNombreArchi, txtAutorArchi};
        JLabel[] listaLb = {lbNombreArchi, lbAutorArchi};

        for (int i = 0; i < listaTxt.length; i++) {

            if (listaTxt[i].getText().isEmpty() || listaTxt[i].getText().isBlank()) {
                listaLb[i].setForeground(Color.red);
            } else {
                listaLb[i].setForeground(Color.black);
            }
        }
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        marcandoVacios();
        String validEspacio = txtNombreArchi.getText().substring(txtNombreArchi.getText().length() - 1, txtNombreArchi.getText().length());
        
        var validNombre = (txtNombreArchi.getText().isEmpty() || txtNombreArchi.getText().isBlank() || validEspacio.equals(" "));
        var validAutor = (txtAutorArchi.getText().isEmpty() || txtAutorArchi.getText().isBlank() || !txtAutorArchi.getText().matches("[a-zA-Z]*"));

        if (!validNombre && !validAutor) {
            String nombre = txtNombreArchi.getText();
            String autor = txtAutorArchi.getText();
            String tipoArchivo = "";

            switch (tipoDeArchivo) {
                case "texto" -> {
                    Principal.archivosDeTexto.add(new Texto(nombre, autor, ruta));
                    if (archivosDeTexto.get(archivosDeTexto.size() - 1).crearArchivo()) {
                        tipoArchivo = "Archivo de texto";
                    }
                }
                case "dibujo" -> {
                    Principal.archivosDeDibujo.add(new Dibujo(nombre, autor, ruta));
                    if (archivosDeDibujo.get(archivosDeDibujo.size() - 1).crearArchivo()) {
                        tipoArchivo = "Archivo de dibujo";
                    }
                }
                case "directorio" -> {
                    Principal.directorios.add(new Directorio(nombre, autor, ruta));
                    if (directorios.get(directorios.size() - 1).crearArchivo()) {
                        tipoArchivo = "Directorio";
                    }
                }
            }
            archivoCreado = true;

            txtNombreArchi.setEnabled(false);
            txtAutorArchi.setEnabled(false);
            btnAceptar.setEnabled(false);
            JOptionPane.showMessageDialog(this, tipoArchivo + " creado correctamente, ahora cierra esta ventana");
        } else {
            JOptionPane.showMessageDialog(this, "Asegurate de llenar correctamente los campos tambien recuerda que el nombre no debe terminar en espacio vacio");
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!archivoCreado) {
            var opcion = JOptionPane.showConfirmDialog(this, "Estas seguro de cerrar la ventana? Ten encuenta que esto cancelara la opcion");

            if (opcion == JOptionPane.OK_OPTION) {
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            } else {
                this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }
        } else {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CrearNuevoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevoArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbAutorArchi;
    private javax.swing.JLabel lbNombreArchi;
    private javax.swing.JTextField txtAutorArchi;
    private javax.swing.JTextField txtNombreArchi;
    // End of variables declaration//GEN-END:variables
}
