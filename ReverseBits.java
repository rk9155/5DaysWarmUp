package Mathematical;

import java.util.Scanner;

public class ReverseBits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long ans[] = new long[t];
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			ans[i] = reverseBits(n);
		}
		for(int i = 0;i<t;i++) {
			System.out.println(ans[i]);
		}

	}

	private static long reverseBits(int n) {
	        long ans = 0; 
	     for(int i = 0;i<32;i++) {
	                ans <<= 1;
	                ans = ans | n & 1;
	                n >>= 1;
	     }
	        return ans; 
	}

}
