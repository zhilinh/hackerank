package hackerank;

public class Testing {
	
	Testing (int n, int k, int[] a) {
        System.out.println(n + " " + k);
        for (int i = 0; i < n; i++) {
        	System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // number of test cases - each test case is two lines
        int testCases = 5; 

        System.out.println(testCases);
        new Testing(4, 3, new int[] {-1, 0, 4, 2});
        new Testing(5, 2, new int[] {0, -1, 2, 1, 4});
        new Testing(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
        new Testing(3, 1, new int[] {-1, 0, 4});
        new Testing(6, 4, new int[] {0, -1, 1, 4, 5, 6});
    }
}
