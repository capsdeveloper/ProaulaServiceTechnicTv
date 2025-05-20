/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public class Cliente extends Usuario {
    private String email;
    private String direccion;

    public Cliente() {
        super("", "", ""); // Evita pasar null
        this.email = "";
        this.direccion = "";
    }

    public Cliente(String nombre, String apellido, String identificacion,
                   String email, String direccion) {
        super(nombre, apellido, identificacion);
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getIdentificacion() {
        return super.getIdentificacion();
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + email + ", Direccion: " + direccion;
    }
}
