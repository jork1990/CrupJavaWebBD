package persistencia;

import java.util.List;
import logica.Usuarios;

public class ControladoraPersistencia {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public  void crearUsuarios (Usuarios usu) {
        controlPersis.crearUsuarios(usu);
        
    }
    
    public  List <Usuarios> traerUsuarios () {
        return controlPersis.traerUsuarios();
     }
    
   
    
}
