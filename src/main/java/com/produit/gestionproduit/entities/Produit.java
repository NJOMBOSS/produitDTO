package com.produit.gestionproduit.entities;

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
    private Date date_fabrication;
    private Date date_expiration;
    @Column(name="en_promotion")
    private boolean ispromotion;
    @ManyToOne
    private Categorie categorie;

}
