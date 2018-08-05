
package gestionusuarios;

public class UsuarioModel {
    
    private int id = 0;
    private String usuario = "";
    private String contraseña = "";
    private String nombre = "";
    
    public UsuarioModel (int id, String usuario, String contraseña, String nombre){
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    public int getId (){
        return id;
    }
    
    
    public void setUsuario (String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario (){
        return usuario;
    } 
    
    public void setContraseña (String contraseña1){
        this.contraseña = contraseña1;
    }
    
    public String getContraseña (){
        return contraseña;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
}
