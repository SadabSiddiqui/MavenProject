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

import com.springMVC.model.Processor;
import com.springMVC.service.ProcessorService;


@Controller
@RequestMapping(value="/")
public class ProcessorController {
	
	@Autowired    
    ProcessorService processorService;
	
	@RequestMapping(value = "/processor", method = RequestMethod.GET) 
	public ModelAndView showProcessorForm() { 
		Processor processor = new Processor(); 
	// Add the command object to the modelview 
		ModelAndView mv = new ModelAndView("processor"); 
		mv.addObject("processor", processor); 
	return mv; } 
	
	@RequestMapping(value = "/processor", method = RequestMethod.POST) 
    public String save(@ModelAttribute("processor") Processor processor){    
        processorService.addProcessor(processor); 
		return "redirect:/viewprocessor"; 
	} 
	
	@RequestMapping(value="/viewprocessor")
	public ModelAndView listContact(ModelAndView model) throws IOException{
	    List<Processor> listContact = processorService.findAll();
	    model.addObject("listContact", listContact);
	    
	    return model;
}
	@RequestMapping(value="/deleteprocessor/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
		processorService.deleteProcessor(id);    
        return "redirect:/viewprocessor";    
    } 
	
	 @RequestMapping(value="/editpro/{id}",method = RequestMethod.GET)    
	    public ModelAndView edit(@PathVariable int id, Model m){    
	        Processor processor=processorService.getEmpById(id);    
//	        m.addAttribute("command",processor);  
//	        return "editprocessor";    
	        ModelAndView model = new ModelAndView("editprocessor");
	        model.addObject("processor", processor);
	        return model;
	    } 
	
	 @RequestMapping(value="/editprocessor",method = RequestMethod.POST)    
	    public String editprocessor(@ModelAttribute("processor") Processor processor){    
	       processorService.updateProcessor(processor);    
	        return "redirect:/viewprocessor";    
	    }  

}
