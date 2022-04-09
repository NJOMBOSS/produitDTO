package com.produit.gestionproduit.service;


import com.produit.gestionproduit.domain.dto.VenteRequestDTO;
import com.produit.gestionproduit.domain.dto.VenteResponseDTO;

import java.util.List;

public interface VenteService {

    VenteResponseDTO saveVente(VenteRequestDTO venteRequestDTO);
    VenteResponseDTO getVente(Long id);
    List<VenteResponseDTO> listVente();
    VenteResponseDTO updateVente(VenteRequestDTO venteRequestDTO);
    void deleteVente(Long id);
}
