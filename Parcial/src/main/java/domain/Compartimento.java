package domain;

public class Compartimento {
    private Ubicacion ubicacion;
    private Mercaderia mercaderia;

    public Compartimento(Ubicacion ubicacion, Mercaderia mercaderia) {
        this.ubicacion = ubicacion;
        this.mercaderia = mercaderia;
    }

    public void setUbicacionMercaderia(){
        mercaderia.setUbicacion(this.ubicacion);
    }
}
