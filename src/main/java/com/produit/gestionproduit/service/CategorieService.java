package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.CaissierRequestDTO;
import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.dto.CategorieRequestDTO;
import com.produit.gestionproduit.dto.CategorieResponseDTO;
import com.produit.gestionproduit.entities.Categorie;

import java.util.List;

public interface CategorieService {

    CategorieResponseDTO saveCategorie(CategorieRequestDTO categorieRequestDTO);
    CategorieResponseDTO getCategorie(Long id);
    List<CategorieResponseDTO> listCategorie();
    CategorieResponseDTO updateCategorie(CategorieRequestDTO categorieRequestDTO);
    void deleteCategorie(Long id);

}
