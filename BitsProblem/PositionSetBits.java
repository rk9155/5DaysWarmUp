package BitsProblem;

import java.util.Scanner;

public class PositionSetBits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input[] = null;
	    int ans[] = null;
		int n = 0;
	    n = s.nextInt();
		
		ans = new int[n];
		input = new int[n];
		for(int j = 0;j<n;j++) {

		input[j] = s.nextInt();
		ans[j]= Positon(input[j]);
		
		}
		for(int k =0;k<n;k++) {
		System.out.println(ans[k]);
		
		}
	}

	static boolean EvenOdd(int n) {
		
		return n > 0 && ((n & (n - 1)) == 0);
	}
	private static int Positon(int n) {
		if(!EvenOdd(n)) {
			return -1;
		}
		int ans = 0; 
        while (n > 0) { 
            n = n >> 1; 
            ans++; 
        } 
  
        return ans; 

	}
}
