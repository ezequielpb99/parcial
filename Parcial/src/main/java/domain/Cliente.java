package domain;

import java.util.Collections;

public class Cliente {
    private String nombre;
    private Integer dni;
    private Pedido pedido;

    public Cliente(String nombre, Integer dni){
        this.dni = dni;
        this.nombre = nombre;
        this.pedido = new Pedido(this);
    }

    public void agregarMercaderia(Mercaderia ... mercaderias){
        this.pedido.agregarMercaderia(mercaderias);
    }

    public void hacerPedidoAUn(Deposito unDeposito){
        unDeposito.addPedido(this.pedido);
    }
}
