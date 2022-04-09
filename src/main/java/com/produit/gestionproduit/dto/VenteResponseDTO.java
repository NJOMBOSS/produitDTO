package com.produit.gestionproduit.dto;

import com.produit.gestionproduit.entities.Caissier;
import com.produit.gestionproduit.entities.Produit;
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
