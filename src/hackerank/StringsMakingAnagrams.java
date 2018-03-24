package hackerank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsMakingAnagrams {
	public static int numberNeeded(String first, String second) {
		
		int ans = 0;
		Map<Character, Integer> firstMap = new HashMap<Character, Integer>();		
		
		for (int i = 0; i < first.length(); i++) {
			Character key = first.charAt(i);
			if (firstMap.containsKey(key)) {
				firstMap.put(key, firstMap.get(key) + 1);
			} else {
				firstMap.put(key, 1);
			}
		}
		
		for (int i = 0; i < second.length(); i++) {
			Character key = second.charAt(i);
			if (firstMap.containsKey(key)) {
				firstMap.put(key, firstMap.get(key) - 1);
			} else {
				firstMap.put(key, -1);
			}
		}
		
		for (Character key : firstMap.keySet()) {
			if (firstMap.get(key) != 0) {
				ans += Math.abs(firstMap.get(key));
			}
		}
		
		return ans;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
