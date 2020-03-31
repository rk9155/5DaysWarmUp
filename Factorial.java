package NumberTheory;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigIneteger n = s.nextLong();
		BigInteger ans = factorial(n);
		System.out.println(ans);

	}

	private static BigInteger factorial(BigInteger n) {
		BigInteger res = 1;
		BigInteger i = 1;
		for(i = 2;i<=n;i++) {
			res = res*i;
		}
		
		return res;
	}

}
