package org.browniesygalletas.modelo;

public class DetalleAdicion {
    private int idPedido;
    private int idProducto;
    private int idAdicion;

    public DetalleAdicion(Pedido idPedido, Producto idProducto, Adiciones idAdicion) {
        this.idPedido = idProducto.getId();
        this.idProducto = idProducto.getId();
        this.idAdicion = idAdicion.getId();
    }

}
