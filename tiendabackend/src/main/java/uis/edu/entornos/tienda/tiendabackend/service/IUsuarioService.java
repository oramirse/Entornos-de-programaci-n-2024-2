package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import uis.edu.entornos.tienda.tiendabackend.model.Usuario;

public interface IUsuarioService {
    List<Usuario> getUsuarios();

    Usuario newUsuario(Usuario usuario);

    Optional<Usuario> findUsuarioById(Long id);

    void deleteUsuario(Long id);
}
