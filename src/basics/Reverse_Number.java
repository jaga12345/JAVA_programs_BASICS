package basics;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		int num = 123;
		int rev = 0 ;
		
		while(num!=0) {
			
			int rem = num%10;
			num = num/10;
			
			rev = rev*10+rem;
			
		}
		System.out.println(rev);
		
		
	}

}
