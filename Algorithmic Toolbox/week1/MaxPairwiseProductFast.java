package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MaxPairwiseProductFast {
	
	static int getMaxPairwiseProduct(int[] numbers) {
		
		int highestNoIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if(highestNoIndex == -1 || numbers[i] > numbers[highestNoIndex])
				highestNoIndex = i;
		}
		
		int secondHighestNoIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] != numbers[highestNoIndex] && (secondHighestNoIndex == -1 || numbers[i] > numbers[secondHighestNoIndex]))
				secondHighestNoIndex = i;
		}
        return numbers[highestNoIndex] * numbers[secondHighestNoIndex];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
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
