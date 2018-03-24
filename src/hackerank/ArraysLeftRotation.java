package hackerank;

import java.util.Scanner;

public class ArraysLeftRotation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
        	if (i < k) {
        		ans[i - k + n] = a[i];
        	} else {
        		ans[i - k] = a[i];
        	}
        }
        for (int i = 0; i < n; i++) {
            System.out.print(String.valueOf(ans[i]) + " ");
        }
    }
}
