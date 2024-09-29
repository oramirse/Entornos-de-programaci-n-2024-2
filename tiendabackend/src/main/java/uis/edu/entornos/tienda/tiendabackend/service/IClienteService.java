package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import uis.edu.entornos.tienda.tiendabackend.model.Cliente;

public interface IClienteService {
    List<Cliente> getClientes();

    Cliente newCliente(Cliente cliente);

    Optional<Cliente> findClienteById(Long id);

    void deleteCliente(Long id);
}
