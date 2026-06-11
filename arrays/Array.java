

import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int[] n = {100, 102, -1, -5, -200, 200, 1000, -1000, 3, 25, 9, 12, 88, 34, 2, 7, 18, 24};
		int min;
		int temp, pos = 0;

		for (int k = 0; k < n.length-1; k++) {
		    min = n[k];
		    pos = k;  // Initialize position to current index
		    
		    for (int i = k+1; i < n.length; i++) {
		        if (n[i] < min) {
		            min = n[i];
		            pos = i;
		        }
		    }
		    
		    // Swap the elements
		    temp = n[k];
		    n[k] = n[pos];
		    n[pos] = temp;
		}	

		System.out.println("Sorted array: " + Arrays.toString(n));
	}
}
