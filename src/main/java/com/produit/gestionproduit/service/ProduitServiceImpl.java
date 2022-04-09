package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.dto.ProduitRequestDTO;
import com.produit.gestionproduit.dto.ProduitResponseDTO;
import com.produit.gestionproduit.entities.Caissier;
import com.produit.gestionproduit.entities.Categorie;
import com.produit.gestionproduit.entities.Produit;
import com.produit.gestionproduit.mappers.ProduitMapper;
import com.produit.gestionproduit.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService{

    private ProduitRepository produitRepository;
    private ProduitMapper produitMapper;
    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository, ProduitMapper produitMapper) {
        this.produitRepository = produitRepository;
        this.produitMapper = produitMapper;
    }

    @Override
    public ProduitResponseDTO saveProduit(ProduitRequestDTO produitRequestDTO) {
        Produit produit=produitMapper.produitRequestDTOProduit(produitRequestDTO);
        Produit saveProduit=produitRepository.save(produit);
        ProduitResponseDTO produitResponseDTO=produitMapper.produitToProduitResponseDTO(saveProduit);
        return produitResponseDTO;
    }

    @Override
    public ProduitResponseDTO getProduit(Long id) {
      Produit produit=produitRepository.findById(id).get();
        ProduitResponseDTO produitResponseDTO=produitMapper.produitToProduitResponseDTO(produit);
        return produitResponseDTO;
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
