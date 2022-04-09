package com.produit.gestionproduit.domain.mapper;


import com.produit.gestionproduit.domain.dto.VenteRequestDTO;
import com.produit.gestionproduit.domain.dto.VenteResponseDTO;
import com.produit.gestionproduit.domain.entity.Vente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VenteMapper {
    Vente venteRequestDTOVente(VenteRequestDTO venteRequestDTO);
    VenteResponseDTO venteToVenteResponseDTO(Vente vente);
}
