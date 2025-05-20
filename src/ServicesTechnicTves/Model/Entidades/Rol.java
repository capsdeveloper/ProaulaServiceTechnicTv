/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public final class Rol {
    private int id;
    private String nombre;    
    private String descripcion;

    public Rol() {}

    public Rol(int id, String nombre, String descripcion) {
        setId(id);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("El ID debe ser un numero positivo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacío.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        } else {
            throw new IllegalArgumentException("La descripcion no puede estar vacía.");
        }
    }

    @Override
    public String toString() {
        return "Rol {ID: " + id + ", Nombre: " + nombre + ", DescripciOn: " + descripcion + "}";
    }
}
