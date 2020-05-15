package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {
    protected Cliente cliente;
    private List<Mercaderia> mercaderias;

    public Pedido(Cliente unCliente){
        this.cliente = unCliente;
        this.mercaderias = new ArrayList<>();
    }

    public void agregarMercaderia(Mercaderia ... mercaderias){
        Collections.addAll(this.mercaderias, mercaderias);
    }

    public List<Mercaderia> getMercaderias() {
        return mercaderias;
    }
}
