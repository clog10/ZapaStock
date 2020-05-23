
package panels;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Venta extends javax.swing.JPanel {
    Conexion con = new Conexion();
    Connection cnn= con.conexion();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel modelo2 = new DefaultTableModel();
    
    public Venta() {
        initComponents();
        mostrar("");
    }

    void mostrar(String valor){ //String valor
        modelo2.addColumn("Codigo");
        //modelo.addColumn("Tipo");
        modelo2.addColumn("Marca");
        modelo2.addColumn("Color");
        modelo2.addColumn("Numeracion");
       // modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio");
        jtVenta.setModel(modelo2);
       // modelo.addColumn("Importe");
        
       /* int filaseleccionada = jtVenta.getSelectedRow();
        int cod = Integer.parseInt(jtVenta.getValueAt(filaseleccionada, 0).toString());
        String []datos = new String[9];
        
        try {
            st= cnn.createStatement();
            rs=st.executeQuery("SELECT * FROM producto_b WHERE codigo_b='"+ cod+"'");
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
            jtVenta.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registroproductos.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        materialButtomRectangle1 = new principal.MaterialButtomRectangle();
        jbBuscar = new principal.MaterialButtomRectangle();
        materialButtomRectangle3 = new principal.MaterialButtomRectangle();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVenta = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        panelRound1.setColorDeBorde(new java.awt.Color(204, 204, 204));
        panelRound1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRound1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jCTextField1.setBorder(null);
        jCTextField1.setPlaceholder("Agrega un producto");

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

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 50));

        materialButtomRectangle1.setBackground(new java.awt.Color(255, 51, 102));
        materialButtomRectangle1.setBorder(null);
        materialButtomRectangle1.setForeground(new java.awt.Color(153, 255, 255));
        materialButtomRectangle1.setText("regresar");
        materialButtomRectangle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(materialButtomRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 90, 40));

        jbBuscar.setBackground(new java.awt.Color(255, 51, 102));
        jbBuscar.setBorder(null);
        jbBuscar.setForeground(new java.awt.Color(153, 255, 255));
        jbBuscar.setText("buscar");
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 90, 40));

        materialButtomRectangle3.setBackground(new java.awt.Color(255, 51, 102));
        materialButtomRectangle3.setBorder(null);
        materialButtomRectangle3.setForeground(new java.awt.Color(153, 255, 255));
        materialButtomRectangle3.setText("pagar");
        materialButtomRectangle3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        materialButtomRectangle3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jPanel1.add(materialButtomRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 90, 40));

        jLabel2.setText("Zapateria MayLu");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel3.setText("San Pablo Huixtepec");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel4.setText("Telf: 9512334942");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jLabel5.setText("Av. Juarez #49");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        jtVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtVenta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 760, 340));

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setText("V E N T A    DE    P R O D U C T O S");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseClicked
       Buscarpro bp = new Buscarpro();
       bp.setVisible(true);
    }//GEN-LAST:event_jbBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButtomRectangle jbBuscar;
    private javax.swing.JTable jtVenta;
    private principal.MaterialButtomRectangle materialButtomRectangle1;
    private principal.MaterialButtomRectangle materialButtomRectangle3;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
