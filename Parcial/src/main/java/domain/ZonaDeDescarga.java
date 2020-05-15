package domain;

import domain.Mercaderia;
import domain.Ubicacion;

import java.util.ArrayList;
import java.util.List;

public class ZonaDeDescarga {
    private Ubicacion ubicacion;
    private List<Mercaderia> mercaderias;

    public ZonaDeDescarga(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
        this.mercaderias = new ArrayList<>();;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public List<Mercaderia> getMercaderias() {
        return mercaderias;
    }

    public void addMercaderia(Mercaderia unaMercaderia) {
        mercaderias.add(unaMercaderia);
    }
}
