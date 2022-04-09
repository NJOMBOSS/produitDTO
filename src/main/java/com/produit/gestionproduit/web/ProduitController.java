package com.produit.gestionproduit.web;

import com.produit.gestionproduit.dto.ProduitRequestDTO;
import com.produit.gestionproduit.dto.ProduitResponseDTO;
import com.produit.gestionproduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProduitController {

    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping("/produit")
    public ProduitResponseDTO enregisterProduit(@RequestBody ProduitRequestDTO produitRequestDTO){
        return produitService.saveProduit(produitRequestDTO);
    }

    @GetMapping("/produit")
    List<ProduitResponseDTO> allProduit(){
        return produitService.listProduit();
    }

    @GetMapping("/produit/{id}")
     ProduitResponseDTO  unProduit(@PathVariable Long id){
        return  produitService.getProduit(id);
    }

    @PutMapping("/produit/{id}")
    ProduitResponseDTO modifierProduit(@RequestBody ProduitRequestDTO produitRequestDTO,@PathVariable Long id){
        produitRequestDTO.setIdP(id);
        return produitService.saveProduit(produitRequestDTO);
    }

    @DeleteMapping("/produit/{id}")
    public  void supprimerProduit(@PathVariable Long id){
        produitService.deleteProduit(id);
    }

}
