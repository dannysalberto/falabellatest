package com.falabella.cl.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falabella.cl.global.Constantes;
import com.falabella.cl.models.Products;
import com.falabella.cl.models.ProductsRequest;
import com.falabella.cl.service.ProductsServicesJPA;


@RestController
@RequestMapping(value="/products")
@CrossOrigin(origins="*")
public class RestProducts {
	
	@Autowired
	ProductsServicesJPA serviceProducts;
	
	@GetMapping
	public ResponseEntity<?> listarGlobal() {
		List<Products> lista = null;
		lista = serviceProducts.listarProductos();
		if (!lista.isEmpty()) {
			return new ResponseEntity<List<Products>>(lista , HttpStatus.OK);
			
		}else {
			return new ResponseEntity<String>(Constantes.NO_EXISTE, HttpStatus.NOT_FOUND);
		}		
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Products objRequest) {
		serviceProducts.guardar(objRequest);
		return new ResponseEntity<String>(Constantes.NO_CONCLUIDO, HttpStatus.NOT_FOUND);
		
		
	}

}
