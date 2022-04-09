package com.produit.gestionproduit.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Vente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateVente;
    private int quantitéVendu;
    @ManyToOne
    private Caissier caissier;
    @ManyToOne
    private Produit produit;

}
