package com.ProductCat.demo.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ProductCat.demo.models.Category;
import com.ProductCat.demo.models.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {

	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
	List<Category> findAllByProducts(Product product);
}
