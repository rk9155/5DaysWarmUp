package Mathematical;

import java.util.Scanner;

public class SumOfDigitsUntilOne {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    int ans[] = null;
		int n = s.nextInt();
		ans = new int[n];
		
		for(int i = 0;i<n;i++) {
			int x = s.nextInt();
			ans[i] = SumofDigits(x);
		}
		for(int i = 0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}

	private static int SumofDigits(int n) {
		int ans = 0;
		int sum = 0;
		while(n>0) {
			sum = sum + n%10;
			n = n/10;	
		}
		if(sum<10) {
			ans = sum;
		}else {
			ans = SumofDigits(sum);
		}
		return ans;
	}

}
