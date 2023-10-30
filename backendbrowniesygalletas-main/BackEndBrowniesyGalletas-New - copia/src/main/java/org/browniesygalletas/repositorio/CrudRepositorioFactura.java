package org.browniesygalletas.repositorio;

import org.browniesygalletas.modelo.Factura;

public interface CrudRepositorioFactura {
    Factura obtenerFacturaPorId (Integer id);
}
