package BItManipulation;

import java.util.Scanner;

public class UniqueNo1 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A[] = null;
	    int ans[] = null;
		
		int n = s.nextInt();
		A = new int[n];
	
		for(int i = 0;i<n;i++) {
			A[i] = s.nextInt();
		}
	
		System.out.println(UNo1(A));
		

	}

	private static int UNo1(int[] a) {
		int ans = a[0];
		for(int i = 1;i<a.length;i++) {
			ans = ans^a[i];
		}
		return ans;
	}
}
