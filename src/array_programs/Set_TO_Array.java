package array_programs;

import java.util.HashSet;
import java.util.Set;

public class Set_TO_Array {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		
		set.add("world");
		
		System.out.print(set);
		
		int size = set.size();
		
		String arr[] = new String [size];
		
		arr = set.toArray(arr);
		
		System.out.println();
		
		for (String string : arr) {
			
			System.out.println(string);
		}
		
	}

}
