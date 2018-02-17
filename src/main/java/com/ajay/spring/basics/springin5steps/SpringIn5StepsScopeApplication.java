package com.ajay.spring.basics.springin5steps;
//modified from wl

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ajay.spring.basics.componentscan.ComponentDAO;
import com.ajay.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.ajay.spring.basics.springin5steps.scope.PersonDAO;


import org.slf4j.Logger;
@SpringBootApplication
@ComponentScan("com.ajay.spring.basics.componentscan")
public class SpringIn5StepsScopeApplication {
	
	
	// ------ what does spring require for dependency injection ------------------
	//What are beans ?:  add an annotation @Component on any classes that are beans 
	//What are the dependencies for a bean : Add @Autowired on the dependencies of the bean 
	//Where to search for beans? the bubblesortAlgorithm and binarysearchimpl are in the same package. so use component search in the package. 
	//@Springbootapplication searches automatically searches the package and subpackages 
	// ---------------------------------------------------------------------------
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 
	

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm()); 
		
		//binarySearch.binarySearch(new int [] {2,  5, 1}, 3); 
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		ComponentDAO personDAO = applicationContext.getBean(ComponentDAO.class); 
		ComponentDAO personDAO2 = applicationContext.getBean(ComponentDAO.class); 
		
		LOGGER.info("{}",personDAO);; 
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());

	}
}
