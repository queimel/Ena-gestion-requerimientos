/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author cristian.campos
 */
public class BaseDatos {
    private Connection cnn;
    
    public boolean conectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Establecer conexion
            String baseDatos = "jdbc:mysql://localhost:3306/Requerimientos";
            cnn = DriverManager.getConnection(baseDatos, "root", "Queimel056200");
           
            if(cnn != null)
                return true;
            else
                return false;
           
        } catch (Exception e) {
            return false;
        }
    }
    
    public void cerrarConexion(){
        try {
            if(cnn != null)
                cnn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
