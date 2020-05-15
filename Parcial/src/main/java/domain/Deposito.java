package domain;

import domain.robots.Robot;

import java.util.ArrayList;
import java.util.List;

public class Deposito {
    private List<Compartimento> compartimentos;
    private List<Robot> robots;
    private List<Transportista> transportistas;
    private List<Pedido> pedidos;

    public Deposito() {
        this.compartimentos = new ArrayList<>();;
        this.robots = new ArrayList<>();;
        this.transportistas = new ArrayList<>();;
        this.pedidos = new ArrayList<>();;
    }

    public void buscar() {
        for (Pedido pedido: pedidos) {
            Robot robot = robots.stream().filter(o -> o.estaLibre).findFirst().get();
            robot.buscar(pedido);
        }
    }

    public void addPedido(Pedido unPedido) {
        pedidos.add(unPedido);
    }

    public void serNotificadoPor(IObservable observable){

    }


}
