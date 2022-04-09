package com.produit.gestionproduit.web;

import com.produit.gestionproduit.entities.Vente;
import com.produit.gestionproduit.service.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping(path = "/api")
public class VenteController {

    private VenteService venteService;

}
