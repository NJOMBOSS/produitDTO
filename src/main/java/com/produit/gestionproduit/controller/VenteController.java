package com.produit.gestionproduit.controller;

import com.produit.gestionproduit.service.VenteService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Transactional
@RequestMapping(path = "/api")
public class VenteController {

    private VenteService venteService;

}
