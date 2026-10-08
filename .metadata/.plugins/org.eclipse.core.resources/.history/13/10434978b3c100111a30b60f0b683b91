package com.ghada.produit;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghada.produit.entities.produit;
import com.ghada.produit.repos.produitRepository;

@SpringBootTest
class ProduitApplicationTests {

	@Autowired
	private produitRepository produitRepo;

	@Test
	public void testCreateProduit() {
		produit prod = new produit("PC Dell", 2200.500, new Date());
		produitRepo.save(prod);
	}
}