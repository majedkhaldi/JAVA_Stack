package com.DojosAndNinjas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DojosAndNinjas.demo.models.Dojo;
import com.DojosAndNinjas.demo.models.Ninja;
import com.DojosAndNinjas.demo.repos.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	DojoRepo dojoRepo;
	
	public Dojo createDojo(Dojo dojo) {
		 return dojoRepo.save(dojo);
	 }
	
	public List<Dojo> findAllDojos(){
		return dojoRepo.findAll();
	}

	public Dojo findById(Long dojoId) {
		 Optional<Dojo> optionalt = dojoRepo.findById(dojoId);
	        if(optionalt.isPresent()) {
	            return optionalt.get();
	        } else {
	            return null;
	        }	
	        }
}
