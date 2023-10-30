package org.browniesygalletas.modelo;

public class DetalleVenta {
    private Producto idProducto;
    private Pedido idPedido;
    private Integer cantidad;

    public DetalleVenta(Producto idProducto, Pedido idPedido, Integer cantidad) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return 1;
    }

    public double TotalProductos() {
        double totalFinal = this.cantidad*this.idProducto.getPrecio();
        return totalFinal;
    }
}
