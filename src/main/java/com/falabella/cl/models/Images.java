package com.falabella.cl.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name="images")
@ApiModel("ImagenRequest DTO-REQUEST (Objeto para el request de una imagen)")
public class Images {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
    private Products product;
	
    private String ulr_image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public String getUlr_image() {
		return ulr_image;
	}

	public void setUlr_image(String ulr_image) {
		this.ulr_image = ulr_image;
	}

	@Override
	public String toString() {
		return "Images [id=" + id + ", product=" + product + ", ulr_image=" + ulr_image + "]";
	}
	
    

}
