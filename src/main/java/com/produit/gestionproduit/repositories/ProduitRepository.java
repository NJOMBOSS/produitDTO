package com.produit.gestionproduit.repositories;

import com.produit.gestionproduit.entities.Categorie;
import com.produit.gestionproduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
