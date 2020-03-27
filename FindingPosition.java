package Mathematical;

import java.util.Scanner;

public class FindingPosition {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int ans[] = new int[t];
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			ans[i] = findposition(n);
		}
		for(int i = 0;i<t;i++) {
		System.out.println(ans[i]);
		}
	}

	private static int findposition(int n) 
		   { 
		     int pos = 0; 
		     for (int i = n; i >= 1; i--) 
		        { 
		          if ((i & (i - 1)) == 0) 
		             { 
		                  pos = i; 
		                break; 
		             } 
		        } 
		     return pos; 
		   } 
		  
	}