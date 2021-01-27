package com.falabella.cl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.falabella.cl.models.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

	
	
}
