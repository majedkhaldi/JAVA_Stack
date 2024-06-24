package com.fruits.demo.models;

public class Item {
	    // MEMBER VARIABLES
	    private String name;
	    private double price;
	    // CONSTRUCTOR
	    public Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    public void setName(String name){
	        this.name =name;
	    }
	    public void setPrice(double price){
	        this.price =price;
	    }
	    public double getPrice(){
	        return this.price;
	    }

	    public String getName(){
	        return this.name;
	    }
	}


