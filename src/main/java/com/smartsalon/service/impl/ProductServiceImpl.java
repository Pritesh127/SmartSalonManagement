package com.smartsalon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartsalon.entity.ProductEntity;
import com.smartsalon.repository.ProductRepository;
import com.smartsalon.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<ProductEntity> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}

	@Override
	public ProductEntity getProductById(int productId) {
		
		return productRepository.findById(productId).get();
	}

	@Override
	public ProductEntity deleteProductById(int productId) {
		
		productRepository.deleteById(productId);
		
		return null;
	}

	@Override
	public ProductEntity updateProduct(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}

}
