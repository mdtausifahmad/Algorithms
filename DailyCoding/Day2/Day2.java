package com.tausif;

import java.util.ArrayList;
import java.util.List;

public class Day2 {
	
	public static void main(String[] args) {
		
		List<Integer> numbs = List.of(3, 2, 1);
		
		System.out.println(newArray(numbs));
		
	
	}
	
	public static List<Integer> newArray(List<Integer> array) {
		
		List<Integer> newArray = new ArrayList<>(array.size());
		
		for (int i = 0; i < array.size(); i++) {
		    int value = array.get(i);
			newArray.add(array.stream().filter( num -> num != value ).reduce(1, (num1,num2) -> num1 * num2 ) );
		}
		
		return newArray;
	}

}
