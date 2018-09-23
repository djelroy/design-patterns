package com.djelroy.designpatterns.strategy;

import java.util.Arrays;

public class BubbleSort implements StrategySort {

	@Override
	public void sort(int[] numbers) {
		System.out.println("Bubble sort for: " + Arrays.toString(numbers));
		
		for(int j = numbers.length - 1; j >= 0; j--) {
			for(int i = 0; i < j; i++) {
				if(numbers[i] > numbers[i + 1]) {
					int tmp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}	
		
		System.out.println("Bubble sort result: " + Arrays.toString(numbers));

	}

}
