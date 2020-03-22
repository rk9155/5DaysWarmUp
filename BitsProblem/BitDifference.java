package BitsProblem;

import java.util.Scanner;

class BitDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input[] = null;
	    int ans[] = null;
	    
		int n = 0;
	    n = s.nextInt();
		
		ans = new int[n];
		input = new int[2];
		for(int j = 0;j<n;j++) {
	    for(int i = 0;i<2;i++) {
		input[i] = s.nextInt();
	    }
		ans[j]= FlipingCount(input[0],input[1]);
		
		}
		for(int k =0;k<n;k++) {
		System.out.println(ans[k]);
		
		}
	}
    static int FlipingCount(int a, int b) 
    { 
        return Countsetbits.CountSetBits(a^b);
    } 
}


