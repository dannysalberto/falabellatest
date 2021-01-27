package com.falabella.cl.interfaces;

import java.util.List;

import com.falabella.cl.models.Products;


public interface IProducts {

	List<Products> listarProductos();
	void guardar(Products product);
	
}
