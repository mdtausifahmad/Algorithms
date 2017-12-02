package week2;

import java.util.ArrayList;
import java.util.List;

public class FibonacchiFastWithArray {

	public static void main(String[] args) {
		System.out.println(fibonacchi(70));

	}
	
	private static long fibonacchi(int n){
		
		List<Long> fibonacchiSeries = new ArrayList<>();
		fibonacchiSeries.add(0l);
		fibonacchiSeries.add(1l);
		
		for(int i = 2; i <= n; i++){
			fibonacchiSeries.add(i, fibonacchiSeries.get(i-1) + fibonacchiSeries.get(i-2));
		}
		
		return fibonacchiSeries.get(n);
			
	}

}
