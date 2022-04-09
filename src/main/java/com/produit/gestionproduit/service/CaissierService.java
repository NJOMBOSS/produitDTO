package com.produit.gestionproduit.service;

import com.produit.gestionproduit.domain.dto.CaissierRequestDTO;
import com.produit.gestionproduit.domain.dto.CaissierResponseDTO;

import java.util.List;

public interface CaissierService {

    CaissierResponseDTO saveCaissier(CaissierRequestDTO caissierRequestDTO);
    CaissierResponseDTO getCaissier(Long id);
    List<CaissierResponseDTO> listCaissier();
    CaissierResponseDTO updateCaissier(CaissierRequestDTO caissierRequestDTO);
    void deleteCaissier(Long id);


}
