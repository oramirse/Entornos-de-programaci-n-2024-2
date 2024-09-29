package uis.edu.entornos.tienda.tiendabackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uis.edu.entornos.tienda.tiendabackend.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
