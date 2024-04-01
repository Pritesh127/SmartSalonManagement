package com.smartsalon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.smartsalon.entity.ProductEntity;
import com.smartsalon.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
//	get product start ********************************************************************
	@GetMapping("/product")
	public String product(Model model){
		model.addAttribute("productEntity", productService.getAllProducts());
		return "ProductTemplates/productPage";
	}
	
//	get product end ************************************************************************
	
	
//	 for inserting new product **************************************************************
	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		ProductEntity productEntity = new ProductEntity();
		model.addAttribute("productEntity",productEntity);
		return "ProductTemplates/addProduct";
	}
	
	// this mehtod will save data to the database
			@PostMapping("/product")
			public String addProduct(@ModelAttribute("productEntity") ProductEntity productEntity) {
				System.out.println("inside add category method ***************");
				System.out.println(productEntity);
//				entityProduct.setManufacturingDate(new Date());
				
				productService.saveProduct(productEntity);
				
//				return "categoryTemplate/categorypage";
				return "redirect:/product";
			}
//	inserting oproduct ends ****************************************************************************
			
			
//		edit product start  ********************************************
			
			// for updating we need to fetch category data from database so we create method in service to get data from id
			//	and than use that method in below method
			@GetMapping("/product/edit/{id}")
			public String editProduct(@PathVariable("id") int id,Model model ){
				
				System.out.println("inside edit method +**************");

//				System.out.println(id);
				model.addAttribute("productEntity", productService.getProductById(id));
				
				return "ProductTemplates/editProduct";
			}
			
			@PostMapping("/product/{id}")
			public String editProduct(@PathVariable("id") int id,@ModelAttribute("productEntity") ProductEntity productEntity) {
				ProductEntity product =productService.getProductById(id);
				
				product.setProductName(productEntity.getProductName());
				product.setProductCategory(productEntity.getProductCategory());
				product.setProductPrice(productEntity.getProductPrice());
				productService.updateProduct(product);
				return "redirect:/product";
			}
			
			
//			@GetMapping("/product/edit/{id}")
//			public String dummy() {
//				return "ProductTemplates/editProduct";
//			}
			
			
			
			@GetMapping("/deleteProduct/{id}")
			public String deleteProduct(@PathVariable int id) {
				
				productService.deleteProductById(id);
				return "redirect:/product";
				
			}
}
