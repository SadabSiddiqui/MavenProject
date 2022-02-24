package com.springMVC.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.model.Laptop;
import com.springMVC.service.LaptopService;



@Controller
@RequestMapping(value="/")
public class LaptopController {
	
	@Autowired    
   LaptopService laptopService;
	
	@RequestMapping(value = "/laptop", method = RequestMethod.GET) 
	public ModelAndView showLaptopForm() { 
		Laptop laptop = new Laptop(); 
	// Add the command object to the modelview 
		ModelAndView mv = new ModelAndView("laptop"); 
		mv.addObject("laptop", laptop); 
	return mv; } 
	
	@RequestMapping(value = "/laptop", method = RequestMethod.POST) 
    public String save(@ModelAttribute("laptop") Laptop laptop){    
        laptopService.addLaptop(laptop); 
		return "redirect:/viewlaptop"; 
	} 
	
	@RequestMapping(value="/viewlaptop")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Laptop> listContact = laptopService.findAll();
	    model.addObject("listContact", listContact);
	    
	    return model;
}
	@RequestMapping(value="/deletelaptop/{serialNo}",method = RequestMethod.GET)    
    public String delete(@PathVariable int serialNo){    
		laptopService.deleteLaptop(serialNo);    
        return "redirect:/viewlaptop";    
    } 
	
	 @RequestMapping(value="/editlap/{id}",method = RequestMethod.GET)    
	    public ModelAndView edit(@PathVariable int id, Model m){    
	        Laptop laptop=laptopService.getLapById(id);    
   
	        ModelAndView model = new ModelAndView("editlaptop");
	        model.addObject("laptop", laptop);
	        return model;
	    } 
	
	 @RequestMapping(value="/editlaptop",method = RequestMethod.POST)    
	    public String editlaptop(@ModelAttribute("laptop") Laptop laptop){    
	       laptopService.updateLaptop(laptop);    
	        return "redirect:/viewlaptop";    
	    }  


}
