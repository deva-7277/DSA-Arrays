//		Given an array A[ ] of positive integers of size N, 
//		where each value represents the number of chocolates in a packet. 
//		Each packet can have a variable number of chocolates.
//		There are M students, the task is to distribute chocolate packets among M students such that :
//		1. Each student gets exactly one packet.
//		2. The difference between maximum number of chocolates given to a student and minimum number of chocolates
//		given to a student is minimum.
//		
//		Example 1:
//		
//		Input:
//		N = 8, M = 5
//		A = {3, 4, 1, 9, 56, 7, 9, 12}
//		Output: 6
//		Explanation: The minimum difference between 
//		maximum chocolates and minimum chocolates 
//		is 9 - 3 = 6 by choosing following M packets :
//		{3, 4, 9, 7, 9}.

//		https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int i=0;
		int ans=Integer.MAX_VALUE;
		while((i+m)<n) {
			int diff = arr[i+m-1]-arr[i];
			ans =Math.min(ans, diff);
			i++;
		}
		System.out.println(ans);
		sc.close();
	}

}
