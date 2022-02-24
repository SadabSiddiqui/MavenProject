package com.springMVC.service;

import java.util.List;

import com.springMVC.model.Processor;

public interface ProcessorService {
	
public void addProcessor(Processor processor);	
	
	public List <Processor> findAll();
	
	public void deleteProcessor(int id);
	
	public void updateProcessor(Processor processor);
	
	public Processor getEmpById(int id);    
	  

}
