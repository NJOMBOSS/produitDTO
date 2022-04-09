package com.produit.gestionproduit.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Builder
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="code")
    private Long idP;
    @Column(name="nom")
    private String nomP;
    private String description;
    private int quantite;
    private Date dateFabrication;
    private Date dateExpiration;
    @Column(name="en_promotion")
    private boolean ispromotion;
    @ManyToOne
    private Categorie categorie;

}
