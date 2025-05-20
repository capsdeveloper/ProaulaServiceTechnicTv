
package ServicesTechnicTves.Dao;

import ServicesTechnicTves.Model.Entidades.Tecnico;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author cesar
 */
public class TecnicoDao {
  private static List<Tecnico> tecnicos;

    public TecnicoDao() {
        if(tecnicos == null){
            tecnicos = new ArrayList<>();
        }
    }
  private List<Tecnico> listaTecnicos = new ArrayList<>();

  public List<Tecnico> obtenerTodosLosTecnicos() {
    return new ArrayList<>(listaTecnicos);
}
  public boolean eliminarTecnico(String cedula) {
    Iterator<Tecnico> iterator = listaTecnicos.iterator();
    while (iterator.hasNext()) {
        Tecnico t = iterator.next();
        if (t.getIdentificacion().equals(cedula)) {
            iterator.remove();
            return true;
        }
    }
    return false;
}

  
  public void registrar(Tecnico tecnico) throws Exception {
      var exito = tecnicos.stream()
              .filter(u -> u.getIdentificacion().equals(tecnico.getIdentificacion()))
              .findFirst();
      if(exito.isPresent()){
          throw new Exception("Ya existe un tecnico con el ID: "+tecnico.getIdentificacion());
      }
      tecnicos.add(tecnico);
              
  }
  
  public Tecnico buscarPorId(String id) throws Exception{
      var exito = tecnicos.stream()
              .filter(u -> u.getIdentificacion().equals(id))
              .findFirst();
      if(!exito.isPresent()){
          throw new Exception("No existe un tecnico con el ID: "+id);
      }
      return exito.get();
  }
}

