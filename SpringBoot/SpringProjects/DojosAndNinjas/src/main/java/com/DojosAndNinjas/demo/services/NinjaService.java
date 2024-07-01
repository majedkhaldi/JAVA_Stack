package com.DojosAndNinjas.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojosAndNinjas.demo.models.Ninja;
import com.DojosAndNinjas.demo.repos.NinjaRepo;

@Service
public class NinjaService {

	@Autowired
	NinjaRepo ninjaRepo;
	
	public Ninja createNinja(Ninja ninja) {
		 return ninjaRepo.save(ninja);
	 }
}
