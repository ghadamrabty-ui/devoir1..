package com.ghada.produit.service;

import java.util.List;

import com.ghada.produit.entities.produit;

public interface produitservice {

    produit saveProduit(produit p);

    produit updateProduit(produit p);

    void deleteProduit(produit p);

    void deleteProduitById(Long id);

    produit getproduit(Long id);

    List<produit> getAllproduits();
}