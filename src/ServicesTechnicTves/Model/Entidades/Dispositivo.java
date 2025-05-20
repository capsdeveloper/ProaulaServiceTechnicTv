
/* @author cesar */
package ServicesTechnicTves.Model.Entidades;

public class Dispositivo {
    private String type;
    private String code;
    private String description;
    private Cliente owner;

    public Dispositivo(String type, String code, String description, Cliente owner) {
        this.type = type;
        this.code = code;
        this.description = description;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodigo() {
        return code;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.code = codigo;
        } else {
            throw new IllegalArgumentException("El codigo no puede estar vacío.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cliente getOwner() {
        return owner;
    }

    public void setOwner(Cliente owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Tipo: " + type + ", Codigo: " + code + ", Descripcion: " + description 
                + ", Propietario: " + (owner != null ? owner.toString() : "Sin propietario");
    }
}
