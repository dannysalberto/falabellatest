package com.falabella.cl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.cl.interfaces.IProducts;
import com.falabella.cl.models.Products;
import com.falabella.cl.repository.ProductsRepository;

@Service
public class ProductsServicesJPA implements IProducts{

	@Autowired
	ProductsRepository repo;

	@Override
	public List<Products> listarProductos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void guardar(Products product) {
		// TODO Auto-generated method stub
		repo.save(product);
		
	}

	
}
