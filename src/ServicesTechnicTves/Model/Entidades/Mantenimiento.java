/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public class Mantenimiento {
    private final String codigo;
    private final String fecha;
    private final Dispositivo dispositivo;
    private final Tecnico tecnico;
    private final String diagnostico;
    private final String descripcion;
    private final double precio;
    private final int garantia;

    public Mantenimiento(String codigo, String fecha, Dispositivo dispositivo, Tecnico tecnico, 
                         String diagnostico, String descripcion, double precio, int garantia) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (garantia < 0) {
            throw new IllegalArgumentException("La garantía no puede ser negativa.");
        }

        this.codigo = codigo;
        this.fecha = fecha;
        this.dispositivo = dispositivo;
        this.tecnico = tecnico;
        this.diagnostico = diagnostico;
        this.descripcion = descripcion;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "COdigo: " + codigo + ", Fecha: " + fecha + ", Dispositivo: " + (dispositivo != null ? dispositivo.toString() : "Sin dispositivo")
                + ", Tecnico: " + (tecnico != null ? tecnico.toString() : "Sin tecnico") + ", Diagnostico: " + diagnostico
                + ", Descripcion: " + descripcion + ", Precio: " + precio + ", Garantia: " + garantia + " meses";
    }
}
