
package ServiceTechnicTv.Dao;

import ServiceTechnicTv.Model.Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioDao {
  private static List<Usuario> usuarios;

    public UsuarioDao() {
        if(usuarios == null){
            usuarios = new ArrayList<>();
        }
    }
  
  
  
  public void guardar(Usuario usuario) throws Exception {
      var exito = usuarios.stream()
              .filter(u -> u.getIdentificacion().equals(usuario.getIdentificacion()))
              .findFirst();
      if(exito.isPresent()){
          throw new Exception("Ya existe un usuario con el ID: "+usuario.getIdentificacion());
      }
      usuarios.add(usuario);
              
  }
  
  public Usuario buscarPorId(String id) throws Exception{
      var exito = usuarios.stream()
              .filter(u -> u.getIdentificacion().equals(id))
              .findFirst();
      if(!exito.isPresent()){
          throw new Exception("No existe un usuario con el ID: "+id);
      }
      return exito.get();
  }
}
