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

import com.springMVC.model.Processor;

@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 
@Qualifier("processordao") //qualifier mentions that if we have same name of id to avoid 
//the conflict of same names we use @Qualifier 
public class ProcessorDaoImpl implements ProcessorDao{
	
	@Autowired 
	JdbcTemplate jdbcTemplate; 

	@Override
	public void addProcessor(Processor processor) {
		jdbcTemplate.update("insert into processor(id,generation,company,core) values("+processor. getId()+",'"+processor. getGeneration()+"','"+processor. getCompany()+"','"+processor. getCore()+"')");
	}

	@Override
	public List<Processor> findAll() {
		return jdbcTemplate.query("select * from processor",new RowMapper<Processor>(){    
	        public Processor mapRow(ResultSet rs, int row) throws SQLException {    
	            Processor e=new Processor();    
	            e.setId(rs.getInt("id"));    
	            e.setGeneration(rs.getString("generation"));    
	            e.setCompany(rs.getString("company"));   
	            e.setCore(rs.getString("core"));  
	                
	            return e;    
	        }				    
	    });  
		
	}

	@Override
	public void deleteProcessor(int id) {
		String sql="delete from processor where id=?";    
	    jdbcTemplate.update(sql,id);
		
	}

	@Override
	public void updateProcessor(Processor processor) {
		jdbcTemplate.update("update processor set generation='"+processor.getGeneration()+"', company='"+processor.getCompany()+"',core='"+processor.getCore()+"' where id="+processor.getId()+"");    
	     
		
	}

	@Override
	public Processor getEmpById(int id){    
	    String sql="select * from processor where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Processor>(Processor.class));    
	}

}
