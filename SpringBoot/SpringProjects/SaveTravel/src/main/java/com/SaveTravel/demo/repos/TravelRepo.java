package com.SaveTravel.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SaveTravel.demo.models.Travel;

@Repository
public interface TravelRepo extends CrudRepository<Travel, Long>{
	List<Travel> findAll();
}
