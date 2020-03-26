package Mathematical;

import java.util.Scanner;
import java.util.ArrayList;

public class MultiplicationOfPolynomial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		ArrayList<ArrayList<Integer> > ans =  
                new ArrayList<ArrayList<Integer> >(t); 
		
	     for(int k = 0;k<t;k++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int a[] = new int[m];
			int b[] = new int[n];
			for(int i = 0;i<m;i++) {
				a[i] = s.nextInt();
			}
			for(int i = 0;i<n;i++) {
				b[i] = s.nextInt();
			}
			ans.add(Multiply(a,b,m,n));
	     }
	     for (int i = 0; i < ans.size(); i++) { 
	            for (int j = 0; j < ans.get(i).size(); j++) { 
	                System.out.print(ans.get(i).get(j) + " "); 
	            } 
	            System.out.println(); 
	        } 

	}

	private static ArrayList<Integer> Multiply(int[] a, int[] b, int m, int n) {
		
	 ArrayList<Integer> a1 = new ArrayList<Integer>();
		int prod[] = new int[m+n-1];
		for(int i = 0;i<m+n-1;i++) {
			prod[i] = 0;
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				prod[i+j] = prod[i+j] + a[i]*b[j];
			}
		}
		for(int i = 0;i<m+n-1;i++) {
			a1.add(prod[i]);
		}
		return a1;
	}

}
