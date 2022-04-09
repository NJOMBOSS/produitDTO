package com.produit.gestionproduit.service;



import com.produit.gestionproduit.dto.VenteRequestDTO;
import com.produit.gestionproduit.dto.VenteResponseDTO;
import com.produit.gestionproduit.entities.Vente;
import com.produit.gestionproduit.mappers.VenteMapper;
import com.produit.gestionproduit.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class VenteServiceImpl implements VenteService{

    private VenteRepository venteRepository;
    private VenteMapper venteMapper;

    @Autowired
    public VenteServiceImpl(VenteRepository venteRepository, VenteMapper venteMapper) {
        this.venteRepository = venteRepository;
        this.venteMapper = venteMapper;
    }

    @Override
    public VenteResponseDTO saveVente(VenteRequestDTO venteRequestDTO) {
        Vente vente=venteMapper.venteRequestDTOVente(venteRequestDTO);
        Vente saveVente=venteRepository.save(vente);
        VenteResponseDTO venteResponseDTO=venteMapper.venteToVenteResponseDTO(saveVente);
        return venteResponseDTO;
    }

    @Override
    public VenteResponseDTO getVente(Long id) {
        Vente vente=venteRepository.findById(id).get();
        VenteResponseDTO venteResponseDTO=venteMapper.venteToVenteResponseDTO(vente);
        return venteResponseDTO;
    }

    @Override
    public List<VenteResponseDTO> listVente() {
        List<Vente> ventes=venteRepository.findAll();
        List<VenteResponseDTO>venteResponseDTOS=
                ventes.stream()
                        .map(vent->venteMapper.venteToVenteResponseDTO(vent))
                        .collect(Collectors.toList());
        return venteResponseDTOS;
    }

    @Override
    public VenteResponseDTO updateVente(VenteRequestDTO venteRequestDTO) {
        Vente vente=venteMapper.venteRequestDTOVente(venteRequestDTO);
       Vente upadateVente=venteRepository.save(vente);
        VenteResponseDTO venteResponseDTO=venteMapper.venteToVenteResponseDTO(upadateVente);
        return venteResponseDTO;
    }

    @Override
    public void deleteVente(Long id) {
      venteRepository.deleteById(id);
    }
}
