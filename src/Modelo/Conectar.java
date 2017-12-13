
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String url="jdbc:mysql://localhost/tienda_juegos";

    public Conectar() {
        conn=null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user,"");
            if (conn!=null) {
                JOptionPane.showMessageDialog(null,"Conexion Exitosa!");                                
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"No fue posible la conexion!"+ e,"ERROR",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }   
    
    // retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    public void Desconectar(){
        conn=null;
        if (conn==null) {
            JOptionPane.showMessageDialog(null,"Desconexion Exitosa!");
            
        }
    }
    
    
    
}
