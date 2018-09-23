package com.djelroy.designpatterns.strategy;

public class ArraySorter {

	private final StrategySort sorter;

	public ArraySorter(StrategySort sorter) {
		this.sorter = sorter;
	}
	
	public void sort(int[] numbers) {
		long startTime, endTime = 0L;

		startTime = System.nanoTime();
		sorter.sort(numbers);
		endTime = System.nanoTime();
		
		System.out.println(String.format("It took %,3d ns to sort with %s", endTime - startTime, sorter.getClass().getSimpleName()));
	}
}
