package org.browniesygalletas.repositorio;
import org.browniesygalletas.modelo.Producto;

public interface CrudRepositorioProductos {
    //Este es la interface CRUD de los servicios relacionados a los productos

    void crearProducto();

    void eliminarProducto(Integer id);

    void listarProductos();

    void modificarProducto(Producto producto);

    Producto obtenerProductoPorId (Integer id);
}
