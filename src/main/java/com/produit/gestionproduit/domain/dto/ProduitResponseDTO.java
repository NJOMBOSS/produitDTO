package com.produit.gestionproduit.domain.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProduitResponseDTO {
    private Long idP;
    private String nomP;
    private String description;
    private int quantite;
    private Date dateFabrication;
    private Date dateExpiration;
    private boolean ispromotion;
}
