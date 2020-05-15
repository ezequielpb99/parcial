package domain.robots;

import domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Robot  implements IObservable{
    public boolean estaLibre;
    private boolean llevaMercaderia;
    private Ubicacion ubicacionActual;
    private Ubicacion ubicacionDeEspera;
    private ZonaDeDescarga zona;
    private Mercaderia mercaderia;
    private List<IObserver> observers;


    public Robot(Ubicacion ubicacion, Mercaderia mercaderia) {
        this.estaLibre = true;
        this.llevaMercaderia = false;
        this.ubicacionActual = ubicacionDeEspera;
        this.ubicacionDeEspera = ubicacion;
        this.mercaderia = mercaderia;
        this.observers = new ArrayList<>();
    }


    public void buscar(Pedido pedido) {
        this.estaLibre = false;
        for (Mercaderia mercaderia: pedido.getMercaderias()) {
            if(llevaMercaderia != true){
                irA(mercaderia.getUbicacion());
                agarrarMercaderia(mercaderia);
            }
            else {
                irA(zona.getUbicacion());
                dejarMercaderia(this.mercaderia);
            }
        }
        irA(ubicacionDeEspera);
        notificar();
        this.estaLibre = true;
    }

    public void irA(Ubicacion unaUbicacion){
        this.ubicacionActual = unaUbicacion;
    }

    public void agarrarMercaderia(Mercaderia unaMercaderia){
        this.llevaMercaderia = true;
        this.mercaderia = unaMercaderia;
    }

    public void dejarMercaderia(Mercaderia unaMercaderia){
        zona.addMercaderia(unaMercaderia);
    }

    public void notificar(){
        this.observers.forEach(o -> o.serNotificadoPor(this));
    }
    @Override
    public void agregarObservable(IObserver... observers) {
        Collections.addAll(this.observers, observers);
    }

    @Override
    public void eleminarObservable(IObserver observer) {
        this.observers.remove(observer);
    }
}
