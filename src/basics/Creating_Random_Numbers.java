package basics;

import java.util.Random;

public class Creating_Random_Numbers {
	
	public static void main(String[] args) {
		
		Creating_Random_Numbers crn = new Creating_Random_Numbers();
		
		crn.crete_random_numbers();
		
	}
	
	public void crete_random_numbers() {
		
		Random rdm = new Random();
		
		for(int i=0 ; i<5 ; i++) {
			
			Integer numbers =  rdm.nextInt();
			
			System.out.println(numbers);
		}
		
		
	}

}
