package com.ghada.produit;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghada.produit.entities.produit;
import com.ghada.produit.repos.produitRepository;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private produitRepository produitRepository;

    @Test
    public void testCreateProduit() {
        produit p = new produit("PC Dell3", 2200.500, new Date());
        produitRepository.save(p);
    }

    @Test
    public void testFindProduitByNom() {
        produit p = produitRepository.findByNomProduit("PC Dell3");
        System.out.println(p);
    }

    @Test
    public void testFindAllProduits() {
        List<produit> produits = produitRepository.findAll();
        for (produit p : produits) {
            System.out.println(p);
        }
    }

    @Test
    public void testFindProduitsByNomContains() {
        List<produit> produits = produitRepository.findByNomProduitContains("P");
        for (produit p : produits) {
            System.out.println(p);
        }
    }

    @Test
    public void testUpdateProduit() {
        produit p = produitRepository.findAll().get(0);
        p.setPrixProduit(2000.0);
        produitRepository.save(p);
    }

    @Test
    public void testDeleteProduit() {
        produit p = produitRepository.findAll().get(0);
        produitRepository.deleteById(p.getIdProduit());
    }
}