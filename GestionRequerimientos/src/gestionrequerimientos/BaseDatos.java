/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrequerimientos;

//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


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
            String baseDatos = "jdbc:mysql://localhost:8889/Requerimiento";
            cnn = DriverManager.getConnection(baseDatos, "root", "root");
           
            if(cnn != null)
                return true;
            else
                return false;
           
        } catch (Exception e) {
            System.out.println(e.toString());
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
    
    public ResultSet consultaSQL(String sql){
        ResultSet rstConsulta = null;
        Statement stm;
        try {
            stm = cnn.createStatement();
            rstConsulta = stm.executeQuery(sql); 
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        return rstConsulta;
    }
    
    public ArrayList<String> cargarCB(String tabla){
        ArrayList<String> items = new ArrayList<>();
        if(this.conectarBD()){
            ResultSet rst;
            rst = this.consultaSQL("SELECT * from "+tabla);
            try{
                while (rst.next()) {
                    items.add(rst.getString(2));
                }
                this.cerrarConexion();
                rst.close();
            }catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Error SQL");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexión");   
        }        
        return (items);
    }
    
    public ArrayList<String> cargarCBDepto(int gerencia){
        ArrayList<String> items = new ArrayList<>();
        if(this.conectarBD()){
            ResultSet rst;
            rst = this.consultaSQL("SELECT * from Departamento WHERE id_gerencia="+gerencia);
            try{
                while (rst.next()) {
                    items.add(rst.getString(2));
                }
                this.cerrarConexion();
                rst.close();
            }catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Error SQL");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexión");   
        }        
        return (items);
    }
    
    public ArrayList<String> cargarCBEncargado(int asignacion){
        ArrayList<String> items = new ArrayList<>();
        if(this.conectarBD()){
            ResultSet rst;
            rst = this.consultaSQL("SELECT * from Encargado WHERE id_asignacion="+asignacion);
            try{
                while (rst.next()) {
                    String cadena = rst.getString(2)+" "+rst.getString(3);
                    items.add(cadena);
                }
                this.cerrarConexion();
                rst.close();
            }catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Error SQL");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexión");   
        }        
        return (items);
    }
    
    public boolean ingresarRequerimiento(int gerencia, int depto, int asignacion, String requerimiento, boolean estado){
        String sql = "INSERT INTO SolicitudRequerimiento (id_gerencia, id_depto, id_asignacion,, requerimiento, estado)  VALUES ("+gerencia+", "+depto+", "+asignacion+", \""+requerimiento+"\","+estado+" );";
        System.out.println(sql);

        boolean exito = false;
        try{
            if(this.conectarBD()){

                Statement stm;
                try {
                    stm = cnn.createStatement();
                    stm.executeUpdate(sql);
                    exito = true;
                    
                }catch (SQLException ex) {
                    exito = false; 
                    System.out.println(ex.toString());
                }
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        return exito;
    }
    
    public void consultaRequerimientos(int gerencia, int depto, int asignacion, javax.swing.JTable tabla){
        String sql = "SELECT * FROM SolicitudRequerimiento WHERE id_gerencia="+gerencia+" AND id_depto="+depto+" AND id_asignacion="+asignacion;
        try{
            if(this.conectarBD()){
                DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
                for(int x = modeloTabla.getRowCount()-1; x >= 0; --x)
                    modeloTabla.removeRow(x);

                ResultSet rstReq =  this.consultaSQL(sql);

                while(rstReq.next()){
                    modeloTabla.addRow(new Object[] {rstReq.getString(1),rstReq.getString(2), rstReq.getString(3), rstReq.getString(4)});
                }
                this.cerrarConexion();
                rstReq.close();
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }     
    }
}
