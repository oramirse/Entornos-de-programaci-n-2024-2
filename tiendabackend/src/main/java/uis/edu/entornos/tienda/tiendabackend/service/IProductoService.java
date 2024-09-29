package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import uis.edu.entornos.tienda.tiendabackend.model.Producto;

public interface IProductoService {
    List<Producto> getProductos();

    Producto newProducto(Producto producto);

    Optional<Producto> findProductoById(Long id);

    void deleteProducto(Long id);
}
