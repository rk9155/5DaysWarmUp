package NumberTheory;

import java.util.Scanner;

public class ExtendedEuclidian {
	static long x;
	static long y;
	static long gcd;
	public static void main(String[] args) {
		
		extendedEuclid(18,30);
		System.out.println(x+" "+y);
	}
    
   public static void extendedEuclid(long a, long b) {
		if(b==0) {
			x = 1;
			y = 0;
			gcd = a;
			return;
		}
		extendedEuclid(b,a%b);
		long cX = y;
		long cY = x - (a/b)*y;
		x = cX;
		y = cY;
	}

}
