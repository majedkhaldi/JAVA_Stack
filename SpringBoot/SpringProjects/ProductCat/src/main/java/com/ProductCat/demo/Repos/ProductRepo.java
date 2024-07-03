package com.ProductCat.demo.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ProductCat.demo.models.Category;
import com.ProductCat.demo.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {

	List<Product> findAll();
	List<Product> findAllByCategories(Category category);
	List<Product> findByCategoriesNotContains(Category category);
}
