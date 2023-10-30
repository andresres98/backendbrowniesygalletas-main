package org.browniesygalletas.modelo;

public class Personalizacion {
    private int idPersonalizacion;
    private String descripcion;
    private Producto idProducto;
    private static int ultimoIdPersonalizacion;

    public Personalizacion(){
        this.idPersonalizacion= ++ultimoIdPersonalizacion;
    }

    public Personalizacion(String descripcion, Producto idProducto) {
        this();
        this.descripcion = descripcion;
        this.idProducto = idProducto;
    }

    public int getIdPersonalizacion() {
        return idPersonalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
}
