package com.burgerTracker.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.burgerTracker.demo.models.Burger;
import com.burgerTracker.demo.repos.BurgerRepo;
@Service
public class BurgerServices {

	private final BurgerRepo burgerRepo;
	 public BurgerServices(BurgerRepo burgerRepo) {
	     this.burgerRepo = (BurgerRepo) burgerRepo;
	 }
	 
	 public Burger addburger(Burger burger) {
		 return burgerRepo.save(burger);
	 }
	 
	 public List<Burger> showAllBurgers(){
		 return burgerRepo.findAll();
	 }
	 
	 public Burger findBurger(Long id) {
	        Optional<Burger> optionalBurger = burgerRepo.findById(id);
	        if(optionalBurger.isPresent()) {
	            return optionalBurger.get();
	        } else {
	            return null;
	        }
	    }
    public Burger updateBurger(Burger burger) {
        return burgerRepo.save(burger);

    }
}
