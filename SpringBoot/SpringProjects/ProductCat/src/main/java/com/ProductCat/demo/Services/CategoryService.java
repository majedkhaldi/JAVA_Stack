package com.ProductCat.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductCat.demo.Repos.CategoryRepo;
import com.ProductCat.demo.models.Category;
import com.ProductCat.demo.models.Product;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo catrepo;
	
	public List<Category> findAllCategories(){
		return catrepo.findAll();
	}
	
	public Category findCategoryById(Long id) {
		Optional<Category> potential = catrepo.findById(id);
		if(potential.isPresent()) {
			return potential.get();
		}
		return null;
	}
	
	public Category createCategory(Category cat) {
		return catrepo.save(cat);
	}
	
	public List<Category> findAllByProducts(Product product){
		return catrepo.findAllByProducts(product);
	}
	public List<Category> findByProductsNotContains(Product product){
		return catrepo.findByProductsNotContains(product);
	}
}
