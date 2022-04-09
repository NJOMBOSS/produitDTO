package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.CaissierRequestDTO;
import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.entities.Caissier;

import java.util.List;

public interface CaissierService {

    CaissierResponseDTO saveCaissier(CaissierRequestDTO caissierRequestDTO);
    CaissierResponseDTO getCaissier(Long id);
    List<CaissierResponseDTO> listCaissier();
    CaissierResponseDTO updateCaissier(CaissierRequestDTO caissierRequestDTO);
    void deleteCaissier(Long id);


}
