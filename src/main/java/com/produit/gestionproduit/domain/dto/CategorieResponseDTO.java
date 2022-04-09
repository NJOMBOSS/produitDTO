package com.produit.gestionproduit.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieResponseDTO {
    private Long idCat;
    private String nomCat;
    private String descriptionCat;
}
