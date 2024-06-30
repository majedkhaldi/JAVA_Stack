package com.burgerTracker.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.burgerTracker.demo.models.Burger;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Long>{
	List<Burger> findAll();
}
