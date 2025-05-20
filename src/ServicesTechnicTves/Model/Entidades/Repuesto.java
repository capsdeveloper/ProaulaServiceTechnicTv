package ServicesTechnicTves.Model.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Repuesto {
    private int id;
    private String nombre;
    private String marca;
    private String tipo;
    private float precio;
    private String ubicacion;
    private int stock;
    private String descripcion;
    private String foto;
    private Marca marcaReferencia;
    private List<Dispositivo> dispositivos;

    public Repuesto(int id, String nombre, String marca, String tipo, float precio,
                    String ubicacion, int stock, String descripcion, String foto, Marca marcaReferencia) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.stock = stock;
        this.descripcion = descripcion;
        this.foto = foto;
        this.marcaReferencia = marcaReferencia;
        this.dispositivos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public Marca getMarcaReferencia() {
        return marcaReferencia;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", ubicacion='" + ubicacion + '\'' +
                ", stock=" + stock +
                ", descripcion='" + descripcion + '\'' +
                ", foto='" + foto + '\'' +
                ", marcaReferencia=" + (marcaReferencia != null ? marcaReferencia.getNombre() : "Sin marca") +
                '}';
    }
}
