package com.xworkz.musicAndFood.configuartion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguartion extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling  getServletConfigClasses");
		return new Class[] {SpringConfiguartion.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling  getServletMappings");
		return new String[] {"*.do"};
	}

}
