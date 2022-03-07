package com.ryan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.ryan.entity.Products;
import com.ryan.service.ProductService;

@RestController
public class ProductsResource {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/products/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Products returnProductById(@PathVariable("id") long id) {
		return productService.getProductFromId(id);
	}
	
	@PutMapping(path = "/products/{id}/{price}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Products updateProductPrice(@PathVariable("id") long id, @PathVariable("price") double price) {
		return productService.updateProductPriceFromId(id, price);
	}
	

}
