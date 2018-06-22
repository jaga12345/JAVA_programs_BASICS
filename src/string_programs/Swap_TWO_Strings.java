package string_programs;

public class Swap_TWO_Strings {
	
	public static void main(String[] args) {
		
		String a = "my name is";
		String b = "RAJA";
		System.out.println("Before Swapping \na = "+a+"\nb = "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		/*String [] word=b.split(" ");
		for(int i=word.length-1; i>0; i--) {
			b=b+word[i]+"";
		}*/
		
		System.out.println("after  swapping \na= "+a+"\nb = "+b);
		
	}

}
