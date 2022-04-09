package com.produit.gestionproduit.service;

import com.produit.gestionproduit.dto.CaissierRequestDTO;
import com.produit.gestionproduit.dto.CaissierResponseDTO;
import com.produit.gestionproduit.entities.Caissier;
import com.produit.gestionproduit.mappers.CaissierMapper;
import com.produit.gestionproduit.repositories.CaissierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CaissierServiceImpl implements CaissierService{

    private CaissierRepository caissierRepository;
    private CaissierMapper caissierMapper;
    @Autowired
    public CaissierServiceImpl(CaissierRepository caissierRepository, CaissierMapper caissierMapper) {
        this.caissierRepository = caissierRepository;
        this.caissierMapper = caissierMapper;
    }

    @Override
    public CaissierResponseDTO saveCaissier(CaissierRequestDTO caissierRequestDTO) {

        Caissier caissier= caissierMapper.caissierRequestDTOCaissier(caissierRequestDTO);
        Caissier saveCaisse=caissierRepository.save(caissier);
        CaissierResponseDTO caissierResponseDTO=caissierMapper.caissierToCaissierResponseDTO(saveCaisse);
        return caissierResponseDTO;
    }

    @Override
    public CaissierResponseDTO getCaissier(Long id) {
        Caissier caissier=caissierRepository.findById(id).get();
        CaissierResponseDTO caissierResponseDTO=caissierMapper.caissierToCaissierResponseDTO(caissier);
        return caissierResponseDTO;
    }

    @Override
    public List<CaissierResponseDTO> listCaissier() {
        List<Caissier> caissiers=caissierRepository.findAll();
        List<CaissierResponseDTO> caissierResponseDTOS=
                caissiers.stream()
                        .map(cust->caissierMapper.caissierToCaissierResponseDTO(cust))
                        .collect(Collectors.toList());
        return caissierResponseDTOS;
    }

    @Override
    public CaissierResponseDTO updateCaissier(CaissierRequestDTO caissierRequestDTO) {
        Caissier caissier=caissierMapper.caissierRequestDTOCaissier(caissierRequestDTO);
        Caissier upadateCaisssier=caissierRepository.save(caissier);
        CaissierResponseDTO caissierResponseDTO=caissierMapper.caissierToCaissierResponseDTO(upadateCaisssier);
        return caissierResponseDTO;
    }

    @Override
    public void deleteCaissier(Long id) {
        caissierRepository.deleteById(id);
    }
}
