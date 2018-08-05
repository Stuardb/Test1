
package gestionusuarios;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControlTablaUsuarios {
    
    private JTable tabla = null;
    private DefaultTableModel modelo = new DefaultTableModel ();
    
    public ControlTablaUsuarios (JTable t, String [] columnas, UsuarioController uc){
        this.tabla = t;
        this.colocarColumnas(columnas);
        this.llenarFilas(uc);
        this.tabla.setModel(modelo);
    }
    
    public void colocarColumnas (String [] columnas){
        for(String c: columnas){            
            modelo.addColumn(c);
        }
    }
    
    public void llenarFilas (UsuarioController uc){
        for (UsuarioModel u: uc.getArregloUsuarios() ) {
            Object [] fila = {u.getId(), u.getUsuario(), u.getContraseña(), u.getNombre()};
            modelo.addRow(fila);
        }
    }
    public void eliminarfila (int fila){
        this.modelo.removeRow(fila);
    }
}
