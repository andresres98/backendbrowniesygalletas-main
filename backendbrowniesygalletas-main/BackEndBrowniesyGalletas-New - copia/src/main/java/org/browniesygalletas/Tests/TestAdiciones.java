package org.browniesygalletas.Tests;

import org.browniesygalletas.modelo.Adiciones;
import org.browniesygalletas.modelo.Administrador;
import org.browniesygalletas.service.ServiceAdmon;

public class TestAdiciones {
    public static void main(String[] args) {
        ServiceAdmon administradorPrincipal = new ServiceAdmon();

        System.out.println("===== Probando la creacion de adiciones ======");
        administradorPrincipal.crearAdicion(); //Milo
        administradorPrincipal.crearAdicion(); //Oreo
        administradorPrincipal.crearAdicion(); //Arequipe

        System.out.println("======= Probando el listar las adiciones ====");
        administradorPrincipal.listarAdiciones();

        System.out.println("===== Porbando el obtener por Id ======");
        Adiciones milo = administradorPrincipal.obtenerAdicionPorId(1);
        System.out.println(milo);


        System.out.println("====== Probando eliminar adicion ======");
        administradorPrincipal.eliminarAdicion(2);
        administradorPrincipal.listarAdiciones();

        System.out.println("===== Probando el modificar una adicion ====");
        Adiciones miloActualizado = new Adiciones("Milo", 2900, "Este el el milo actualizado");
        miloActualizado.setId(1);
        administradorPrincipal.modificarAdiciones(miloActualizado);
        System.out.println(milo);








    }
}
