package week2;

public class FibonacchiNaive {

	public static void main(String[] args) {
		System.out.println(fibonacchi(50));

	}
	
	private static long fibonacchi(int n){
		if(n <= 1)
			return n;
		else
			return fibonacchi(n-1)+fibonacchi(n-2);
	}

}
