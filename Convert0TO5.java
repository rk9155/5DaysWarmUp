package Mathematical;

import java.util.Scanner;

public class Convert0TO5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int ans[] = new int[t];
		for(int i = 0;i<t;i++) {
			int n = s.nextInt();
			ans[i] = convertfive(n);
		}
		for(int i = 0;i<t;i++) {
			System.out.println(ans[i]);
		}
		
	}

	private static int convertfive(int n) {
		if(n==0) {
			return 5;
		}
		
		return convertfiveRec(n);
	}

	private static int convertfiveRec(int n) {
		if (n == 0) {
            return 0; 
		}
  
        int d = n % 10; 
        if (d == 0) {
            d = 5; 
        }
  
        return convertfiveRec(n / 10) * 10 + d; 
	}

}
