package com.DojosAndNinjas.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DojosAndNinjas.demo.models.Dojo;
import com.DojosAndNinjas.demo.models.Ninja;


@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
