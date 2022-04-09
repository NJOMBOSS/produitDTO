package com.produit.gestionproduit.controller;

import com.produit.gestionproduit.domain.dto.CaissierRequestDTO;
import com.produit.gestionproduit.domain.dto.CaissierResponseDTO;
import com.produit.gestionproduit.service.CaissierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CaissierController {
    private CaissierService caissierService;

    public CaissierController(CaissierService caissierService) {
        this.caissierService = caissierService;
    }

    @PostMapping("/caissier")
    public CaissierResponseDTO enregisterCaissier(@RequestBody CaissierRequestDTO caissierRequestDTO){
        return caissierService.saveCaissier(caissierRequestDTO);
    }

    @GetMapping("/caissier")
    List<CaissierResponseDTO> allCaissier(){
        return caissierService.listCaissier();
    }

    @GetMapping("/caissier/{id}")
    CaissierResponseDTO  unCaissier(@PathVariable Long id){
        return  caissierService.getCaissier(id);
    }

    @PutMapping("/caissier/{id}")
    CaissierResponseDTO modifierCaissier(@RequestBody CaissierRequestDTO caissierRequestDTO,@PathVariable Long id){
        caissierRequestDTO.setId(id);
        return caissierService.saveCaissier(caissierRequestDTO);
    }

    @DeleteMapping("/caissier/{id}")
    public  void supprimerCaissier(@PathVariable Long id){
        caissierService.deleteCaissier(id);
    }
}
