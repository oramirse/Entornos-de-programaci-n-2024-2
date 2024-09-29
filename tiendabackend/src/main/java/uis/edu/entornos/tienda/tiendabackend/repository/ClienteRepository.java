package uis.edu.entornos.tienda.tiendabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uis.edu.entornos.tienda.tiendabackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
