package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.ProduitRequestDTO;
import com.produit.gestionproduit.dto.ProduitResponseDTO;



import java.util.List;

public interface ProduitService {

    ProduitResponseDTO saveProduit(ProduitRequestDTO produitRequestDTO);
    ProduitResponseDTO getProduit(Long id);
    List<ProduitResponseDTO> listProduit();
    ProduitResponseDTO updateProduit(ProduitRequestDTO produitRequestDTO);
    void deleteProduit(Long id);

}
