
package ventanas;

import Modelo.Juego;
import Modelo.Tienda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
public class Vender extends javax.swing.JDialog {

    private DefaultListModel lista=new DefaultListModel();
    Tienda t=new Tienda();
    int cont_ventas=0;
    Connection con = null;
    PreparedStatement stmt = null;
    ArrayList<String> historial_ventas;
    public Vender(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        historial_ventas=new ArrayList<>();
        jList1.setModel(lista);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jTextFieldvender_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButtonVender = new javax.swing.JButton();
        jButtonHistorial_ventas = new javax.swing.JButton();
        jButtonValor_vendidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setText("Vender Juego");

        jLabel14.setText("ID:");

        jButtonVender.setText("Vender");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jButtonHistorial_ventas.setText("Historial de ventas");
        jButtonHistorial_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistorial_ventasActionPerformed(evt);
            }
        });

        jButtonValor_vendidos.setText("Valor de Juegos vendidos");
        jButtonValor_vendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValor_vendidosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldvender_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButtonValor_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonHistorial_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldvender_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHistorial_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValor_vendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        /*try{
            for (Juego j : t.getListajuegos()) {
                if (j.getId()==Integer.parseInt(this.jTextFieldvender_id.getText())) {
                    if (j.getStock()>0) {
                        j.setStock(t.resta(j.getStock()));
                        cont_ventas+=Integer.parseInt(j.getPrecio());
                        historial_ventas.add(j.getNombre());
                        JOptionPane.showMessageDialog(null, "Uds. ha comprado un "+j.getNombre()+" ha\t$ "+j.getPrecio());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No hay Stock de "+j.getNombre());
                    }
                }
            }
            this.jTextFieldvender_id.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "");
        }*/
        try {
            String url = "jdbc:mysql://localhost/tienda_juegos";
            String usuario = "root";
            String contraseña = "";  
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,usuario,contraseña);
            if (con!= null)
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
            stmt = con.prepareStatement("UPDATE tabla_juego SET stock_jue = stock_jue - 1 WHERE id ="+this.jTextFieldvender_id.getText());
            stmt.executeUpdate();
            ResultSet rs = stmt.executeQuery("select* from tabla_juego where id="+this.jTextFieldvender_id.getText());    
            while(rs.next()) {
                JOptionPane.showMessageDialog(null, "Uds. ha comprado "+rs.getString("nombre_jue")+" ha\t$ "+rs.getString("precio_jue"));             
                PreparedStatement pstm=con.prepareStatement("INSERT INTO tabla_ventas(id,nombre_jue,precio_jue)VALUES(?,?,?)");
                pstm.setInt(1, rs.getInt("id"));
                pstm.setString(2, rs.getString("nombre_jue"));
                pstm.setInt(3, rs.getInt("precio_jue"));
                pstm.executeUpdate();
            }
            this.jTextFieldvender_id.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay Stock");
        }
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonHistorial_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistorial_ventasActionPerformed
        /*if (this.historial_ventas.size()>0) {
            this.lista.setSize(0);
            for (int i = 0; i < historial_ventas.size(); i++) {
                this.lista.addElement("-"+historial_ventas.get(i));
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "No hay registro de ventas,\nVuelve a Intentarlo...");
        }*/
        try {
            String url = "jdbc:mysql://localhost/tienda_juegos";
            String usuario = "root";
            String contraseña = "";  
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url,usuario,contraseña);
            if (con!= null)
                System.out.println("Se ha establecido una conexion a la base de datos"+"\n"+url);
            ResultSet rs = stmt.executeQuery("select* from tabla_ventas");    
            
            while(rs.next()){
                this.lista.addElement("* "+rs.getString("nombre_jue")+"   $"+rs.getInt("precio_jue"));
                cont_ventas+=rs.getInt("precio_jue");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de extraccion de datos\nVuelve a Intentarlo...");

        }
    }//GEN-LAST:event_jButtonHistorial_ventasActionPerformed

    private void jButtonValor_vendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValor_vendidosActionPerformed
        JOptionPane.showMessageDialog(null, "Valor total de Ventas: "+cont_ventas);

    }//GEN-LAST:event_jButtonValor_vendidosActionPerformed

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
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vender dialog = new Vender(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHistorial_ventas;
    private javax.swing.JButton jButtonValor_vendidos;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldvender_id;
    // End of variables declaration//GEN-END:variables
}
