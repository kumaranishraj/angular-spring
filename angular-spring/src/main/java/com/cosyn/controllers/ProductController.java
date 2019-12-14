package com.cosyn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cosyn.model.Product;
import com.cosyn.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	private List<Product> products;
	 @GetMapping("/product")
	    public List<Product> getAllProducts() {
		 products = productRepository.findAll();
		 System.out.println(products);
		 return products;
	    }
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		System.out.println(product);
		return productRepository.save(product);
	}
	@DeleteMapping(path = { "/{id}" })
	public Product delete(@PathVariable("id") int id) {
		Product deletedProduct = null;
		System.out.println(id+"..."+deletedProduct);
		for (Product prod : products) {
			if (prod.getId()==id) {
				products.remove(prod);
				deletedProduct = prod;
				break;
			}
		}
		return deletedProduct;
	}
}
