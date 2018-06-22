package basics;

public class Armstrong_Number {
	
	public static void main(String[] args) throws Throwable{
		
		int num=145;
		int sum=0;
		
		
		while(num!=0) {
			
			int rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==num) {
			
			System.out.println("its an armstrong number");
			
		}
		
		else {
			
			throw new Exception("please enter a valid number");
		}
	}

}
