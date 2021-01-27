package com.falabella.cl.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel("Objeto para el request de un producto")
public class ProductsRequest {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", columnDefinition="INT NOT NULL")
	private Integer id;
	
	@NotNull
	@Min(value = 1000000)
	@Max(value = 99999999)
	private String sku;
	
	@NotNull
	@NotBlank
	@Min(value = 1000000)
	@Max(value = 99999999)
	private String name;
	
	@NotNull
	@Min(value = 1000000)
	@Max(value = 99999999)
	private String brand;
	
	@NotNull
	private String size ;
	
	@Min(value = 1000000)
	@Max(value = 99999999)
	private BigDecimal price;
	
	@NotNull
	private String image_first;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImage_first() {
		return image_first;
	}

	public void setImage_first(String image_first) {
		this.image_first = image_first;
	}

	@Override
	public String toString() {
		return "ProductsRequest [id=" + id + ", sku=" + sku + ", name=" + name + ", brand=" + brand + ", size=" + size
				+ ", price=" + price + ", image_first=" + image_first + "]";
	}

	
	
	
	
	
	
}
