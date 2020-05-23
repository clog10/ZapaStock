
package panels;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscarpro extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cnn= con.conexion();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Buscarpro() {
        initComponents();
        mostrar("");
    }
    
    void mostrar(String valor){
        modelo.addColumn("Codigo");
        modelo.addColumn("Color");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Stock");
        modelo.addColumn("Precio");
        modelo.addColumn("Imagen");
        modelo.addColumn("Numeracion");
        jtBuscarPro.setModel(modelo);
        String sql="";
        if(valor.equals("")){
            sql="SELECT * FROM producto_b";
        } else {
            sql="SELECT * FROM producto_b WHERE codigo_b='"+ valor+"'";
        }
        
        String []datos = new String[9];
        
        try {
            st= cnn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                modelo.addRow(datos);
            }
            jtBuscarPro.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registroproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void meto(){
        Venta v = new Venta();
        int cov,numzap,cantzap,preczap;
        String marczap,colozap;
        int filaseleccionada = jtBuscarPro.getSelectedRow();
        if(filaseleccionada >=0){
            
            cov=Integer.parseInt(jtBuscarPro.getValueAt(filaseleccionada, 0).toString());
            marczap=jtBuscarPro.getValueAt(filaseleccionada, 3).toString();
            colozap=jtBuscarPro.getValueAt(filaseleccionada, 1).toString();
            numzap=Integer.parseInt(jtBuscarPro.getValueAt(filaseleccionada, 8).toString());
            //jtBuscarPro.getValueAt(filaseleccionada, 4).toString(); // cantidad
            preczap=Integer.parseInt(jtBuscarPro.getValueAt(filaseleccionada, 6).toString());
            Object file[]={cov,marczap,colozap,numzap,preczap};
            
            v.modelo2.addRow(file);
           // jtfStock.setText(jtbRegistro.getValueAt(fila, 5).toString());
            int cod = Integer.parseInt(jtBuscarPro.getValueAt(filaseleccionada, 0).toString());
            int stock1 = Integer.parseInt(jtBuscarPro.getValueAt(filaseleccionada, 5).toString());
            int stock2=stock1-1;
            
            try {
            pst = cnn.prepareStatement("UPDATE producto_b SET stock ='"+ stock2+"' WHERE codigo_b='" +cod+"'");
            pst.executeUpdate();
            mostrar("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex.getMessage());
        }

        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgOpciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbZapateria = new javax.swing.JRadioButton();
        jrbBisuteria = new javax.swing.JRadioButton();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        jbBuscar = new principal.MaterialButtomRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuscarPro = new javax.swing.JTable();
        jbAgregar = new principal.MaterialButtomRectangle();
        jbRegresar = new principal.MaterialButtomRectangle();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Selecciona una opcion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 20));

        jrbZapateria.setBackground(new java.awt.Color(255, 255, 255));
        jbgOpciones.add(jrbZapateria);
        jrbZapateria.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jrbZapateria.setText("Zapateria");
        jrbZapateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbZapateriaMouseClicked(evt);
            }
        });
        jPanel1.add(jrbZapateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jrbBisuteria.setBackground(new java.awt.Color(255, 255, 255));
        jbgOpciones.add(jrbBisuteria);
        jrbBisuteria.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jrbBisuteria.setText("Bisuteria");
        jPanel1.add(jrbBisuteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        panelRound1.setColorDeBorde(new java.awt.Color(204, 204, 204));
        panelRound1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRound1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jCTextField1.setBorder(null);
        jCTextField1.setForeground(new java.awt.Color(109, 109, 109));
        jCTextField1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jCTextField1.setPlaceholder("Busca un producto");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 270, 50));

        jbBuscar.setBackground(new java.awt.Color(255, 51, 102));
        jbBuscar.setBorder(null);
        jbBuscar.setForeground(new java.awt.Color(153, 255, 255));
        jbBuscar.setText("Buscar");
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 100, 40));

        jtBuscarPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtBuscarPro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, 790, 320));

        jbAgregar.setBackground(new java.awt.Color(255, 51, 102));
        jbAgregar.setBorder(null);
        jbAgregar.setForeground(new java.awt.Color(153, 255, 255));
        jbAgregar.setText("agregar");
        jbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 100, 40));

        jbRegresar.setBackground(new java.awt.Color(255, 51, 102));
        jbRegresar.setBorder(null);
        jbRegresar.setForeground(new java.awt.Color(153, 255, 255));
        jbRegresar.setText("regresar");
        jbRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(jbRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 100, 40));

        jPanel2.setBackground(new java.awt.Color(36, 216, 233));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbRegresarMouseClicked

    private void jrbZapateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbZapateriaMouseClicked
        if(jrbZapateria.isSelected()){
            mostrar("");
        } else if (jrbBisuteria.isSelected()){
            // aqui va el metodo de Bisuteria
        }
    }//GEN-LAST:event_jrbZapateriaMouseClicked

    private void jbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAgregarMouseClicked
        meto();
        
    }//GEN-LAST:event_jbAgregarMouseClicked

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
            java.util.logging.Logger.getLogger(Buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscarpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButtomRectangle jbAgregar;
    private principal.MaterialButtomRectangle jbBuscar;
    private principal.MaterialButtomRectangle jbRegresar;
    private javax.swing.ButtonGroup jbgOpciones;
    private javax.swing.JRadioButton jrbBisuteria;
    private javax.swing.JRadioButton jrbZapateria;
    private javax.swing.JTable jtBuscarPro;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
