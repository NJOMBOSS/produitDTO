package com.produit.gestionproduit.repository;

import com.produit.gestionproduit.domain.entity.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenteRepository extends JpaRepository<Vente,Long> {

}
