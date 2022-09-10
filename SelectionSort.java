package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i<n ;i++) {
			a[i] = sc.nextInt();
		}
    //In SelectionSort sort, we will find th minimum element and set it at first position

for(int i=0; i<n-1 ;i++){
  int minIndex = i;
  for(int j=i+1; j<n; j++){
    if(a[j]<a[minIndex]){
      minIndex = j;
    }
    int temp = a[i];
    a[i] = a[minIndex];
    a[minIndex] = temp;
  }
    
  System.out.println(Arrays.toString(a));

	}

}
