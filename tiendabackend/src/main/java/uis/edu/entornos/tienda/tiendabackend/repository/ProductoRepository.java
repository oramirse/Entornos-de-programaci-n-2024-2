package uis.edu.entornos.tienda.tiendabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uis.edu.entornos.tienda.tiendabackend.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
