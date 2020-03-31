package NumberTheory;
import java.util.Scanner;

public class CheckPrimeFaster {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    System.out.println(checkPrime(n));

	}

	private static String checkPrime(int n) {
		String ans = "Prime";
		if(n==1) {
			ans = "Not Prime";
		}
		
		for(int i =  2;i*i<=n;i++) {
			if(n%i == 0) {
				ans = "Not Prime";
			}else {
				ans = "Prime";
			}
		}
		return ans;
	}

}
