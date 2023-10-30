package org.browniesygalletas.modelo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String celular;
    private static int ultimoId;

    public Cliente(){
        this.idCliente=++ultimoId;
    }

    public Cliente(String nombre, String apellido, String celular) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
