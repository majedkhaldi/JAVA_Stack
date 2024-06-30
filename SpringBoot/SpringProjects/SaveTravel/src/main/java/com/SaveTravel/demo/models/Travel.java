package com.SaveTravel.demo.models;

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
@Table(name="Expenses")
public class Travel {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull 
	    @Size(min = 1, message= "Burger Name should not be left blank")
	    private String name;
	    @NotNull 
	    @Size(min = 1, message= "Restaurant Name should not be left blank")
	    private String vendor;
	    @NotNull 
	    @Size(min = 1, message= "Notes should not be left blank")
	    private String descriptionn;
	    @NotNull (message = "Rating should not be left blank")
	    @Min(value = 0, message = "Rating should not be less than 0")
	    private Double amount;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Travel() {
	    }
	    public Travel(String name, String vendor, String descriptionn, double amount) {
	        this.name = name;
	        this.vendor = vendor;
	        this.descriptionn = descriptionn;
	        this.amount = amount;
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	    
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVendor() {
			return vendor;
		}
		public void setVendor(String vendor) {
			this.vendor = vendor;
		}
		
		public String getDescriptionn() {
			return descriptionn;
		}
		public void setDescriptionn(String descriptionn) {
			this.descriptionn = descriptionn;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
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
