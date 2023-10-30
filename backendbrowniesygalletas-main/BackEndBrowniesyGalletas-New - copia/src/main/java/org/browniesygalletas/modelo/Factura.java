package org.browniesygalletas.modelo;

public class Factura {
    private int idFactura;
    private Cliente nombre;
    private Cliente apellido;
    private Cliente celular;
    private Pedido direccionEntrega;
    private Pedido fechaPedido;
    private Pedido fechaEntregaPedido;
    private double totalFacturacion;
    private static int ultimoIdFactura;

    private Factura(){
        this.idFactura= ++ultimoIdFactura;
    }

    public Factura(Cliente nombre, Cliente apellido, Cliente celular, Pedido direccionEntrega, Pedido fechaPedido, Pedido fechaEntregaPedido, double totalFacturacion) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.direccionEntrega = direccionEntrega;
        this.fechaPedido = fechaPedido;
        this.fechaEntregaPedido = fechaEntregaPedido;
        this.totalFacturacion = totalFacturacion;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public Cliente getNombre() {
        return nombre;
    }

    public void setNombre(Cliente nombre) {
        this.nombre = nombre;
    }

    public Cliente getApellido() {
        return apellido;
    }

    public void setApellido(Cliente apellido) {
        this.apellido = apellido;
    }

    public Cliente getCelular() {
        return celular;
    }

    public void setCelular(Cliente celular) {
        this.celular = celular;
    }

    public Pedido getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Pedido direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Pedido getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Pedido fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Pedido getFechaEntregaPedido() {
        return fechaEntregaPedido;
    }

    public void setFechaEntregaPedido(Pedido fechaEntregaPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
    }

    public double getTotalFacturacion() {
        return totalFacturacion;
    }

    public void setTotalFacturacion(double totalFacturacion) {
        this.totalFacturacion = totalFacturacion;
    }

    public void generarPDF(){

    }
}
