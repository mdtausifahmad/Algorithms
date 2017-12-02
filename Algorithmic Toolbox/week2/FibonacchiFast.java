package week2;

import java.util.HashMap;

public class FibonacchiFast {
	
	static HashMap<Integer,Long> h = new HashMap<>();
	
	public static void main(String[] args) {
		h.put(0, 0l);
		h.put(1, 1l);
		System.out.println(fibonacchi(70));

	}
	
	private static long fibonacchi(int n){
	
		long first = 0l;
		long second = 0l;
		
		if(n <= 1)
			return  h.get(n);
		else{
			if(h.containsKey(n-1)){
				first = h.get(n-1);
			}else{
				first = fibonacchi(n-1);
				h.put(n-1, first);
			}
			
			if(h.containsKey(n-2)){
				second = h.get(n-2);
			}else{
				second = fibonacchi(n-2);
				h.put(n-2, second);
			}
			
			return first + second;
		}
			
	}

}
