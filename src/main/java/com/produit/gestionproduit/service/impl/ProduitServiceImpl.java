package com.produit.gestionproduit.service.impl;

import com.produit.gestionproduit.domain.dto.ProduitRequestDTO;
import com.produit.gestionproduit.domain.dto.ProduitResponseDTO;
import com.produit.gestionproduit.domain.entity.Categorie;
import com.produit.gestionproduit.domain.entity.Produit;
import com.produit.gestionproduit.domain.mapper.ProduitMapper;
import com.produit.gestionproduit.repository.CategorieRepository;
import com.produit.gestionproduit.repository.ProduitRepository;
import com.produit.gestionproduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;
    private final CategorieRepository categorieRepository;

    private final ProduitMapper produitMapper;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository,
                              CategorieRepository categorieRepository,
                              ProduitMapper produitMapper) {
        this.produitRepository = produitRepository;
        this.categorieRepository = categorieRepository;
        this.produitMapper = produitMapper;
    }

    @Override
    public ProduitResponseDTO saveProduit(ProduitRequestDTO produitRequestDTO) {

        Categorie categorie = categorieRepository.findById(produitRequestDTO.getIDcategorie())
                .orElseThrow(()-> new RuntimeException("Aucune categorie n'existe pour ce produit"));

        Produit produit = produitMapper.produitRequestDTOProduit(produitRequestDTO);
        produit.setCategorie(categorie);

        Produit saveProduit = produitRepository.save(produit);
        return produitMapper.produitToProduitResponseDTO(saveProduit);

    }

    @Override
    public ProduitResponseDTO getProduit(Long id) {
      Produit produit=produitRepository.findById(id).get();
        return produitMapper.produitToProduitResponseDTO(produit);
    }

    @Override
    public List<ProduitResponseDTO> listProduit() {
        List<Produit> produits=produitRepository.findAll();
        List<ProduitResponseDTO> produitResponseDTOS=
                produits.stream()
                        .map(prod->produitMapper.produitToProduitResponseDTO(prod))
                        .collect(Collectors.toList());
        return produitResponseDTOS;
    }

    @Override
    public ProduitResponseDTO updateProduit(ProduitRequestDTO produitRequestDTO) {
      Produit produit=produitMapper.produitRequestDTOProduit(produitRequestDTO);
        Produit upadateProduit=produitRepository.save(produit);
        ProduitResponseDTO produitResponseDTO=produitMapper.produitToProduitResponseDTO(upadateProduit);
        return produitResponseDTO;
    }

    @Override
    public void deleteProduit(Long id) {
       produitRepository.deleteById(id);
    }
}
