package com.ajay.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	
	// ------ what does spring require for dependency injection ------------------
	//What are beans ?:  add an annotation @Component on any classes that are beans 
	//What are the dependencies for a bean : Add @Autowired on the dependencies of the bean 
	//Where to search for beans? the bubblesortAlgorithm and binarysearchimpl are in the same package. so use component search in the package. 
	//@Springbootapplication searches automatically searches the package and subpackages 
	// ---------------------------------------------------------------------------

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm()); 
		
		//binarySearch.binarySearch(new int [] {2,  5, 1}, 3); 
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); 
		
		int result = binarySearch.binarySearch(new int[] {12,8,14},2); 
		System.out.println(result);
	}
}
