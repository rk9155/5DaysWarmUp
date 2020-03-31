package NumberTheory;

import java.util.Scanner;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		factorial(a);

	}
	static void factorial(int n) 
    { 
        int ans[] = new int[1000]; 
  
        // Initialize result 
        
        ans[0] = 1; 
        int ans_size = 1; 
  
        for (int i = 2; i <= n; i++) 
            ans_size = multiply(i, ans, ans_size); 
   
        for (int i = ans_size - 1; i >= 0; i--) 
            System.out.print(ans[i]); 
    } 
   
    static int multiply(int x, int ans[], int ans_size) 
    { 
        int carry = 0; 
        
        for (int i = 0; i < ans_size; i++) 
        { 
            int prod = ans[i] * x + carry; 
            ans[i] = prod % 10; 
            
            carry = prod/10; 
        } 
  
        while (carry!=0) 
        { 
            ans[ans_size] = carry % 10; 
            carry = carry / 10; 
            ans_size++; 
        } 
        return ans_size; 
    } 
}
