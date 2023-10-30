package org.browniesygalletas.modelo;

import java.util.Date;

public class Pedido {
    private int idPedido;
    private int idCliente;
    private Date fechaPedido;
    private Date fechaEntregaPedido;
    private String direccionEntrega;
    private static int ultimoIdPedido;

    public Pedido(){
        this.idPedido=++ultimoIdPedido;
    }

    public Pedido(Cliente idCliente, Date fechaPedido, Date fechaEntregaPedido, String direccionEntrega) {
        this();
        this.idCliente = idCliente.getIdCliente();
        this.fechaPedido = fechaPedido;
        this.fechaEntregaPedido = fechaEntregaPedido;
        this.direccionEntrega = direccionEntrega;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Date fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
}
