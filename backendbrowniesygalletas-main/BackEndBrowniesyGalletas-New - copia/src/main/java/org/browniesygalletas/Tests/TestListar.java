package org.browniesygalletas.Tests;

import org.browniesygalletas.modelo.Administrador;
import org.browniesygalletas.service.ServiceAdmon;

public class TestListar {
    public static void main(String[] args) {
        ServiceAdmon administradorPrincipal = new Administrador("Credencial", "contrase");
        administradorPrincipal.listarProductos();
    }
}
