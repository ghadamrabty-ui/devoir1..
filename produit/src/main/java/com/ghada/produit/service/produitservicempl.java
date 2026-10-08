package com.ghada.produit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ghada.produit.entities.produit;
import com.ghada.produit.repos.produitRepository;

@Service
public class produitservicempl implements produitservice {

    private final produitRepository produitRepository;

    public produitservicempl(produitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public produit saveProduit(produit p) {
        return produitRepository.save(p);
    }

    @Override
    public produit updateProduit(produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public produit getproduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<produit> getAllproduits() {
        return produitRepository.findAll();
    }
}