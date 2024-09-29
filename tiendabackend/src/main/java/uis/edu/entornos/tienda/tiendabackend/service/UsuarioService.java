package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uis.edu.entornos.tienda.tiendabackend.model.Usuario;
import uis.edu.entornos.tienda.tiendabackend.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService implements IUsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario newUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> findUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return;
    }
}
