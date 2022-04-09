package com.produit.gestionproduit.web;

import com.produit.gestionproduit.dto.CategorieRequestDTO;
import com.produit.gestionproduit.dto.CategorieResponseDTO;
import com.produit.gestionproduit.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping(path = "/api")
public class CategorieController {

    private CategorieService categorieService;
    @Autowired
    public CategorieController(CategorieService categorieService) {

        this.categorieService = categorieService;
    }

    @PostMapping("/categorie")
    public CategorieResponseDTO enregisterCategorie(@RequestBody CategorieRequestDTO categorieRequestDTO){
        return categorieService.saveCategorie(categorieRequestDTO);
    }
    @GetMapping("/categorie")
    List<CategorieResponseDTO > allCategorie(){
        return categorieService.listCategorie();
    }

    @GetMapping("/categorie/{id}")
    CategorieResponseDTO  unCategorie(@PathVariable Long id){
        return  categorieService.getCategorie(id);
    }
    @PutMapping("/categorie/{id}")
    CategorieResponseDTO  modifierCategorie(@RequestBody CategorieRequestDTO categorieRequestDTO,@PathVariable Long id){
        categorieRequestDTO.setIdCat(id);
        return categorieService.saveCategorie(categorieRequestDTO);
    }

    @DeleteMapping("/categorie/{id}")
    public  void supprimerCategorie(@PathVariable Long id){
        categorieService.deleteCategorie(id);
    }


}
