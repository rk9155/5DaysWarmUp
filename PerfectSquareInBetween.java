package Mathematical;

import java.util.Scanner;
import java.util.*;

public class PerfectSquareInBetween {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int t = s.nextInt();
	   int ans[] = new int[t];
	   for(int i = 0;i<t;i++) {
		   int a = s.nextInt();
		   int b = s.nextInt();
		   ans[i] = (int) CountperfectSquare(a,b);
	   }
	   for(int i = 0;i<t;i++) {
		   System.out.println(ans[i]);
	   }

	}

	private static double CountperfectSquare(int a, int b) {
		return (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1); 
	}

}
