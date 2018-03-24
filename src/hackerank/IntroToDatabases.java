package hackerank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IntroToDatabases {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++){
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find()){
                list.add(name);
            }
        }
        
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}
