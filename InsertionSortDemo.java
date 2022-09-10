package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int j = i-1;
			int key = a[i];
			
			while(j>=0 && key<a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
			System.out.println("after iteration "+(i+1)+" array is"+Arrays.toString(a));
		}
      System.out.println(Arrays.toString(a));
	}

}
