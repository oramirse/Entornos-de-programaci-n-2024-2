package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import uis.edu.entornos.tienda.tiendabackend.model.Venta;

public interface IVentaService {
    List<Venta> getVentas();

    Venta newVenta(Venta venta);

    Optional<Venta> findVentaById(Long id);

    void deleteVenta(Long id);
}
