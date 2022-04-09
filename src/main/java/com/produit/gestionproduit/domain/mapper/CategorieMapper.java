package com.produit.gestionproduit.domain.mapper;

import com.produit.gestionproduit.domain.dto.CategorieRequestDTO;
import com.produit.gestionproduit.domain.dto.CategorieResponseDTO;
import com.produit.gestionproduit.domain.entity.Categorie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    Categorie categorieRequestDTOCategorie(CategorieRequestDTO categorieRequestDTO);
    CategorieResponseDTO categorieToCategorieResponseDTO(Categorie categorie);
    Categorie categorieResponseDTOC(CategorieResponseDTO categorieResponseDTO);
}
