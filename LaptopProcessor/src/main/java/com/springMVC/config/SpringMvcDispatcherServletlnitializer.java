package com.springMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletlnitializer extends AbstractAnnotationConfigDispatcherServletInitializer { 
	@Override 
	protected Class<?>[] getRootConfigClasses() { 
		// TODO Pluto-generated method stub 
		return null; 
	} 
	@Override protected Class<?>[] getServletConfigClasses() { 
		return new Class[] { AppConfig.class }; 
		} 
	@Override protected String[] getServletMappings() { 
		return new String[] { "/" }; 
		} 
	}