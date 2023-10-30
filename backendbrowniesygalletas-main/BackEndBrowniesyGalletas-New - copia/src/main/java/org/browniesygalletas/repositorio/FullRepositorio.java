package org.browniesygalletas.repositorio;

import org.browniesygalletas.modelo.*;

import java.util.ArrayList;

public abstract class FullRepositorio {
    protected ArrayList<Adiciones> dataSourceAdiciones = new ArrayList<>();
    protected ArrayList<Producto> dataSourceProductos = new ArrayList<>();
    protected ArrayList<Factura> dataSourceFacturas = new ArrayList<>();
    protected ArrayList<Domicilio> dataSourceDomiclio = new ArrayList<>();
    protected ArrayList<Cliente> dataSourceClientes = new ArrayList<>();

}
