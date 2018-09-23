package com.djelroy.designpatterns.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		// 1st strategy
		ArraySorter sorter = new ArraySorter(new BubbleSort());
		// 2nd strategy
		ArraySorter sorterOptimized = new ArraySorter(new BubbleSortOptimized());
		
		sorter.sort(new int[] {45, 1, 2, 3, 7, 5, 4, 6, 0, 111, 122, 4555});
		newLine();
		
		sorterOptimized.sort(new int[] {45, 1, 2, 3, 7, 5, 4, 6, 0, 111, 122, 4555});
		newLine();
		
		sorter.sort(generateAsc(1_000));
		newLine();
		
		sorterOptimized.sort(generateAsc(1_000));		
		newLine();
		
		sorter.sort(generateDesc(20));		
		newLine();
		
		sorterOptimized.sort(generateDesc(20));
		newLine();
	}

	public static int[] generateAsc(int n) {
		int[] numbers = new int[n];

		for(int i = 1; i <= n; i++) {
			numbers[i - 1] = i;
		}
		
		return numbers;
	}
	
	
	public static int[] generateDesc(int n) {
		int[] numbers = new int[n];
		
		for(int i = n; i >= 1; i--) {
			numbers[n - i] = i;
		}
		
		return numbers;
	}
	
	static void newLine() {
		System.out.println();
	}
}
