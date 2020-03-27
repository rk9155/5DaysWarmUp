package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			
			ArrayList<ArrayList<Integer> > ans =  
	                  new ArrayList<ArrayList<Integer> >(t); 
			
			for(int i = 0;i<t;i++) {
				int n = s.nextInt();
				int money = s.nextInt();
				int A[] = new int[n];
				for(int j = 0;j<n;j++) {
					A[j] = s.nextInt();
				}
				ans.add(atm(A,money));
			}
			for (int i = 0; i < ans.size(); i++) { 
	            for (int j = 0; j < ans.get(i).size(); j++) { 
	                System.out.print(ans.get(i).get(j)); 
	            } 
	            System.out.println(); 
	        } 
				
		}

	private static ArrayList<Integer> atm(int[] a, int money) {
		int n = a.length;
		ArrayList<Integer> ans = new ArrayList<Integer>(n);
		
		int unit = money;
		for(int i = 0;i<n;i++) {
			if(a[i]<=unit) {
				ans.add(1);
				unit = unit-a[i];
			}else {
				ans.add(0);
			}
		}
		return ans;
	}
	}

