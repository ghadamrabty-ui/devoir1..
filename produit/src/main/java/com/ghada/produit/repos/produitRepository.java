package com.ghada.produit.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghada.produit.entities.produit;

public interface produitRepository extends JpaRepository<produit, Long> {

    produit findByNomProduit(String nom);

    List<produit> findByNomProduitContains(String nom);
}