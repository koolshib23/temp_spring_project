package com.ajay.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;

//temp comment to check if git is working eh

// create a seperate branch1
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm; 
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm ) {
		super(); 
		this.sortAlgorithm = sortAlgorithm; 
	}
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//Implement sorting logic on numbers 
		// search the sorted array 
		// return the index of the result 
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers); 
		System.out.println(sortAlgorithm);
		
		return 3; // temporary number 
		
	}
	

}
