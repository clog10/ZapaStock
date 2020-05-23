
package panels;

import conexion.Conexion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Registroproductos extends javax.swing.JPanel {
    Conexion con = new Conexion();
    Connection cnn= con.conexion();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           if(column==9)
               return true;
           else return false;
        }
      
    };
    
    String si;
        
    public Registroproductos() {
        initComponents();
        mostrar("");
        deshabilitar();
        
    }

   void deshabilitar(){
       jtfCodigo.setEditable(false);
       jtfDescripcion.setEditable(false);
       jtfColor.setEditable(false);
       jtfMarca.setEditable(false);
       jtfModelo.setEditable(false);
       jtfNumeracion.setEditable(false);
       jtfStock.setEditable(false);
       jtfPrecio.setEditable(false);

   }
   void limpiar(){
       jtfCodigo.setText("");
       jtfDescripcion.setText("");
       jtfColor.setText("");
       jtfMarca.setText("");
       jtfModelo.setText("");
       jtfNumeracion.setText("");
       jtfStock.setText("");
       jtfPrecio.setText(""); 
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
        jtbRegistro.setModel(modelo);
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
            jtbRegistro.setModel(modelo);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfDescripcion = new javax.swing.JTextField();
        jtfColor = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfNumeracion = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbSelecionarImg = new principal.MaterialButtomRectangle();
        jbGuardar = new principal.MaterialButtomRectangle();
        jbEliminar = new principal.MaterialButtomRectangle();
        jbBuscar = new principal.MaterialButtomRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbRegistro = new javax.swing.JTable();
        jtfModelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbNuevo = new principal.MaterialButtomRectangle();
        lblFoto = new javax.swing.JLabel();
        jtfNomImg = new javax.swing.JTextField();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        jtfBuscar = new app.bolivia.swing.JCTextField();
        jbActualizar = new principal.MaterialButtomRectangle();
        jbModificar = new principal.MaterialButtomRectangle();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Código");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 103, 26));

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("Descripción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 103, 26));

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setText("Color");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 103, 26));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 103, 26));

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel5.setText("Numeración");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 103, 26));

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 103, 26));

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 103, 26));

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel8.setText("Foto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 103, 26));

        jtfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 144, 26));

        jtfDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDescripcionKeyTyped(evt);
            }
        });
        jPanel1.add(jtfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 144, 26));

        jtfColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfColorKeyTyped(evt);
            }
        });
        jPanel1.add(jtfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 144, 26));

        jtfMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMarcaKeyTyped(evt);
            }
        });
        jPanel1.add(jtfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 144, 26));

        jtfNumeracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeracionKeyTyped(evt);
            }
        });
        jPanel1.add(jtfNumeracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 144, 26));

        jtfStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfStockKeyTyped(evt);
            }
        });
        jPanel1.add(jtfStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 144, 26));

        jtfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioActionPerformed(evt);
            }
        });
        jtfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 144, 26));

        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel9.setText("Detalle de Producto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 170, 26));

        jbSelecionarImg.setBackground(new java.awt.Color(255, 51, 102));
        jbSelecionarImg.setBorder(null);
        jbSelecionarImg.setForeground(new java.awt.Color(153, 255, 255));
        jbSelecionarImg.setText("Seleccionar");
        jbSelecionarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecionarImgActionPerformed(evt);
            }
        });
        jPanel1.add(jbSelecionarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 41));

        jbGuardar.setBackground(new java.awt.Color(255, 51, 102));
        jbGuardar.setBorder(null);
        jbGuardar.setForeground(new java.awt.Color(153, 255, 255));
        jbGuardar.setText("guardar");
        jbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 98, 41));

        jbEliminar.setBackground(new java.awt.Color(255, 51, 102));
        jbEliminar.setBorder(null);
        jbEliminar.setForeground(new java.awt.Color(153, 255, 255));
        jbEliminar.setText("eliminar");
        jbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 98, 41));

        jbBuscar.setBackground(new java.awt.Color(255, 51, 102));
        jbBuscar.setBorder(null);
        jbBuscar.setForeground(new java.awt.Color(153, 255, 255));
        jbBuscar.setText("Buscar");
        jbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 98, 41));

        jtbRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbRegistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 157, 480, 360));

        jtfModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfModeloKeyTyped(evt);
            }
        });
        jPanel1.add(jtfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 144, 26));

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel10.setText("Modelo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 103, 26));

        jbNuevo.setBackground(new java.awt.Color(255, 51, 102));
        jbNuevo.setBorder(null);
        jbNuevo.setForeground(new java.awt.Color(153, 255, 255));
        jbNuevo.setText("Nuevo");
        jbNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbNuevoMouseClicked(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 98, 41));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 150, 70));
        jPanel1.add(jtfNomImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 120, 30));

        panelRound1.setColorDeBorde(new java.awt.Color(204, 204, 204));
        panelRound1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRound1.setColorSecundario(new java.awt.Color(255, 255, 255));

        jtfBuscar.setBorder(null);
        jtfBuscar.setForeground(new java.awt.Color(109, 109, 109));
        jtfBuscar.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jtfBuscar.setPlaceholder("Busca un producto");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 50));

        jbActualizar.setBackground(new java.awt.Color(255, 51, 102));
        jbActualizar.setBorder(null);
        jbActualizar.setForeground(new java.awt.Color(153, 255, 255));
        jbActualizar.setText("actualizar");
        jbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbActualizarMouseClicked(evt);
            }
        });
        jPanel1.add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 98, 41));

        jbModificar.setBackground(new java.awt.Color(255, 51, 102));
        jbModificar.setBorder(null);
        jbModificar.setForeground(new java.awt.Color(153, 255, 255));
        jbModificar.setText("modificar");
        jbModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbModificarMouseClicked(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 98, 41));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGuardarMouseClicked
        
        try {
            pst=cnn.prepareStatement("INSERT INTO producto_b (codigo_b,color,descripcion,marca,modelo,stock,precio_b,imagen_b,numeracion) VALUES (?,?,?,?,?,?,?,?,?)");
            FileInputStream archivoFoto;
            pst.setInt(1,Integer.parseInt(jtfCodigo.getText()));
            pst.setString(2,jtfColor.getText());
            pst.setString(3,jtfDescripcion.getText());
            pst.setString(4,jtfMarca.getText());
            pst.setString(5,jtfModelo.getText());
            pst.setInt(6,Integer.parseInt(jtfStock.getText()));
            pst.setDouble(7,Double.parseDouble(jtfPrecio.getText()));
            archivoFoto = new FileInputStream(jtfNomImg.getText());
            pst.setBinaryStream(8, archivoFoto);
            pst.setInt(9,Integer.parseInt(jtfNumeracion.getText()));
            pst.executeUpdate();
            mostrar("");
            limpiar();
            deshabilitar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No guardo");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registroproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbGuardarMouseClicked

    private void jbSelecionarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecionarImgActionPerformed
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg","png");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");
        File ruta= new File("C:/Pictures");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if(ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            jtfNomImg.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(jtfNomImg.getText());
            foto = foto.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            lblFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_jbSelecionarImgActionPerformed

    private void jbNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNuevoMouseClicked
       limpiar();
       jtfCodigo.setEditable(true);
       jtfDescripcion.setEditable(true);
       jtfColor.setEditable(true);
       jtfMarca.setEditable(true);
       jtfModelo.setEditable(true);
       jtfNumeracion.setEditable(true);
       jtfStock.setEditable(true);
       jtfPrecio.setEditable(true);

    }//GEN-LAST:event_jbNuevoMouseClicked

    private void jbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBuscarMouseClicked
        mostrar(jtfBuscar.getText());
    }//GEN-LAST:event_jbBuscarMouseClicked

    private void jbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEliminarMouseClicked
        int fila = jtbRegistro.getSelectedRow();
        String cod="";
        cod= jtbRegistro.getValueAt(fila,0).toString();
        
        try{
            pst= cnn.prepareStatement("DELETE FROM producto_b WHERE codigo_b='"+cod+"'");
            pst.execute();
            mostrar(cod);
        }catch (Exception e ){}
    }//GEN-LAST:event_jbEliminarMouseClicked

    private void jbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActualizarMouseClicked
        try {
            pst = cnn.prepareStatement("UPDATE producto_b SET stock ='"+jtfStock.getText()+"' WHERE codigo_b='" +jtfCodigo.getText()+"'");
            pst.executeUpdate();
            mostrar("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR" + ex.getMessage());
        }
    }//GEN-LAST:event_jbActualizarMouseClicked

    private void jbModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbModificarMouseClicked
            int fila = jtbRegistro.getSelectedRow();
        if(fila>=0){
            jtfCodigo.setText(jtbRegistro.getValueAt(fila, 0).toString());            
            jtfColor.setText(jtbRegistro.getValueAt(fila, 1).toString());
            jtfDescripcion.setText(jtbRegistro.getValueAt(fila, 2).toString());
            jtfMarca.setText(jtbRegistro.getValueAt(fila, 3).toString());
            jtfModelo.setText(jtbRegistro.getValueAt(fila, 4).toString());
            jtfStock.setText(jtbRegistro.getValueAt(fila, 5).toString());
            jtfPrecio.setText(jtbRegistro.getValueAt(fila, 6).toString());
            lblFoto.setText(jtbRegistro.getValueAt(fila,7).toString());
            jtfNumeracion.setText(jtbRegistro.getValueAt(fila, 8).toString());
            deshabilitar();
            jtfStock.setEditable(true);
        }else {
            JOptionPane.showMessageDialog(null, "No selecciono fila");
        }
    }//GEN-LAST:event_jbModificarMouseClicked

    private void jtfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfCodigoKeyTyped

    private void jtfDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescripcionKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfDescripcionKeyTyped

    private void jtfColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfColorKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfColorKeyTyped

    private void jtfMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMarcaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfMarcaKeyTyped

    private void jtfModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModeloKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfModeloKeyTyped

    private void jtfNumeracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeracionKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumeracionKeyTyped

    private void jtfStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfStockKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfStockKeyTyped

    private void jtfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButtomRectangle jbActualizar;
    private principal.MaterialButtomRectangle jbBuscar;
    private principal.MaterialButtomRectangle jbEliminar;
    private principal.MaterialButtomRectangle jbGuardar;
    private principal.MaterialButtomRectangle jbModificar;
    private principal.MaterialButtomRectangle jbNuevo;
    private principal.MaterialButtomRectangle jbSelecionarImg;
    private javax.swing.JTable jtbRegistro;
    private app.bolivia.swing.JCTextField jtfBuscar;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNomImg;
    private javax.swing.JTextField jtfNumeracion;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfStock;
    private javax.swing.JLabel lblFoto;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
