package BitsProblem;

import java.util.Scanner;

public class Countsetbits {

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
		ans[j]= CountSetBits(input[j]);
		
		}
		for(int k =0;k<n;k++) {
		System.out.println(ans[k]);
		
		}
	}
   public static int CountSetBits(int n) {
	        int count = 0; 
	        while (n > 0) { 
	            n &= (n - 1); 
	            count++; 
	        } 
	        return count; 
	    } 
	
}
