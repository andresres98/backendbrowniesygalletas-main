package org.browniesygalletas.Tests;

import org.browniesygalletas.modelo.Administrador;
import org.browniesygalletas.modelo.CategoriaProductos;
import org.browniesygalletas.modelo.Producto;
import org.browniesygalletas.service.ServiceAdmon;

public class TestProducto {
    public static void main(String[] args) {
        ServiceAdmon administradorPrincipal = new Administrador("Juan", "1234");
        System.out.println("====Probando el crear Producto =====");
        administradorPrincipal.crearProducto(); //Caja de brownies
        administradorPrincipal.crearProducto(); //Caja de galletas
        administradorPrincipal.crearProducto(); // Minicake de X porciones

        System.out.println("====Probando el listar Productos ======");
        administradorPrincipal.listarProductos();

        System.out.println("==== Probando el obtener idProducto ======");
        Producto galletaObtenida =  administradorPrincipal.obtenerProductoPorId(2);
        System.out.println(galletaObtenida);

        System.out.println("====Probando el elminar un Producto ======");
        administradorPrincipal.eliminarProducto(1);
        administradorPrincipal.listarProductos();

        System.out.println(" ===== Probando el modificar un producto =====");
        Producto miniCakeActualizado = new Producto("Minicake", 30000, "Es una minicake", CategoriaProductos.MINICAKE, false);
        miniCakeActualizado.setIdProducto(3);
        administradorPrincipal.modificarProducto(miniCakeActualizado);
        administradorPrincipal.listarProductos();
    }
}
