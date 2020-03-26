package Mathematical;

import java.util.Scanner;

public class PalindromicArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		int ans[] = new int[t];
	   
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			int a[] = new int[n];
			for(int j = 0;j<n;j++) {
				a[j] = s.nextInt();
			}	
			ans[i] = palindromicCount(a,a.length);
		}
		for(int i = 0;i<t;i++) {
			System.out.println(ans[i]);
		}
	
	}

	private static int palindromicCount(int[] a,int n)
	    { 
	        int ans = 0; 
	  
	        for (int i=0,j=n-1; i<=j;) 
	        { 
	            if (a[i] == a[j]) 
	            { 
	                i++; 
	                j--; 
	            } 
	  
	            else if (a[i] > a[j]) 
	            { 
	                j--; 
	                a[j] += a[j+1] ; 
	                ans++; 
	            } 
	  
	            else
	            { 
	                i++; 
	                a[i] += a[i-1]; 
	                ans++; 
	            } 
	        } 
	  
	        return ans; 
	    } 
	}