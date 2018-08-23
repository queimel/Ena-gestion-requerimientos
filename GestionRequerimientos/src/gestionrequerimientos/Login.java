/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrequerimientos;
import java.sql.ResultSet;
/**
 *
 * @author cristian.campos
 */
public class Login {
    String usuario;
    String clave;
    private BaseDatos miBD = new BaseDatos();
    boolean logIn = false;
    String consulta = "SELECT * FROM USUARIOS WHERE nickname ="+usuario;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
 
    public void consultaLogin(){
        try{
            System.out.println("hola sql");
            if(miBD.conectarBD()){
                ResultSet rstUsers =  miBD.consultaSQL(consulta);
                
                if( rstUsers.getString(1).equalsIgnoreCase(usuario)){
                   
                }
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }     
    }
}
