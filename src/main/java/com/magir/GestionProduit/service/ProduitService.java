package com.magir.GestionProduit.service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.magir.GestionProduit.entity.Produit;


public interface ProduitService {
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	List<Produit> getAllProduit();
	Produit getProduit(Long id);
	
	 
}

