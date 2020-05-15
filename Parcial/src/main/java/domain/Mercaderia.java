package domain;

public class Mercaderia {
    private String nombre;
    private Integer codigo;
    private Ubicacion ubicacion;

    public Mercaderia(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
