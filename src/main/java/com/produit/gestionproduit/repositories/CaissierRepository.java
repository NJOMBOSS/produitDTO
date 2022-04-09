package com.produit.gestionproduit.repositories;

import com.produit.gestionproduit.entities.Caissier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaissierRepository extends JpaRepository <Caissier, Long>{

}
