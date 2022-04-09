package com.produit.gestionproduit.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaissierRequestDTO {
    private Long id;
    private String nomCaissier;
}
