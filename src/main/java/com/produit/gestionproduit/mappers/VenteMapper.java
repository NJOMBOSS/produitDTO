package com.produit.gestionproduit.mappers;


import com.produit.gestionproduit.dto.VenteRequestDTO;
import com.produit.gestionproduit.dto.VenteResponseDTO;
import com.produit.gestionproduit.entities.Vente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VenteMapper {
    Vente venteRequestDTOVente(VenteRequestDTO venteRequestDTO);
    VenteResponseDTO venteToVenteResponseDTO(Vente vente);
}
