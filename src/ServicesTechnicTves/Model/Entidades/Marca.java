package ServicesTechnicTves.Model.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private int id;
    private String nombre;
    private String icono;
    private List<Dispositivo> dispositivos;

    public Marca(int id, String nombre, String icono) {
        this.id = id;
        this.nombre = nombre;
        this.icono = icono;
        this.dispositivos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIcono() {
        return icono;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", icono='" + icono + '\'' +
                ", dispositivos=" + dispositivos.size() + " dispositivos" +
                '}';
    }
}
