package com.springMVC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springMVC.model.Laptop;


@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 
@Qualifier("processordao") //qualifier mentions that if we have same name of id to avoid 
//the conflict of same names we use @Qualifier
public class LaptopDaoImpl implements LaptopDao{
	
	@Autowired 
	JdbcTemplate jdbcTemplate;

	@Override
	public void addLaptop(Laptop laptop) {
		jdbcTemplate.update("insert into laptop(serialNo,processorId,graphicCard,ram,company,price) values("+laptop. getSerialNo()+","+laptop.getProcessorId()+",'"+laptop.getGraphicCard()+"','"+laptop.getRam()+"','"+laptop.getCompany()+"','"+laptop.getPrice()+"')");
		
	}

	@Override
	public List<Laptop> findAll() {
		return jdbcTemplate.query("select * from laptop",new RowMapper<Laptop>(){    
	        public Laptop mapRow(ResultSet rs, int row) throws SQLException {    
	            Laptop e=new Laptop();    
	            e.setSerialNo(rs.getInt("serialNo"));    
	            e.setProcessorId(rs.getInt("processorId"));  
	            e.setGraphicCard(rs.getString("graphicCard"));    
	            e.setRam(rs.getString("ram"));   
	            e.setCompany(rs.getString("company"));  
	            e.setPrice(rs.getString("price"));
	                
	            return e;    
	        }				    
	    });  
	}

	@Override
	public void deleteLaptop(int serialNo) {
		String sql="delete from laptop where serialNo=?";    
	    jdbcTemplate.update(sql,serialNo);
	}

	@Override
	public void updateLaptop(Laptop laptop) {
		jdbcTemplate.update("update laptop set processorId="+laptop.getProcessorId()+", graphicCard='"+laptop.getGraphicCard()+"', ram='"+laptop.getRam()+"', company='"+laptop.getCompany()+"',price='"+laptop.getPrice()+"' where serialNo="+laptop.getSerialNo()+"");    
	}

	@Override
	public Laptop getLapById(int serialNo) {
		 String sql="select * from laptop where serialNo=?";    
		    return jdbcTemplate.queryForObject(sql, new Object[]{serialNo},new BeanPropertyRowMapper<Laptop>(Laptop.class));    
		
	} 

}
