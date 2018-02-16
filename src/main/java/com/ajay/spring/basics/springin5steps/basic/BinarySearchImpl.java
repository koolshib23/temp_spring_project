package com.ajay.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

//temp comment to check if git is working eh

// create a seperate branch1
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm; 
	
	
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


	

}
