package basics;

public class Perfect_Number {
	
	public static void main(String[] args) {
		
		int num=6;
		int sum=0;
		int temp=num;
		
		for(int i=1; i<num; i++) {
			
			if(num%i==0) {
				
				sum = sum + i ;
			}
			
		}
		
		if(sum==temp) {
			
			System.out.println("it is a perfect number");
		}
		
		else {
			System.out.println("insert correct number");
		}
		
	}

}
