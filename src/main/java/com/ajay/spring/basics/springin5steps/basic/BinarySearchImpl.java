package com.ajay.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

//temp comment to check if git is working eh

// create a seperate branch1
import org.springframework.stereotype.Component;

import net.bytebuddy.asm.Advice.This;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm; 
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm ) {
//		super(); 
//		this.sortAlgorithm = sortAlgorithm; 
//	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Implement sorting logic on numbers 
		// search the sorted array 
		// return the index of the result 
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers); 
		System.out.println(sortAlgorithm);
		
		return 3; // temporary number 
		
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
		
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}


	

}
