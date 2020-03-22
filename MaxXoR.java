package BItManipulation;

import java.util.Scanner;
import java.util.*;

public class MaxXoR {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

        int LXR = a ^ b; 
      
        int msbPos = 0; 
        
        while (LXR > 0) 
        { 
            msbPos++; 
            LXR >>= 1; 
        } 
     
        int maxXOR = 0; 
        int two = 1; 
        while (msbPos-- >0) 
        { 
            maxXOR += two; 
            two <<= 1; 
        } 
       
       System.out.println(maxXOR);
	}
}
  