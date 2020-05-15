package domain;

import java.util.ArrayList;
import java.util.List;

public class Transportista {
    private List<Pedido> pedidos;

    public Transportista() {
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido unPedido){
        pedidos.add(unPedido);
    }

}
