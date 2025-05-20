/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public class Tecnico extends Usuario {
    private String especialidad;

    public Tecnico(String nombre, String apellido, String identificacion, String especialidad) {
        super(nombre, apellido, identificacion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    /**
     *
     * @param especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad;
    }

    @Override
    public String getIdentificacion() {
        return super.getIdentificacion(); // Ahora devuelve correctamente la identificación
    }
}
