package com.produit.gestionproduit.domain.mapper;

import com.produit.gestionproduit.domain.dto.CaissierRequestDTO;
import com.produit.gestionproduit.domain.dto.CaissierResponseDTO;
import com.produit.gestionproduit.domain.entity.Caissier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CaissierMapper {
    Caissier caissierRequestDTOCaissier(CaissierRequestDTO caissierRequestDTO);
    CaissierResponseDTO caissierToCaissierResponseDTO(Caissier caissier);

}
