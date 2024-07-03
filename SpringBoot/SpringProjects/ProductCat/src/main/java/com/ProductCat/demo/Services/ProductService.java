package com.ProductCat.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductCat.demo.Repos.ProductRepo;
import com.ProductCat.demo.models.Category;
import com.ProductCat.demo.models.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepo prorepo;
	
	public List<Product> findAllProducts(){
		return prorepo.findAll();
	}
	
	public Product findProductById(Long id) {
		Optional<Product> potential = prorepo.findById(id);
		if(potential.isPresent()) {
			return potential.get();
		}
		return null;
	}
	
	public Product createProduct(Product product) {
		return prorepo.save(product);
	}
	
	public Product addCategoriesToProduct(Product product, Category category) {
		List<Category> thisproductcats = product.getCategories();
		thisproductcats.add(category);
		return prorepo.save(product);
	}
	public List<Product> findByCategories(Category cat){
		return prorepo.findAllByCategories(cat);
	}
	public List<Product> findByCategoriesNotContains(Category cat){
		return prorepo.findByCategoriesNotContains(cat);
	}
}
