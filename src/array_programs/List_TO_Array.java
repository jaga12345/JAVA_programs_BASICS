package array_programs;


import java.util.LinkedList;
import java.util.List;

public class List_TO_Array {
	
	public static void main(String[] args) {
		
		List<String> lst = new LinkedList<String>();
		
	//	List<String> lst = new ArrayList<String>();
		
		lst.add("I");
		
		lst.add("am");
		
		lst.add("a boy");
		
		System.out.println(lst);
		
		String arr[] = new String[lst.size()];
		
		arr = lst.toArray(arr);
		
		for (String string : arr) {
			
			System.out.println(string);
		}
		
	}

}
