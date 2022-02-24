package com.springMVC.dao;

import java.util.List;

import com.springMVC.model.Processor;



public interface ProcessorDao {
	
public void addProcessor(Processor processor);	
	
	public List <Processor> findAll();
	
	public void deleteProcessor(int id);
	
	public void updateProcessor(Processor processor);
	
	public Processor getEmpById(int id);    
	  
}
