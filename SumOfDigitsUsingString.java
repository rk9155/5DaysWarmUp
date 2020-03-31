package Practice;

import java.util.Scanner;

public class SumOfDigitsUsingString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		int ans[] = new int[t];
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			ans[i] = sumDigits(n);
		}
		for(int i = 0;i<t;i++) {
			System.out.println(ans[i]);
		}

	}

	private static int sumDigits(int n) {
		String str = Integer.toString(n);
		int l = str.length();
		int sum = 0;
		for(int i = 0;i<l;i++) {
			char x = str.charAt(i);
			int p = (int)x;
			
			p = p-48;//Using ASCII table value of 0,1,2,3,4,5,6,7,8,9
			sum+=p;
		}
		return sum;
	}

}
