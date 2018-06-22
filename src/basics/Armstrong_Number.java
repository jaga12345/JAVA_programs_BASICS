package basics;

import java.util.Scanner;

public class Armstrong_Number {
	
	private static Scanner sc;

	public static void main(String[] args) throws Throwable{
		
		sc = new Scanner(System.in);
		System.out.println("enter the number you want to test");
		int num=sc.nextInt();
		
		//int num=153;
		int sum=0;
		int temp=num;
		
		while(num!=0) {  //while (num>0)
			
			int rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		
		if(sum==temp) {
			
			System.out.println("its an armstrong number");
			
		}
		
		else {
			
			throw new Exception("please enter a valid number");
		}
	}

}
