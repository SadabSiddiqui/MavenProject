package com.springMVC.service;

import java.util.List;

import com.springMVC.model.Laptop;

public interface LaptopService {
	
public void addLaptop(Laptop laptop);	
	
	public List <Laptop> findAll();
	
	public void deleteLaptop(int serialNo);
	
	public void updateLaptop(Laptop laptop);
	
	public Laptop getLapById(int serialNo);    
	 

}
