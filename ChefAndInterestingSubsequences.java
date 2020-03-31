package Practice;

import java.util.Scanner;

public class ChefAndInterestingSubsequences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int ans[] = new int[t];
		
		
		for(int i = 0 ;i<t;i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			int A[] = new int[m];
			for(int j = 0;j<n;j++) {
				A[j]= s.nextInt();
			}
			ans[i] = CountSubsequences(A,n);
		}

		for(int i = 0 ;i<t;i++) {
			System.out.println(ans[i]);
		}
	}

	private static int CountSubsequences(int[] a, int n) {
		int[][] output = subsets1(a,0);
		int[][] ans = new int[output.length][n];
		for(int i = 0;i<output.length;i++) {
			
			
		}
		
		
		return 0;
	}
	 
    public static int[][] subsets1(int[] arr,int sI){
    if(sI==arr.length) {
				int[][] output =new int[1][0];
				return output;
		}
		
		int[][] smallOutput1 = subsets1(arr,sI+1);
		int[][] output = new int[(smallOutput1.length)*2][];
        
		int index =0;
		for(int i=0;i<smallOutput1.length;i++) {
			output[index] = smallOutput1[i];
			index++;
		}
		
		for(int i=0;i<smallOutput1.length;i++) {
			
			output[index] = new int[smallOutput1[i].length+1];
			output[index][0] = arr[sI];
			
			for(int j=0;j<smallOutput1[i].length;j++) {
				output[index][j+1] = smallOutput1[i][j];
			}
			index++;
		}
		return output;
    }

}
