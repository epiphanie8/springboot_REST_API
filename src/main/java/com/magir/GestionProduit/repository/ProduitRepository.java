package com.magir.GestionProduit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magir.GestionProduit.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
