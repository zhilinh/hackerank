package hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunningTimeAndComplexity {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);		
		List<Integer> nums = new ArrayList<Integer>();
		int m = scan.nextInt();
		while (scan.hasNextLine()) {
			nums.add(scan.nextInt());
		}
		scan.close();
		
		for (int i = 0; i < m; i++) {
			// 1 is Not prime!!!
			if (nums.get(i) == 1) {
				System.out.println("Not prime");
				continue;
			}
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(nums.get(i)); j++) {
				if (nums.get(i) % j == 0) {
					System.out.println("Not prime");
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println("Prime");
			}
		}
    }
}
