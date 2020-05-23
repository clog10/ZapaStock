
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


public class Usuarionuevo extends javax.swing.JPanel {
Conexion con = new Conexion();
    Connection cnn= con.conexion();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Usuarionuevo() {
        initComponents();
        mostrar();
    }

   void mostrar(){
       modelo.addColumn("ID Usuario");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Tipo de Usuario");
        jtUsuario.setModel(modelo);
        String []datos = new String[4];
        
        try {
            st= cnn.createStatement();
            rs=st.executeQuery("SELECT * FROM usuario");
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            jtUsuario.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Registroproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfContraseña = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jcbTipoUsu = new javax.swing.JComboBox<>();
        materialButtomRectangle1 = new principal.MaterialButtomRectangle();
        jbRegistrar = new principal.MaterialButtomRectangle();
        materialButtomRectangle3 = new principal.MaterialButtomRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jtfID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jtfContraseña.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jPanel1.add(jtfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 110, 30));

        jtfNombre.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, 30));

        jcbTipoUsu.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jcbTipoUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Dueño" }));
        jcbTipoUsu.setBorder(null);
        jPanel1.add(jcbTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 30));

        materialButtomRectangle1.setBackground(new java.awt.Color(255, 51, 102));
        materialButtomRectangle1.setBorder(null);
        materialButtomRectangle1.setForeground(new java.awt.Color(153, 255, 255));
        materialButtomRectangle1.setText("eliminar");
        jPanel1.add(materialButtomRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 100, 40));

        jbRegistrar.setBackground(new java.awt.Color(255, 51, 102));
        jbRegistrar.setBorder(null);
        jbRegistrar.setForeground(new java.awt.Color(153, 255, 255));
        jbRegistrar.setText("registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 40));

        materialButtomRectangle3.setBackground(new java.awt.Color(255, 51, 102));
        materialButtomRectangle3.setBorder(null);
        materialButtomRectangle3.setForeground(new java.awt.Color(153, 255, 255));
        materialButtomRectangle3.setText("modificar");
        jPanel1.add(materialButtomRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 100, 40));

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 530, 340));

        jtfID.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jPanel1.add(jtfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 110, 30));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel4.setText("ID usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
       String var = (String) jcbTipoUsu.getSelectedItem();
    try {
        pst=cnn.prepareStatement("INSERT INTO usuario (id_usuario,Usuario,Contraseña,tipo_usuario) VALUES (?,?,?,?)");
        pst.setInt(1,Integer.parseInt(jtfID.getText()));
            pst.setString(2,jtfNombre.getText());
            pst.setString(3,jtfContraseña.getText());
            pst.setString(4,var);
            pst.executeUpdate();
           // pst.setString(5,jtfModelo.getText());
    } catch (SQLException ex) {
        Logger.getLogger(Usuarionuevo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jbRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButtomRectangle jbRegistrar;
    private javax.swing.JComboBox<String> jcbTipoUsu;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    private principal.MaterialButtomRectangle materialButtomRectangle1;
    private principal.MaterialButtomRectangle materialButtomRectangle3;
    // End of variables declaration//GEN-END:variables
}
