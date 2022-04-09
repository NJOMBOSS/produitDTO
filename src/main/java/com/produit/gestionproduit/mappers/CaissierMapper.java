package com.produit.gestionproduit.mappers;

import com.produit.gestionproduit.dto.CaissierRequestDTO;
import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.entities.Caissier;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CaissierMapper {
    Caissier caissierRequestDTOCaissier(CaissierRequestDTO caissierRequestDTO);
    CaissierResponseDTO caissierToCaissierResponseDTO(Caissier caissier);

}
