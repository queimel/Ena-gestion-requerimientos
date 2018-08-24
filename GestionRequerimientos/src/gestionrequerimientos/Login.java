/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionrequerimientos;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author cristian.campos
 */
public class Login {
    private String _usuario;
    private String _clave;
    private BaseDatos miBD = new BaseDatos();
    boolean _logIn = false;
    

    public Login(String usuario, String clave) {
        this._usuario = usuario;
        this._clave = clave;
    }
 
    public void consultaLogin(){
        try{
            
            if(miBD.conectarBD()){
                String consultaUser = "SELECT * FROM Usuario WHERE nombre ='"+this._usuario+"';";
                
                ResultSet rsUser =  miBD.consultaSQL(consultaUser);

                if(rsUser.next()){
                    System.out.println(this._clave);
                    if(rsUser.getString(2).equals(this._usuario)){
                        String consultaPass = "SELECT * FROM Usuario WHERE nombre ='"+this._usuario+"' AND passs ='"+this._clave+"';";
                        ResultSet rsPass =  miBD.consultaSQL(consultaPass);
                        if(rsPass.next()){
                            if(rsPass.getString(3).equals(this._clave)){
                               this.setLogIn(true);
                               miBD.cerrarConexion();
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Password incorrecto!");
                        }                   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "usuario no encontrado!"); 
                }
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }     
    }

    public void setUsuario(String _usuario) {
        this._usuario = _usuario;
    }

    public void setClave(String _clave) {
        this._clave = _clave;
    }

    public void setLogIn(boolean _logIn) {
        this._logIn = _logIn;
    }

    public String getUsuario() {
        return _usuario;
    }

    public String getClave() {
        return _clave;
    }

    public boolean isLogIn() {
        return _logIn;
    }
}
