package com.produit.gestionproduit.mappers;

import com.produit.gestionproduit.dto.CaissierRequestDTO;
import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.dto.CategorieRequestDTO;
import com.produit.gestionproduit.dto.CategorieResponseDTO;
import com.produit.gestionproduit.entities.Caissier;
import com.produit.gestionproduit.entities.Categorie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    Categorie categorieRequestDTOCategorie(CategorieRequestDTO categorieRequestDTO);
    CategorieResponseDTO categorieToCategorieResponseDTO(Categorie categorie);
    Categorie categorieResponseDTOC(CategorieResponseDTO categorieResponseDTO);
}
