package com.produit.gestionproduit.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="code")
    private Long idCat;
    @Column(name="nom")
    private String nomCat;
    @Column(name="description")
    private String descriptionCat;
}
