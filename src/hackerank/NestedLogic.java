package hackerank;

import java.util.Scanner;

public class NestedLogic {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int reDate = scan.nextInt();
		int reMonth = scan.nextInt();
		int reYear = scan.nextInt();
		int dueDate = scan.nextInt();
		int dueMonth = scan.nextInt();
		int dueYear = scan.nextInt();
		scan.close();
		
		if (reYear > dueYear) {
			System.out.println(10000);
		} else if (reYear == dueYear && reMonth > dueMonth) {
			System.out.println((reMonth - dueMonth) * 500);
		} else if (reMonth == dueMonth && reDate > dueDate) {
			System.out.println((reDate - dueDate) * 15);
		} else {
			System.out.println(0);
		}
	}
}
