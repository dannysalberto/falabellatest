package com.falabella.cl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.falabella.cl.models.Images;


@Repository
public interface ImagesRepository extends JpaRepository<Images, Integer> {

	
	List<Images> findByProduct(Integer idProduct);
	
}
