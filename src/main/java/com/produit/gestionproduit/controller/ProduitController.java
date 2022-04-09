package com.produit.gestionproduit.controller;

import com.produit.gestionproduit.domain.dto.ProduitRequestDTO;
import com.produit.gestionproduit.domain.dto.ProduitResponseDTO;
import com.produit.gestionproduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/produit")
public class ProduitController {

    private final ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping
    public ResponseEntity<ProduitResponseDTO> enregisterProduit(@RequestBody ProduitRequestDTO produitRequestDTO){
        return ResponseEntity.ok(produitService.saveProduit(produitRequestDTO));
    }

    @GetMapping("/all")
    List<ProduitResponseDTO> allProduit(){
        return produitService.listProduit();
    }

    @GetMapping("/{id}")
     ProduitResponseDTO  unProduit(@PathVariable Long id){
        return  produitService.getProduit(id);
    }

    @PutMapping("/{id}")
    ProduitResponseDTO modifierProduit(@RequestBody ProduitRequestDTO produitRequestDTO, @PathVariable Long id){
        //produitRequestDTO.setIdP(id);
        return produitService.saveProduit(produitRequestDTO);
    }

    @DeleteMapping("/{id}")
    public  void supprimerProduit(@PathVariable Long id){
        produitService.deleteProduit(id);
    }

}
