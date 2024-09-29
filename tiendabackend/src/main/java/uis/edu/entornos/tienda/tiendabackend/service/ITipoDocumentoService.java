package uis.edu.entornos.tienda.tiendabackend.service;

import java.util.List;
import java.util.Optional;

import uis.edu.entornos.tienda.tiendabackend.model.TipoDocumento;

public interface ITipoDocumentoService {
    List<TipoDocumento> getTipoDocumentos();

    TipoDocumento newTipoDocumento(TipoDocumento tipoDocumento);

    Optional<TipoDocumento> findTipoDocumentoById(Long id);

    void deleteTipoDocumento(Long id);
}
