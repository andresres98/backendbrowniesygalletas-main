package org.browniesygalletas.service;
import org.browniesygalletas.modelo.Adiciones;
import org.browniesygalletas.modelo.CategoriaProductos;
import org.browniesygalletas.modelo.Factura;
import org.browniesygalletas.modelo.Producto;
import org.browniesygalletas.repositorio.CrudFullRepositorio;
import org.browniesygalletas.repositorio.FullRepositorio;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceAdmon extends FullRepositorio implements CrudFullRepositorio {

    static Scanner sc = new Scanner(System.in);

    public void crearAdicion() {
        System.out.println("==== Servicio Crear Adicion ====");
        System.out.println("Ingrese el nombre de la adición");
        String nombreAdicion = sc.nextLine();
        System.out.println("Ingrese el precio que tendra la adición");
        double precioAdicion = sc.nextDouble();
        sc.skip("\n");
        System.out.println("Ingrese la descripción de la adición => "+ nombreAdicion);
        String descripcionAdicion = sc.nextLine();
        Adiciones adicionCreada = new Adiciones(nombreAdicion, precioAdicion, descripcionAdicion);
        this.dataSourceAdiciones.add(adicionCreada);
    }

    @Override
    public void eliminarAdicion(Integer id) {
        this.dataSourceAdiciones.remove(this.obtenerAdicionPorId(id));
    }

    @Override
    public ArrayList<Adiciones> listarAdiciones() {
        dataSourceAdiciones.forEach(System.out::println);
        return dataSourceAdiciones;
    }

    @Override
    public void modificarAdiciones(Adiciones adicion) {
        Adiciones adi = this.obtenerAdicionPorId(adicion.getId());
        adi.setNombre(adicion.getNombre());
        adi.setPrecio(adicion.getPrecio());
        adi.setDescripcion(adicion.getDescripcion());
    }

    @Override
    public Adiciones obtenerAdicionPorId(Integer id) {
        Adiciones resultado = null;
        for(Adiciones adi: dataSourceAdiciones){
            if(adi.getId()!=null && adi.getId().equals(id)){
                resultado = adi;
                break;
            }
        }
        return resultado;
    }

    @Override
    public Factura obtenerFacturaPorId(Integer id) {
        return null;
    }

    @Override
    public void crearProducto() {
        System.out.println("====Servicio Creación Producto ===");
        System.out.println("Ingrese el nombre del producto => ");
        String nombreProducto = sc.nextLine();
        System.out.println("Ingrese el precio que tendra el producto => "+ nombreProducto);
        double precioProducto = sc.nextDouble();
        sc.skip("\n");
        System.out.println("Ingrese la descripción del producto => "+ nombreProducto);
        String descripcionProducto = sc.nextLine();
        System.out.println("Escoja la categría del producto => "+ nombreProducto);
        System.out.println("Escoja la categoría que tendra el producto entre las siguientes=> \n" +
                "1)Brownie \n2)Galleta \n3)MiniCake");
        String respuestaCategoria = sc.nextLine();
        CategoriaProductos asignarCategoria = CategoriaProductos.BROWNIE;
        switch (respuestaCategoria){
            case "1":
                asignarCategoria = CategoriaProductos.BROWNIE;
                break;
            case "2":
                asignarCategoria = CategoriaProductos.GALLETA;
                break;
            case "3":
                asignarCategoria= CategoriaProductos.MINICAKE;
                break;
            default:
        }
        System.out.println("El producto "+ nombreProducto+ " tendrá la opción de personalizarse? Si/No");
        boolean asignarPersonalizacion = false;
        String respuestaPersonalizacion = sc.nextLine();
        if (respuestaPersonalizacion.equalsIgnoreCase("si")){
            asignarPersonalizacion = true;
        }
        Producto productoCreado = new Producto(nombreProducto, precioProducto, descripcionProducto, asignarCategoria, asignarPersonalizacion);
        this.dataSourceProductos.add(productoCreado);
    }

    @Override
    public void eliminarProducto(Integer id) {
        this.dataSourceProductos.remove(this.obtenerProductoPorId(id));
    }

    @Override
    public void listarProductos() {
        dataSourceProductos.forEach(System.out::println);
    }


    @Override
    public void modificarProducto(Producto producto) {
        Producto prod = this.obtenerProductoPorId(producto.getId());
        prod.setNombre(producto.getNombre());
        prod.setPrecio(producto.getPrecio());
        prod.setDescripcion(producto.getDescripcion());
        prod.setCategoriaProducto(producto.getCategoriaProducto());
        prod.setPersonalizacionProducto(producto.getPersonalizacionProducto());
    }

    @Override
    public Producto obtenerProductoPorId(Integer id) {
        Producto resultado =null;
        for(Producto product: dataSourceProductos){
            if(product.getId().equals(id) && product.getId()!=null){
                resultado = product;
                break;
            }
        }
        return resultado;
    }


}
