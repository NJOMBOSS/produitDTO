package com.produit.gestionproduit.domain.dto;

import com.produit.gestionproduit.domain.entity.Caissier;
import com.produit.gestionproduit.domain.entity.Produit;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class VenteResponseDTO {
    private Long id;
    private Date dateVente;
    private int quantitéVendu;
    private Caissier caissier;
    private Produit produit;
}
