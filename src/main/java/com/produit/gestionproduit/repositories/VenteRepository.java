package com.produit.gestionproduit.repositories;

import com.produit.gestionproduit.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenteRepository extends JpaRepository<Vente,Long> {

}
