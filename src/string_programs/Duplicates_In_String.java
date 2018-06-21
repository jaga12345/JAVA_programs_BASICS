package string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Duplicates_In_String {
	
public static void main(String[] args) {
		
		String name = "JAGANNATH";
		
		display_duplicates(name);
		
	}
 
	public static void display_duplicates(String name) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		char [] arr = name.toCharArray();
		
		for (char c : arr) {
			
			if( ! map.containsKey(c)) {
				
				map.put(c, 1);
			}
			
			else{
				map.put(c, map.get(c)+1);
			}
		}
			
			Set<Entry<Character, Integer>> entryset = map.entrySet();
			
			for (Entry<Character, Integer> entry : entryset) {
				
				if(entry.getValue()>1) {
					
					System.out.println(entry.getKey() + "=" + entry.getValue());
				}
			}
		

	}

}
