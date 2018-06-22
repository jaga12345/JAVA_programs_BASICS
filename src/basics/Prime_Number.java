package basics;

public class Prime_Number {
	
	public static void main(String[] args) {
		
		int num=5;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			
		}
		
		if(count==2) {
			
			System.out.println("its a prime number");
			
		}
		
		else {
			
			System.out.println("please enter a right number");
		}
		
	}

}
