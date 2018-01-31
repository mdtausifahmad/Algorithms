package week2;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(GCD(145644928,432835788));

	}
	
	private static List<Integer> getFactors(int number){
		
		List<Integer> factors = new ArrayList<>();
		for(int i = 2;i <= number/2; i++){
			if(number % i == 0)
				factors.add(i);
		}
		factors.add(number);
		//System.out.println(number +" Factor: "+ Arrays.toString(factors.toArray()));
		return factors;
	}
	
	private static int GCD(int firstNumber, int secondNumber){
		
		int gcd = 1;
		List<Integer> firstNumberFactor = getFactors(firstNumber);
		List<Integer> secondNumberFactor = getFactors(secondNumber);
		
		
		if(firstNumberFactor.size() < secondNumberFactor.size()){
			for (int i = 0; i < firstNumberFactor.size(); i++) {
				for(int j = 0; j < secondNumberFactor.size(); j++){
					if(firstNumberFactor.get(i) == secondNumberFactor.get(j))
						gcd = firstNumberFactor.get(i);
				}
			}
		}
		else{
			for (int i = 0; i < secondNumberFactor.size(); i++) {
				for(int j = 0; j < firstNumberFactor.size(); j++){
					if(secondNumberFactor.get(i) == firstNumberFactor.get(j))
						gcd = secondNumberFactor.get(i);
				}
			}
		}
		
		return gcd;
	}

}
