package logica;

import java.util.List;
import persistencia.UsuariosJpaController;

public class Controladora {
    
    UsuariosJpaController usuJpa = new UsuariosJpaController();
    
     public  void  crearUsuarios  (Usuarios usu ){
         usuJpa.create(usu);
     
     };
     
     // Operacion Read
     
     public List<Usuarios> traerUsuarios () {
        return usuJpa.findUsuariosEntities();
    } 
    
    
}
