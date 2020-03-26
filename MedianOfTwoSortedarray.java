package Sorting;

import java.util.Scanner;

public class MedianOfTwoSortedarray {

	 public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) 
	 { 
		 int n1 = arr1.length;
		 int n2 = arr2.length;
		 int i = 0, j = 0, k = 0; 
		 
		 while (i<n1 && j <n2) 
		 { 
			 if (arr1[i] < arr2[j]) 
				 arr3[k++] = arr1[i++]; 
			 else
				 arr3[k++] = arr2[j++]; 
		 } 
		 while (i < n1) 
			 arr3[k++] = arr1[i++]; 

		 while (j < n2) 
			 arr3[k++] = arr2[j++]; 
	 } 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];	
		int arr2[] = new int[n];
		
		for(int i =0; i<n;i++) {
			arr1[i]= sc.nextInt();
		}
		for(int i =0; i<n;i++) {
			arr2[i]= sc.nextInt();
		}
		int arr3[] = new int [n+n];
		mergeArrays(arr1,arr2,arr3);
		int x = arr3.length;
		if(x%2 == 0) {
			System.out.println(arr3[(x/2)-1]);
		}
		else {
			System.out.println(arr3[(x/2)]);
		}
		
	}

}
