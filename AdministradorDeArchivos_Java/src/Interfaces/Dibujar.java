package Interfaces;

import Clases.Archivo;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Dibujar extends javax.swing.JFrame {

    private boolean elipse = true, linea, rectangulo, archivoGuardado;
    private Color colorActual = Color.blue, colorAnterior = Color.BLACK;
    private BufferedImage img;
    private Graphics2D g;
    private int pX, pY;
    private Archivo archivo;

    public Dibujar(Archivo archivo) {
        initComponents();
        imagenesDeLabels();
        this.archivo = archivo;
        
        if(archivo.isModificado()){
            img = archivo.abrirImagen();
            g = img.createGraphics();
            panelDibujo.repaint();   
        } else {
        img = new BufferedImage(788, 386, BufferedImage.TYPE_INT_ARGB);
            g = img.createGraphics();   
        }
        
        g.setColor(Color.BLUE);
    }

    public Dibujar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbColorAnterior = new javax.swing.JPanel();
        LbSeleccionardorColor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbRectangulo = new javax.swing.JLabel();
        lbLinea = new javax.swing.JLabel();
        lbEclipse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbGuardar = new javax.swing.JLabel();
        lbAbrir = new javax.swing.JLabel();
        lbNuevo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelDibujo = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, null);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Pinceles y colores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Anterior");

        jLabel3.setText("Nuevo");

        lbColorAnterior.setBackground(new java.awt.Color(0, 0, 0));
        lbColorAnterior.setMaximumSize(new java.awt.Dimension(41, 16));
        lbColorAnterior.setMinimumSize(new java.awt.Dimension(41, 16));
        lbColorAnterior.setPreferredSize(new java.awt.Dimension(41, 39));
        lbColorAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbColorAnteriorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout lbColorAnteriorLayout = new javax.swing.GroupLayout(lbColorAnterior);
        lbColorAnterior.setLayout(lbColorAnteriorLayout);
        lbColorAnteriorLayout.setHorizontalGroup(
            lbColorAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lbColorAnteriorLayout.setVerticalGroup(
            lbColorAnteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        LbSeleccionardorColor.setBackground(new java.awt.Color(0, 0, 102));
        LbSeleccionardorColor.setMaximumSize(new java.awt.Dimension(41, 16));
        LbSeleccionardorColor.setMinimumSize(new java.awt.Dimension(41, 16));
        LbSeleccionardorColor.setPreferredSize(new java.awt.Dimension(41, 39));
        LbSeleccionardorColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbSeleccionardorColorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LbSeleccionardorColorLayout = new javax.swing.GroupLayout(LbSeleccionardorColor);
        LbSeleccionardorColor.setLayout(LbSeleccionardorColorLayout);
        LbSeleccionardorColorLayout.setHorizontalGroup(
            LbSeleccionardorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LbSeleccionardorColorLayout.setVerticalGroup(
            LbSeleccionardorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbColorAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(LbSeleccionardorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbSeleccionardorColor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbColorAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)))
                .addGap(9, 9, 9))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbRectangulo.setPreferredSize(new java.awt.Dimension(41, 39));
        lbRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRectanguloMouseClicked(evt);
            }
        });

        lbLinea.setPreferredSize(new java.awt.Dimension(41, 39));
        lbLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLineaMouseClicked(evt);
            }
        });

        lbEclipse.setPreferredSize(new java.awt.Dimension(41, 39));
        lbEclipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEclipseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEclipse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEclipse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbGuardar.setPreferredSize(new java.awt.Dimension(41, 39));
        lbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGuardarMouseClicked(evt);
            }
        });

        lbAbrir.setToolTipText("");
        lbAbrir.setPreferredSize(new java.awt.Dimension(41, 39));
        lbAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAbrirMouseClicked(evt);
            }
        });

        lbNuevo.setPreferredSize(new java.awt.Dimension(41, 39));
        lbNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(lbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Opciones de guardado");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(4, 4, 4))
        );

        panelDibujo.setBackground(new java.awt.Color(255, 255, 255));
        panelDibujo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDibujo.setMaximumSize(new java.awt.Dimension(788, 386));
        panelDibujo.setMinimumSize(new java.awt.Dimension(788, 386));
        panelDibujo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelDibujoMouseDragged(evt);
            }
        });
        panelDibujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDibujoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbEclipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEclipseMouseClicked
        elipse = true;
        linea = false;
        rectangulo = false;
    }//GEN-LAST:event_lbEclipseMouseClicked

    private void lbRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRectanguloMouseClicked
        rectangulo = true;
        elipse = false;
        linea = false;
    }//GEN-LAST:event_lbRectanguloMouseClicked

    private void lbLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLineaMouseClicked
        linea = true;
        elipse = false;
        rectangulo = false;
    }//GEN-LAST:event_lbLineaMouseClicked

    private void LbSeleccionardorColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbSeleccionardorColorMouseClicked
        colorAnterior = colorActual;
        Color colorSeleccionado = JColorChooser.showDialog(this, "Selecciona el color", colorActual);
        colorActual = colorSeleccionado;
        g.setColor(colorActual);

        lbColorAnterior.setBackground(colorAnterior);
        LbSeleccionardorColor.setBackground(colorActual);
    }//GEN-LAST:event_LbSeleccionardorColorMouseClicked

    private void panelDibujoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDibujoMousePressed
        archivoGuardado = false;
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_panelDibujoMousePressed

    private void panelDibujoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDibujoMouseDragged
        archivoGuardado = false;
        
        if (linea) {
            g.drawLine(pX, pY, evt.getX(), evt.getY());
            pX = evt.getX();
            pY = evt.getY();
        } else if (elipse) {
            g.fillOval(evt.getX() - 5, evt.getY() - 5, 60, 40);
        } else {
            g.fillRect(evt.getX() - 5, evt.getY(), 90, 60);
        }

        panelDibujo.repaint();
    }//GEN-LAST:event_panelDibujoMouseDragged

    private void lbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGuardarMouseClicked
        if(archivo.editarArchivo(img)){
            JOptionPane.showMessageDialog(this, "Imagen guardada correctamente.", "Guardar imagen", JOptionPane.INFORMATION_MESSAGE);
            archivoGuardado = true;
        }
        else{
            JOptionPane.showMessageDialog(this, "Error al guardar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_lbGuardarMouseClicked

    private void lbColorAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbColorAnteriorMouseClicked
        colorActual = colorAnterior;
        g.setColor(colorAnterior);
    }//GEN-LAST:event_lbColorAnteriorMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!archivoGuardado) {
            var opc = JOptionPane.showConfirmDialog(this, "Espera no has guardado los cambios, deseas aun asi no guardar nada y salir?");

            if (opc == JOptionPane.NO_OPTION) {
                this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            } else {
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        } else {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void lbNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNuevoMouseClicked
        JOptionPane.showMessageDialog(this, "No me alcanzo el tiempo para programar esto xd");
    }//GEN-LAST:event_lbNuevoMouseClicked

    private void lbAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAbrirMouseClicked
        JOptionPane.showMessageDialog(this, "No me alcanzo el tiempo para programar esto xd");
    }//GEN-LAST:event_lbAbrirMouseClicked

    private void imagenesDeLabels() {
        JLabel[] listaLb = {lbLinea, lbRectangulo, lbEclipse, lbNuevo, lbAbrir, lbGuardar};
        String[] rutaImagenes = {"linea", "rectangulo", "elipse", "nuevo", "abrir", "guardar"};

        for (int i = 0; i < listaLb.length; i++) {
            ImageIcon imagen = new ImageIcon("src/Imagenes/" + rutaImagenes[i] + ".png");
            Image imagenEscalada = imagen.getImage().getScaledInstance(41, 39, Image.SCALE_SMOOTH);
            ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

            listaLb[i].setIcon(imagenFinal);
        }
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
            java.util.logging.Logger.getLogger(Dibujar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dibujar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dibujar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dibujar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dibujar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LbSeleccionardorColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbAbrir;
    private javax.swing.JPanel lbColorAnterior;
    private javax.swing.JLabel lbEclipse;
    private javax.swing.JLabel lbGuardar;
    private javax.swing.JLabel lbLinea;
    private javax.swing.JLabel lbNuevo;
    private javax.swing.JLabel lbRectangulo;
    public javax.swing.JPanel panelDibujo;
    private javax.swing.JPanel seleccionardorColor1;
    private javax.swing.JPanel seleccionardorColor2;
    private javax.swing.JPanel seleccionardorColor3;
    // End of variables declaration//GEN-END:variables
}
