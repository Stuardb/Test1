
package gestionusuarios;

import java.util.ArrayList;

public class UsuarioController {
    
    private ArrayList <UsuarioModel> usuarios = new ArrayList <> ();
    
    public void agregarUsuario (UsuarioModel usuario){
       this.usuarios.add(usuario);
       }
    
    
    public void eliminarUsuario (int id){
        for (UsuarioModel usuario: usuarios){
            if (usuario.getId()== id) {
                usuarios.remove(id);
                break;
            }
        }
    }
    
    public void editarUsuario (int id){
        for (UsuarioModel usuario: usuarios){
            if (usuario.getId()==id) {
                usuarios.set(id, usuario);
                break;
            }
    }
    
}
    
    public UsuarioModel buscarUsuario (int id){
        int indice =0;
        for (UsuarioModel usuario: usuarios){
            if (usuario.getId()==id) {
                    return usuario;
                }
                indice ++;
            }
                return null;
            }
    
    
    public UsuarioModel verificarSesion (String username, String password){
        for (UsuarioModel usuario: this.usuarios) {
            if (usuario.getNombre().equals(username) && usuario.getContraseña().equals(password)){
                return usuario;
            } 
        }
        return null;
    }
    
    public ArrayList <UsuarioModel> getArregloUsuarios (){
        return this.usuarios;
    }
    
    public int nuemeroId (){
        int id = 1;
        for (UsuarioModel usuario: usuarios){
            id = usuario.getId()+1;
            }
        return id;
    }
    
    public boolean checarExistencia (){
        return this.usuarios.isEmpty();
    }
    
}