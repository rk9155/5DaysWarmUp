package NumberTheory;

import java.util.Scanner;

//gcd recursion
//also find lcm using gcd

public class GCD1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans = gcd(a,b);
		int ans2 = lcm(a,b);
		System.out.println("GCD - " + ans);
		System.out.println("LCM - " +ans2);
	}

	private static int lcm(int a, int b) {
		
		return (a*b)/gcd(a,b);
	}

	private static int gcd(int a, int b) {
	int ans = 0;
		if(b==0) {
			ans = a;
		}else {
		ans =  gcd(b,a%b);
	}
		return ans;

}
}

