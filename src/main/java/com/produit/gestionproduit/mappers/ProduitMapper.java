package com.produit.gestionproduit.mappers;

import com.produit.gestionproduit.dto.ProduitRequestDTO;
import com.produit.gestionproduit.dto.ProduitResponseDTO;
import com.produit.gestionproduit.entities.Produit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProduitMapper {
    Produit produitRequestDTOProduit(ProduitRequestDTO produitRequestDTO);
    ProduitResponseDTO produitToProduitResponseDTO(Produit produit);
}
