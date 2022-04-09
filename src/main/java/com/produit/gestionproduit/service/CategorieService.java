package com.produit.gestionproduit.service;

import com.produit.gestionproduit.domain.dto.CategorieRequestDTO;
import com.produit.gestionproduit.domain.dto.CategorieResponseDTO;

import java.util.List;

public interface CategorieService {

    CategorieResponseDTO saveCategorie(CategorieRequestDTO categorieRequestDTO);
    CategorieResponseDTO getCategorie(Long id);
    List<CategorieResponseDTO> listCategorie();
    CategorieResponseDTO updateCategorie(CategorieRequestDTO categorieRequestDTO);
    void deleteCategorie(Long id);

}
