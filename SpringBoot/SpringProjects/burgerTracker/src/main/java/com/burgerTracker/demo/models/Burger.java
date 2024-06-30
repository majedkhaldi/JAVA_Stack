package com.burgerTracker.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull 
	    @Size(min = 1, message= "Burger Name should not be left blank")
	    private String bname;
	    @NotNull (message = "Restaurant Name should not be left blank")
	    @Size(min = 1, message= "Restaurant Name should not be left blank")
	    private String rname;
	    @NotNull 
	    @Size(min = 1, message= "Notes should not be left blank")
	    private String notes;
	    @NotNull (message = "Rating should not be left blank")
	    @Min(value = 1, message = "Rating should not be greater than 0")
	    @Max(value = 5, message = "Rating should be maximum of 5")
	    private Integer rating;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burger() {
	    }
	    public Burger(String bname, String rname, String notes, int rating) {
	        this.bname = bname;
	        this.rname = rname;
	        this.notes = notes;
	        this.rating = rating;
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public Integer getRating() {
			return rating;
		}
		public void setRating(Integer rating) {
			this.rating = rating;
		}
	    
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
