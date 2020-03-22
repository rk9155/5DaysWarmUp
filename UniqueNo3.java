package BItManipulation;

import java.util.Scanner;

public class UniqueNo3 {

	// input  1 1 1 2 2 2 3
	// result 3
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A[] = null;
		int count[] = new int[64];
		int n = s.nextInt();
		A = new int[n];

		for(int i = 0;i<n;i++) {
			A[i] = s.nextInt();
			int j = 0;
			while(A[i]>0) {
				int lastBit = A[i]&1;
				count[j] += lastBit;
				j++;
				A[i] = A[i] >> 1;
			}
		}
		int p =1;
		int ans = 0;
		for(int i = 0;i<64;i++) {
			
			count[i] %=3;
			ans+=count[i]*p;
			p = p<<1;
		}
		System.out.println(ans);
	}

}
