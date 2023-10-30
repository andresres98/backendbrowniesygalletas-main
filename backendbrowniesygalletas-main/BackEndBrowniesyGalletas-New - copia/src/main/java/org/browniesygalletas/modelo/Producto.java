package org.browniesygalletas.modelo;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String descripcion;
    private CategoriaProductos categoriaProducto;
    private boolean personalizacionProducto;
    private static int ultimoIdProducto;

    public Producto(){
        this.idProducto= ++ultimoIdProducto;
    }

    public Producto(String nombre, double precio, String descripcion, CategoriaProductos categoriaProducto, boolean personalizacionProducto) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoriaProducto = categoriaProducto;
        this.personalizacionProducto = personalizacionProducto;
    }

    public Integer getId() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaProductos getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProductos categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public boolean getPersonalizacionProducto() {
        return personalizacionProducto;
    }

    public void setPersonalizacionProducto(boolean personalizacionProducto) {
        this.personalizacionProducto = personalizacionProducto;
    }

    @Override
    public String toString() {
        return "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", categoriaProducto=" + categoriaProducto +
                ", personalizacionProducto=" + personalizacionProducto;
    }
}
