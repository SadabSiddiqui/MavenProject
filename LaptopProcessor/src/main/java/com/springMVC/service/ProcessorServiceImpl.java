package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.ProcessorDao;
import com.springMVC.model.Processor;

@Service("processorservice")
public class ProcessorServiceImpl implements ProcessorService {
	
	@Autowired
	ProcessorDao processorDao;

	@Override
	public void addProcessor(Processor processor) {
		processorDao.addProcessor(processor);
		
	}

	@Override
	public List<Processor> findAll() {
		
		return processorDao.findAll();
	}

	@Override
	public void deleteProcessor(int id) {
		processorDao.deleteProcessor(id);
		
	}

	@Override
	public void updateProcessor(Processor processor) {
		processorDao.updateProcessor(processor);
		
	}

	@Override
	public Processor getEmpById(int id) {
		
		return processorDao.getEmpById(id);
	}

}
