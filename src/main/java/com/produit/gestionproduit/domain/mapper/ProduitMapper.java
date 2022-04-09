package com.produit.gestionproduit.domain.mapper;

import com.produit.gestionproduit.domain.dto.ProduitRequestDTO;
import com.produit.gestionproduit.domain.dto.ProduitResponseDTO;
import com.produit.gestionproduit.domain.entity.Produit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProduitMapper {
    Produit produitRequestDTOProduit(ProduitRequestDTO produitRequestDTO);
    ProduitResponseDTO produitToProduitResponseDTO(Produit produit);
}
