package hackerank;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        Map<String, Integer> mapMagzine = new Hashtable<String, Integer>();
        Map<String, Integer> mapRansom = new Hashtable<String, Integer>();
        
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            if (mapMagzine.containsKey(magazine[magazine_i])) {
            	mapMagzine.put(magazine[magazine_i], mapMagzine.get(magazine[magazine_i]) + 1);
            } else {
            	mapMagzine.put(magazine[magazine_i], 1);
            }
        }
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            if (mapRansom.containsKey(ransom[ransom_i])) {
            	mapRansom.put(ransom[ransom_i], mapRansom.get(ransom[ransom_i]) + 1);
            } else {
            	mapRansom.put(ransom[ransom_i], 1);
            }
        }
        
        for (String key : mapRansom.keySet()) {
        	if (!mapRansom.containsKey(key) || mapRansom.get(key) > mapMagzine.get(key)) {
        		System.out.println("No");
        		System.exit(0);
        	}
        }
        System.out.println("Yes");
    }
}
