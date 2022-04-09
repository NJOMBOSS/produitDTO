package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.dto.CategorieRequestDTO;
import com.produit.gestionproduit.dto.CategorieResponseDTO;
import com.produit.gestionproduit.entities.Caissier;
import com.produit.gestionproduit.entities.Categorie;
import com.produit.gestionproduit.mappers.CategorieMapper;
import com.produit.gestionproduit.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService{

    private CategorieRepository categorieRepository;
    private CategorieMapper categorieMapper;

    public CategorieServiceImpl(CategorieRepository categorieRepository, CategorieMapper categorieMapper) {
        this.categorieRepository = categorieRepository;
        this.categorieMapper = categorieMapper;
    }

    @Override
    public CategorieResponseDTO saveCategorie(CategorieRequestDTO categorieRequestDTO) {
        Categorie categorie=categorieMapper.categorieRequestDTOCategorie(categorieRequestDTO);
        Categorie saveCat=categorieRepository.save(categorie);
        CategorieResponseDTO categorieResponseDTO=categorieMapper.categorieToCategorieResponseDTO(saveCat);
        return categorieResponseDTO;
    }

    @Override
    public CategorieResponseDTO getCategorie(Long id) {
        Categorie categorie=categorieRepository.findById(id).get();
        CategorieResponseDTO categorieResponseDTO=categorieMapper.categorieToCategorieResponseDTO(categorie);
        return categorieResponseDTO;
    }

    @Override
    public List<CategorieResponseDTO> listCategorie() {
        List<Categorie> categorie=categorieRepository.findAll();
        List<CategorieResponseDTO> categorieResponseDTOS=
                categorie.stream()
                        .map(cat->categorieMapper.categorieToCategorieResponseDTO(cat))
                        .collect(Collectors.toList());
        return categorieResponseDTOS;



    }

    @Override
    public CategorieResponseDTO updateCategorie(CategorieRequestDTO categorieRequestDTO) {
        Categorie  categorie=categorieMapper.categorieRequestDTOCategorie(categorieRequestDTO);
        Categorie upadateCategorie=categorieRepository.save(categorie);
        CategorieResponseDTO categorieResponseDTO=categorieMapper.categorieToCategorieResponseDTO(upadateCategorie);
        return  categorieResponseDTO;
    }

    @Override
    public void deleteCategorie(Long id) {
       categorieRepository.deleteById(id);
    }
}
