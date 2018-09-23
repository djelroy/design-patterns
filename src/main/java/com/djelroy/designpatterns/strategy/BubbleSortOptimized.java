package com.djelroy.designpatterns.strategy;

import java.util.Arrays;

public class BubbleSortOptimized implements StrategySort{

	@Override
	public void sort(int[] numbers) {
	System.out.println("Bubble sort for: " + Arrays.toString(numbers));
		
		for(int j = numbers.length - 1; j >= 0; j--) {
			
			boolean swapped = false;
			for(int i = 0; i < j; i++) {
				if(numbers[i] > numbers[i + 1]) {
					int tmp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = tmp;
					swapped = true;
				}
			}
			
			// if no adjacent elements have been swapped, the array is already ordered
			if(!swapped) {
				break;
			}
		}	
		
		System.out.println("Bubble sort result: " + Arrays.toString(numbers));

		
	}

}
