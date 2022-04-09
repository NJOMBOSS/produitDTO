package com.produit.gestionproduit.dto;

import com.produit.gestionproduit.entities.Categorie;
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
    private Date date_fabrication;
    private Date date_expiration;
    private boolean ispromotion;
   private Categorie categorie;
}
