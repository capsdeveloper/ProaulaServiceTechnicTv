/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public class Proveedor extends Usuario {
    private String nit;

    public Proveedor(String nit, String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        if (nit == null || nit.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: El NIT no puede estar vacío ni nulo.");
        }
        this.nit = nit;
    }

    @Override
    public String getIdentificacion() {
        return super.getIdentificacion();
    }
}

