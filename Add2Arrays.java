package arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Add2Arrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int [] a1 = new int[m];
      int [] a2 = new int[n];
      
      for(int i=0; i<m; i++){
        a1[i] = sc.nextInt();
      }
       for(int i=0; i<n; i++){
        a2[i] = sc.nextInt();
      }
       
//       System.out.println(a1);

      int sum1 = 0;
      for(int i=0; i<m; i++){
        sum1 = sum1*10+a1[i];
      }
      System.out.println(sum1);
      int sum2 = 0;
       for(int i=0; i<n; i++){
       sum2 = sum2*10+a2[i];
      }
       System.out.println(sum2);
     int sum = sum1+sum2;
      int temp = sum;
      int length = 0;
      while(temp>0){
        length++;
        temp= temp/10;
      }
      int[] ans = new int[length];
  for(int i = length-1; i>=0; i--){
    if(sum<0)
    break;
    int rem  = sum%10;
    ans[i] = rem;
    sum = sum/10;
  }
    for(int i=0; i<length; i++){
      System.out.print(ans[i]+" ");
    }
	}
}