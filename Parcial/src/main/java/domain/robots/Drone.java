package domain.robots;

import domain.Mercaderia;
import domain.Ubicacion;

public class Drone extends Robot {
    public Drone(Ubicacion ubicacion, Mercaderia mercaderia) {
        super(ubicacion, mercaderia);
    }
}
