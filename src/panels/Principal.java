/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import AppPackage.AnimationClass;
import java.awt.Color;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {
    Logo panelLogo = new Logo();
    Registroproductos panelregpro = new Registroproductos();
    Apartado panelApartado = new Apartado();
    Venta panelVenta = new Venta();
    Catalogo panelCatalogo = new Catalogo();
    Usuarionuevo panelUsuario = new Usuarionuevo();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        contenedor.add(panelLogo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbVentas = new rojerusan.RSButtonIconI();
        jbApartado = new rojerusan.RSButtonIconI();
        jbReportes = new rojerusan.RSButtonIconI();
        jbRegistros = new rojerusan.RSButtonIconI();
        jbCatalogo = new rojerusan.RSButtonIconI();
        jbFacturaV = new javax.swing.JButton();
        jbProductosR = new javax.swing.JButton();
        jbFacturaRE = new javax.swing.JButton();
        jbProdutosRE = new javax.swing.JButton();
        jbProductoC = new javax.swing.JButton();
        panelGradient1 = new PanelGradient.PanelGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 950, 570));

        jPanel3.setBackground(new java.awt.Color(36, 216, 233));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVentas.setBackground(new java.awt.Color(36, 216, 233));
        jbVentas.setBorder(null);
        jbVentas.setForeground(new java.awt.Color(0, 0, 0));
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/venta.png"))); // NOI18N
        jbVentas.setText("Ventas");
        jbVentas.setBorderPainted(false);
        jbVentas.setColorHover(new java.awt.Color(12, 203, 221));
        jbVentas.setFocusPainted(false);
        jbVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbVentasMouseClicked(evt);
            }
        });
        jbVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVentasActionPerformed(evt);
            }
        });
        jPanel3.add(jbVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 30));

        jbApartado.setBackground(new java.awt.Color(36, 216, 233));
        jbApartado.setBorder(null);
        jbApartado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apartado.png"))); // NOI18N
        jbApartado.setText("Apartado");
        jbApartado.setBorderPainted(false);
        jbApartado.setColorHover(new java.awt.Color(12, 203, 221));
        jbApartado.setFocusPainted(false);
        jbApartado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbApartado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbApartadoMouseClicked(evt);
            }
        });
        jPanel3.add(jbApartado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 30));

        jbReportes.setBackground(new java.awt.Color(36, 216, 233));
        jbReportes.setBorder(null);
        jbReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        jbReportes.setText("Reportes");
        jbReportes.setBorderPainted(false);
        jbReportes.setColorHover(new java.awt.Color(12, 203, 221));
        jbReportes.setFocusPainted(false);
        jbReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbReportesMouseClicked(evt);
            }
        });
        jPanel3.add(jbReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 30));

        jbRegistros.setBackground(new java.awt.Color(36, 216, 233));
        jbRegistros.setBorder(null);
        jbRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        jbRegistros.setText("Registros");
        jbRegistros.setBorderPainted(false);
        jbRegistros.setColorHover(new java.awt.Color(12, 203, 221));
        jbRegistros.setFocusPainted(false);
        jbRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegistrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRegistrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRegistrosMouseExited(evt);
            }
        });
        jbRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrosActionPerformed(evt);
            }
        });
        jPanel3.add(jbRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, 30));

        jbCatalogo.setBackground(new java.awt.Color(36, 216, 233));
        jbCatalogo.setBorder(null);
        jbCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/computer.png"))); // NOI18N
        jbCatalogo.setText("Catalogo");
        jbCatalogo.setBorderPainted(false);
        jbCatalogo.setColorHover(new java.awt.Color(12, 203, 221));
        jbCatalogo.setFocusPainted(false);
        jbCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCatalogoMouseClicked(evt);
            }
        });
        jbCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCatalogoActionPerformed(evt);
            }
        });
        jPanel3.add(jbCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 110, 30));

        jbFacturaV.setBackground(new java.awt.Color(224, 224, 224));
        jbFacturaV.setText("factura");
        jbFacturaV.setBorder(null);
        jbFacturaV.setBorderPainted(false);
        jbFacturaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbFacturaVMouseClicked(evt);
            }
        });
        jPanel3.add(jbFacturaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 100, 20));

        jbProductosR.setBackground(new java.awt.Color(224, 224, 224));
        jbProductosR.setText("Producto");
        jbProductosR.setBorder(null);
        jbProductosR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbProductosRMouseClicked(evt);
            }
        });
        jbProductosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosRActionPerformed(evt);
            }
        });
        jPanel3.add(jbProductosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -20, 100, 20));

        jbFacturaRE.setBackground(new java.awt.Color(224, 224, 224));
        jbFacturaRE.setText("Factura");
        jbFacturaRE.setBorder(null);
        jPanel3.add(jbFacturaRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -20, 100, 20));

        jbProdutosRE.setBackground(new java.awt.Color(224, 224, 224));
        jbProdutosRE.setText("Productos");
        jbProdutosRE.setBorder(null);
        jPanel3.add(jbProdutosRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -45, 100, 20));

        jbProductoC.setBackground(new java.awt.Color(224, 224, 224));
        jbProductoC.setText("Productos");
        jbProductoC.setBorder(null);
        jbProductoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbProductoCMouseClicked(evt);
            }
        });
        jPanel3.add(jbProductoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -20, 100, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 70));

        panelGradient1.setideEndColor(new java.awt.Color(36, 216, 233));
        panelGradient1.setideStartColor(new java.awt.Color(36, 216, 233));
        panelGradient1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVentasMouseClicked
        AnimationClass vent = new AnimationClass();
        vent.jButtonYDown(-20, 40, 10, 5, jbFacturaV);
        
        AnimationClass ventt = new AnimationClass();
        ventt.jButtonYUp(40, -20, 10, 5, jbFacturaV);
    }//GEN-LAST:event_jbVentasMouseClicked

    private void jbVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVentasActionPerformed

    }//GEN-LAST:event_jbVentasActionPerformed

    private void jbCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCatalogoMouseClicked
        AnimationClass cat = new AnimationClass();
        cat.jButtonYDown(-20, 40, 10, 5, jbProductoC);
        AnimationClass catt = new AnimationClass();
        catt.jButtonYUp(40, -20, 10, 5, jbProductoC);
    }//GEN-LAST:event_jbCatalogoMouseClicked

    private void jbApartadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbApartadoMouseClicked
         if (panelLogo.isVisible() || panelregpro.isVisible() || panelVenta.isVisible() || panelCatalogo.isVisible()){
            panelLogo.setVisible(false);
            panelregpro.setVisible(false);
            panelVenta.setVisible(false);
            panelCatalogo.setVisible(false);
            panelApartado.setVisible(true);
            contenedor.add(panelApartado);
            contenedor.validate();
        }
        
    }//GEN-LAST:event_jbApartadoMouseClicked

    private void jbRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRegistrosActionPerformed

    private void jbCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCatalogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCatalogoActionPerformed

    private void jbRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrosMouseEntered

    }//GEN-LAST:event_jbRegistrosMouseEntered

    private void jbRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrosMouseExited

    }//GEN-LAST:event_jbRegistrosMouseExited

    private void jbRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegistrosMouseClicked
        AnimationClass regi = new AnimationClass();
        regi.jButtonYDown(-20, 40, 10, 5, jbProductosR);
        AnimationClass regii = new AnimationClass();
        regii.jButtonYUp(40, -20, 10, 5, jbProductosR);
    }//GEN-LAST:event_jbRegistrosMouseClicked

    private void jbReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbReportesMouseClicked
        AnimationClass rep = new AnimationClass();
        rep.jButtonYDown(-20, 40, 10, 5, jbFacturaRE);
        rep.jButtonYDown(-45, 70, 10, 5, jbProdutosRE);
        AnimationClass repp = new AnimationClass();
        repp.jButtonYUp(40, -20, 10, 5, jbFacturaRE); 
        repp.jButtonYUp(70, -45, 10, 5, jbProdutosRE); 
    }//GEN-LAST:event_jbReportesMouseClicked

    private void jbProductosRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductosRMouseClicked
       if (panelLogo.isVisible() || panelApartado.isVisible() || panelCatalogo.isVisible() || panelVenta.isVisible()){
            panelLogo.setVisible(false);
            panelApartado.setVisible(false);
            panelCatalogo.setVisible(false);
            panelVenta.setVisible(false);
            panelregpro.setVisible(true);
            contenedor.add(panelregpro);
            contenedor.validate();
        }
    }//GEN-LAST:event_jbProductosRMouseClicked

    private void jbProductosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosRActionPerformed
         /*if (panelLogo.isVisible() || panelApartado.isVisible()){
            panelLogo.setVisible(false);
            panelApartado.setVisible(false);
            panelregpro.setVisible(true);
            contenedor.add(panelregpro);
            contenedor.validate();
        }*/
    }//GEN-LAST:event_jbProductosRActionPerformed

    private void jbFacturaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFacturaVMouseClicked
        if (panelLogo.isVisible() || panelApartado.isVisible() || panelregpro.isVisible() || panelCatalogo.isVisible()){
            panelLogo.setVisible(false);
            panelApartado.setVisible(false);
            panelregpro.setVisible(false);
            panelCatalogo.setVisible(false);
            panelVenta.setVisible(true);
            contenedor.add(panelVenta);
            contenedor.validate();
        }
    }//GEN-LAST:event_jbFacturaVMouseClicked

    private void jbProductoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProductoCMouseClicked
        if (panelLogo.isVisible() || panelApartado.isVisible() || panelregpro.isVisible() || panelVenta.isVisible()){
            panelLogo.setVisible(false);
            panelApartado.setVisible(false);
            panelregpro.setVisible(false);
            panelVenta.setVisible(false);
            panelCatalogo.setVisible(true);
            contenedor.add(panelCatalogo);
            contenedor.validate();
        }
    }//GEN-LAST:event_jbProductoCMouseClicked

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel3;
    private rojerusan.RSButtonIconI jbApartado;
    private rojerusan.RSButtonIconI jbCatalogo;
    private javax.swing.JButton jbFacturaRE;
    private javax.swing.JButton jbFacturaV;
    private javax.swing.JButton jbProductoC;
    private javax.swing.JButton jbProductosR;
    private javax.swing.JButton jbProdutosRE;
    private rojerusan.RSButtonIconI jbRegistros;
    private rojerusan.RSButtonIconI jbReportes;
    private rojerusan.RSButtonIconI jbVentas;
    private PanelGradient.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables
}
