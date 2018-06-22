package string_programs;

public class Removing_Junk {
	
	public static void main(String[] args) {
		
		String name = "jbhf%#$@&!@vfghdvf%&$&@%";
		
		name = name.replaceAll("[^A-Za-z0-9]" , "");
		
		System.out.println(name);
		
	} 
	

}
