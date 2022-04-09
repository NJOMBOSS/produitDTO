package com.produit.gestionproduit.repository;

import com.produit.gestionproduit.domain.entity.Caissier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaissierRepository extends JpaRepository <Caissier, Long>{

}
