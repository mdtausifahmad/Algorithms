package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StressTestMaxPairWiseProduct {

	static long getMaxPairwiseProduct(int[] numbers) {
		long result = 0;
		int n = numbers.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (numbers[i] * numbers[j] > result) {
					result = numbers[i] * numbers[j];
				}
			}
		}
		return result;
	}

	static long getMaxPairwiseProductFast(int[] numbers) {

		int highestNoIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (highestNoIndex == -1 || numbers[i] > numbers[highestNoIndex])
				highestNoIndex = i;
		}

		int secondHighestNoIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (i != highestNoIndex
					&& (secondHighestNoIndex == -1 || numbers[i] > numbers[secondHighestNoIndex]))
				secondHighestNoIndex = i;
		}
		return numbers[highestNoIndex] * numbers[secondHighestNoIndex];
	}

	public static void main(String[] args) {
		
		while (true) {
		    int n = (int)(Math.random() * 10) + 2;
		    System.out.println("Size Of Array: " + n);
		    int[] arr = new int[n];
		    for (int i = 0; i < n; ++i) {
		    	arr[i] = (int)(Math.random() * 1000);
		    }
		    for (int i = 0; i < n; ++i) {
		      System.out.print(arr[i]+ " ");
		    }
		    System.out.println();
		    long res1 = StressTestMaxPairWiseProduct.getMaxPairwiseProduct(arr);
		    long res2 = StressTestMaxPairWiseProduct.getMaxPairwiseProductFast(arr);
		    if (res1 != res2) {
		      System.out.println("Wrong Answer "+ res1 + " "+ res2);
		      break;
		    }
		    else {
		      System.out.println("OK");
		    }
		  }
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

}
