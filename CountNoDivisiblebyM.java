package Mathematical;

import java.util.Scanner;

public class CountNoDivisiblebyM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		int ans[] = new int[t];
		for(int i = 0;i<t;i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int x = s.nextInt();
			ans[i] = CountnoDivisibleByM(m,n,x);
		}
		for(int i = 0;i < t;i++) {
			System.out.println(ans[i]);
		}

	}

	private static int CountnoDivisibleByM(int m, int n, int x) {
        if(n%x == 0) {
        	return n/x - m/x + 1;
        }
		
		return n/x - m/x;
	}

}
