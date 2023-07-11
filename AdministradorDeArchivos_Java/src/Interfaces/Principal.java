package Interfaces;

import Clases.Archivo;
import Clases.Arbol;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

public class Principal extends javax.swing.JFrame {

    public static ArrayList<Archivo> archivosDeTexto = new ArrayList<>();
    public static ArrayList<Archivo> archivosDeDibujo = new ArrayList<>();
    public static ArrayList<Archivo> directorios = new ArrayList<>();
    private TreeNode[] ruta;

    public Principal() {
        initComponents();
        imagenesDeLabels();
        actualizarArbol();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeDirectorios = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbTexto = new javax.swing.JLabel();
        lbDibujar = new javax.swing.JLabel();
        lbDirectorio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemarchivosTextos = new javax.swing.JMenuItem();
        itemArchivosDibujo = new javax.swing.JMenuItem();
        itemDirectorios = new javax.swing.JMenuItem();
        itemTodosLosArchivos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de archivos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        treeDirectorios.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeDirectoriosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(treeDirectorios);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Raiz de almacenamiento");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar)
                        .addComponent(btnActualizar)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Crear archivo");

        lbTexto.setToolTipText("");
        lbTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTextoMouseClicked(evt);
            }
        });

        lbDibujar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDibujarMouseClicked(evt);
            }
        });

        lbDirectorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDirectorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(lbDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jMenu1.setText("Registro");

        ItemarchivosTextos.setText("Archivos de texto");
        ItemarchivosTextos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemarchivosTextosActionPerformed(evt);
            }
        });
        jMenu1.add(ItemarchivosTextos);

        itemArchivosDibujo.setText("Archivos de dibujo");
        itemArchivosDibujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemArchivosDibujoActionPerformed(evt);
            }
        });
        jMenu1.add(itemArchivosDibujo);

        itemDirectorios.setText("Directorios creados");
        itemDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDirectoriosActionPerformed(evt);
            }
        });
        jMenu1.add(itemDirectorios);

        itemTodosLosArchivos.setText("Todos los archivos");
        itemTodosLosArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTodosLosArchivosActionPerformed(evt);
            }
        });
        jMenu1.add(itemTodosLosArchivos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemarchivosTextosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemarchivosTextosActionPerformed
        RegistroDeArchivos registro = new RegistroDeArchivos(archivosDeTexto, "textos");
        registro.setVisible(true);
    }//GEN-LAST:event_ItemarchivosTextosActionPerformed

    private void itemArchivosDibujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemArchivosDibujoActionPerformed
        RegistroDeArchivos registro = new RegistroDeArchivos(archivosDeDibujo, "dibujos");
        registro.setVisible(true);
    }//GEN-LAST:event_itemArchivosDibujoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (ruta != null) {
            String archivo = rutaDeArchivoSeleccionado();
            String extension = archivo.substring(archivo.length() - 3);

            switch (extension) {
                case "txt" -> {
                    Archivo aux = obtenerArchivoDeTexto();
                    if (aux != null) {
                        EditorDeTexto editor = new EditorDeTexto(aux);
                        editor.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "El archivo de texto que intentas abrir no fue creado por este programa, asi que no se abrira");
                    }
                }
                case "png" -> {
                    Archivo aux = obtenerArchivoDeDibujo();
                    if (aux != null) {
                        Dibujar dibujar = new Dibujar(aux);
                        dibujar.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "El archivo de dibujo que intentas abrir no fue creado por este programa, asi que no se abrira");
                    }
                }
                default -> {
                    Archivo aux = obtenerDirectorio();
                    if (aux != null) {
                        aux.abrirArchivo();
                    } else {
                        JOptionPane.showMessageDialog(this, "El directorio que intentas abrir no fue creado por este programa, asi que no se abrira");
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero deberias seleccionar el archivo que quieres abrir...");
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void lbTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTextoMouseClicked
        if (ruta != null && validacionArchivoDeTexto() && validacionDeCreacion() && validacionDeCreacion()) {
            CrearNuevoArchivo creacionDeArchivo = new CrearNuevoArchivo("texto", rutaDeArchivoSeleccionado());
            creacionDeArchivo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una ruta valida, debes saber que solo puedes crear archivos de texto dentro del directorio texto y los directorios creadas dentro del mismo");
        }

    }//GEN-LAST:event_lbTextoMouseClicked

    private void lbDibujarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDibujarMouseClicked
        if (ruta != null && validacionArchivoDeDibujo() && validacionDeCreacion()) {
            CrearNuevoArchivo creacionDeArchivo = new CrearNuevoArchivo("dibujo", rutaDeArchivoSeleccionado());
            creacionDeArchivo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una ruta valida, debes saber que solo puedes crear archivos de dibujo dentro del directorio dibujos y los directorios creadas dentro del mismo");
        }
    }//GEN-LAST:event_lbDibujarMouseClicked

    private void lbDirectorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDirectorioMouseClicked
        if (ruta != null && validacionNuevoDirectorio() && validacionDeCreacion()) {
            CrearNuevoArchivo creacionDeArchivo = new CrearNuevoArchivo("directorio", rutaDeArchivoSeleccionado());
            creacionDeArchivo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una ruta valida, debes saber que solo puedes crear directorios dentro de directorios principales y subdirectorios dentro de |dibujos| y |textos|");
        }
    }//GEN-LAST:event_lbDirectorioMouseClicked

    private void treeDirectoriosValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeDirectoriosValueChanged
        try {
            DefaultMutableTreeNode archivoSeleccionado = (DefaultMutableTreeNode) treeDirectorios.getLastSelectedPathComponent();
            ruta = archivoSeleccionado.getPath();
            validacionArchivoDeTexto();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_treeDirectoriosValueChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarArbol();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void itemDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDirectoriosActionPerformed
        RegistroDeArchivos registro = new RegistroDeArchivos(directorios, "directorios");
        registro.setVisible(true);
    }//GEN-LAST:event_itemDirectoriosActionPerformed

    private void itemTodosLosArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTodosLosArchivosActionPerformed
        ArrayList<Archivo> todosLosArchivos = new ArrayList<>();

        todosLosArchivos.addAll(archivosDeTexto);
        todosLosArchivos.addAll(archivosDeDibujo);
        todosLosArchivos.addAll(directorios);

        RegistroDeArchivos registro = new RegistroDeArchivos(todosLosArchivos, "todos");
        registro.setVisible(true);
    }//GEN-LAST:event_itemTodosLosArchivosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (ruta != null) {
            String archivo = rutaDeArchivoSeleccionado();
            String extension = archivo.substring(archivo.length() - 3);
            Archivo aux = null;
            var opc = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar este archivo? Ten encuenta que si es un directorio primero tendras que eliminar su contenido");
            if (opc == JOptionPane.OK_OPTION) {
                switch (extension) {
                    case "txt" -> {
                        aux = obtenerArchivoDeTexto();
                        if (aux != null) {
                            archivosDeTexto.remove(ubicarEnLista(archivosDeTexto, aux));
                        }
                    }
                    case "png" -> {
                        aux = obtenerArchivoDeDibujo();
                        if (aux != null) {
                            archivosDeDibujo.remove(ubicarEnLista(archivosDeDibujo, aux));
                        }
                    }
                    default -> {
                        aux = obtenerDirectorio();
                        if (aux != null) {
                            directorios.remove(ubicarEnLista(directorios, aux));
                        }
                    }
                }

                if (aux != null) {
                    aux.eliminarArchivo();
                    JOptionPane.showMessageDialog(this, "Archivo eliminado con exito");
                } else {
                    JOptionPane.showMessageDialog(this, "El archivo que intentas eliminar no fue creado por este programa, asi que no se eliminara");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero deberias seleccionar el archivo que quieres abrir...");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Metodos
    
    private boolean validacionArchivoDeTexto() {
        if (rutaDeArchivoSeleccionado().contains("Archivos/textos")) {
            return true;
        }
        return false;
    }

    private boolean validacionArchivoDeDibujo() {
        if (rutaDeArchivoSeleccionado().contains("Archivos/dibujos")) {
            return true;
        }
        return false;
    }

    private boolean validacionNuevoDirectorio() {
        if (rutaDeArchivoSeleccionado().contains("Archivos/")) {
            return true;
        }
        return false;
    }

    private boolean validacionDeCreacion() {
        String rutaDirectorio = "src/" + rutaDeArchivoSeleccionado();
        File archivo = new File(rutaDirectorio);

        return archivo.isDirectory();
    }

    private String rutaDeArchivoSeleccionado() {
        String rutaDeArchivo = "";

        for (int i = 0; i < ruta.length; i++) {
            if (i != (ruta.length - 1)) {
                rutaDeArchivo += ruta[i].toString() + "/";
            } else {
                rutaDeArchivo += ruta[i].toString();

            }
        }

        return rutaDeArchivo;
    }

    public Archivo obtenerArchivoDeDibujo() {
        String nombre = ruta[ruta.length - 1].toString().substring(0, ruta[ruta.length - 1].toString().length() - 4);

        for (int i = 0; i < archivosDeDibujo.size(); i++) {
            if (archivosDeDibujo.get(i).getNombre().equals(nombre)) {
                return archivosDeDibujo.get(i);
            }
        }

        return null;
    }

    private Archivo obtenerArchivoDeTexto() {
        String nombre = ruta[ruta.length - 1].toString().substring(0, ruta[ruta.length - 1].toString().length() - 4);

        for (int i = 0; i < archivosDeTexto.size(); i++) {
            if (archivosDeTexto.get(i).getNombre().equals(nombre)) {
                return archivosDeTexto.get(i);
            }
        }
        return null;
    }

    private Archivo obtenerDirectorio() {
        String nombre = ruta[ruta.length - 1].toString();

        for (int i = 0; i < directorios.size(); i++) {
            if (directorios.get(i).getNombre().equals(nombre)) {
                return directorios.get(i);
            }
        }

        return null;
    }

    public int ubicarEnLista(ArrayList<Archivo> lista, Archivo eliminado) {

        for (int i = 0; i < lista.size(); i++) {
            Archivo aux = lista.get(i);
            if (aux == eliminado) {
                return i;
            }
        }

        return 0;
    }

    //Estados iniciales de Labels y arbol
    private void imagenesDeLabels() {
        JLabel[] listaLb = {lbTexto, lbDibujar, lbDirectorio};
        String[] rutaImagenes = {"archivo-txt", "archivo-dibujar", "carpeta"};

        for (int i = 0; i < listaLb.length; i++) {
            ImageIcon imagen = new ImageIcon("src/Imagenes/" + rutaImagenes[i] + ".png");
            Image imagenEscalada = imagen.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

            listaLb[i].setIcon(imagenFinal);
        }
    }

    private void actualizarArbol() {
        File rutaDeArchivo = new File("src/Archivos");

        TreeModel modelo = Arbol.implementarNodos(rutaDeArchivo);
        treeDirectorios.setModel(modelo);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemarchivosTextos;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JMenuItem itemArchivosDibujo;
    private javax.swing.JMenuItem itemDirectorios;
    private javax.swing.JMenuItem itemTodosLosArchivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDibujar;
    private javax.swing.JLabel lbDirectorio;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JTree treeDirectorios;
    // End of variables declaration//GEN-END:variables
}
