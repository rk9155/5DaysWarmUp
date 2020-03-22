package BItManipulation;

import java.util.Scanner;
import java.util.*;

public class UniQueNo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A[] = null;
	    int x = 0;
	    int y = 0;
	    
		int n = s.nextInt();
		A = new int[n];

		for(int i = 0;i<n;i++) {
			A[i] = s.nextInt();
		}

		int res = A[0];
		for(int i = 1;i<n;i++) {
			res = res^A[i];
		}

		int temp = res;
		int pos = 0;
		int set_bitNo = res & ~(res-1);
		for(int i = 0;i<A.length;i++)
		{		
			if((A[i]&set_bitNo)>0) {
				x = x^A[i];
			}
			
		}

		y = res^x;
	    System.out.println(Integer.min(x, y)+" "+Integer.max(x,y));
		
	}
	
	}

