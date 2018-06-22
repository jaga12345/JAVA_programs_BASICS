package basics;

public class Strong_Number {
	
	public static void main(String[] args) throws Exception {
		
		int num=145;
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			
			int rem=num%10;
			num=num/10;
			int fact=1;
			for(int i=1;i<rem;i++) {
				fact=fact*i;
			}
			
			sum=sum+fact;
		}
		
		if(sum==temp) {
			System.out.println("it is a strong number");
		}
		
		else {
			throw new Exception("not a strong number");
		}
		
	}

}
