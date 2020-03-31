package Practice;

import java.util.Scanner;

public class LUCKFOUR {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		long ans[] = new long[t];
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			ans[i] = findFour(n);
		}
		for(int i = 0;i<t;i++) {
			System.out.println(ans[i]);
		}
	}

	private static long findFour(long n) {
		String str = Long.toString(n);
		long count = 0;
		int l = str.length();
		for(int i = 0;i<l;i++) {
			if(str.charAt(i)=='4') {
				count++;
			}
		}
		return count;
	}

}
