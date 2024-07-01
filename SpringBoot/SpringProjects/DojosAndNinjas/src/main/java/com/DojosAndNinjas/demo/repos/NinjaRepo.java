package com.DojosAndNinjas.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DojosAndNinjas.demo.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
//	List<Ninja> findAll();
}

