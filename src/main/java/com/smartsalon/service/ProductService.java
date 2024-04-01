package com.smartsalon.service;

import java.util.List;

import com.smartsalon.entity.ProductEntity;

public interface ProductService {

	List<ProductEntity> getAllProducts();
	
	ProductEntity saveProduct(ProductEntity productEntity);
	
	ProductEntity getProductById(int productId);
	
	ProductEntity updateProduct(ProductEntity productEntity);
	ProductEntity deleteProductById(int productId);
}
