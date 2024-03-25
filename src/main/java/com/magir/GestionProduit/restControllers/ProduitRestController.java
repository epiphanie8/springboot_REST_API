package com.magir.GestionProduit.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magir.GestionProduit.entity.Produit;
import com.magir.GestionProduit.service.ProduitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("/AllProduits")
	public List<Produit> getAllProduit(){
		
		return produitService.getAllProduit();	
	}
	
	@GetMapping("/produits/{id}")
	public Produit getProduit(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	}
	
	@PostMapping("/saveProduit")
	public Produit  saveProduit(@RequestBody Produit produit)
	{
		return produitService.saveProduit(produit);
		
	}
	
	@PutMapping("/updateProduit")
	public Produit updateProduit(@RequestBody Produit produit) {
	return produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/deleteProduit/{id}")
	public String deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduitById(id);
		return "Produit avec Id "+id+" a été supprimé avec succès";
			
	}

}
