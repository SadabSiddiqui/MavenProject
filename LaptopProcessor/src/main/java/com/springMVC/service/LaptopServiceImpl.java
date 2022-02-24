package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springMVC.dao.LaptopDao;
import com.springMVC.model.Laptop;



@Service("laptopservice")
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	LaptopDao laptopDao;

	@Override
	public void addLaptop(Laptop laptop) {
		laptopDao.addLaptop(laptop);
		
	}

	@Override
	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		return laptopDao.findAll();
	}

	@Override
	public void deleteLaptop(int serialNo) {
		laptopDao.deleteLaptop(serialNo);
		
	}

	@Override
	public void updateLaptop(Laptop laptop) {
		laptopDao.updateLaptop(laptop);
		
	}

	@Override
	public Laptop getLapById(int serialNo) {
		// TODO Auto-generated method stub
		return laptopDao.getLapById(serialNo);
	}

}
