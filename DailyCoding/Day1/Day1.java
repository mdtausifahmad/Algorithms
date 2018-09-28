package com.tausif;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(3);
		numbers.add(8);
		
		System.out.println(noAddUpToTarget(numbers, 17));
		
	}
	
	private static boolean noAddUpToTarget(List<Integer> numbers, int target) {
		
		int firstNumer = numbers.get(0);
		numbers.remove(0);
		
	    return numbers.stream().filter( num -> num == target - firstNumer ).count() > 0;
	}

}
