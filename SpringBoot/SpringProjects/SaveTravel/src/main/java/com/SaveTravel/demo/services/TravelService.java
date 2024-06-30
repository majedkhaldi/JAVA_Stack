package com.SaveTravel.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SaveTravel.demo.models.Travel;
import com.SaveTravel.demo.repos.TravelRepo;

@Service
public class TravelService {

	private final TravelRepo travelrepo;
	 public TravelService(TravelRepo travelrepo) {
	     this.travelrepo = (TravelRepo) travelrepo;
	 }
	 
	 public Travel addtrip(Travel travel) {
		 return travelrepo.save(travel);
	 }
	 
	 public List<Travel> showAllActivities(){
		 return travelrepo.findAll();
	 }
	 
	 public Travel findTravel(Long id) {
	        Optional<Travel> optionalt = travelrepo.findById(id);
	        if(optionalt.isPresent()) {
	            return optionalt.get();
	        } else {
	            return null;
	        }
	    }
    public Travel updateTravel(Travel travel) {
        return travelrepo.save(travel);

    }
    
    public void deleteExpense(Long id) {
    	travelrepo.deleteById(id);
    }
}
