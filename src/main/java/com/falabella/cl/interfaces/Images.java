package com.falabella.cl.interfaces;

import java.util.List;

public interface Images {

	List<Images> listarImagesPorProducto();
	void guardar(Images image);
	
}
