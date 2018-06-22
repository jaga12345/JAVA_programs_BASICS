package basics;

public class Swapping {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before Swapping \na = "+a+"\nb = "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after  swapping \na= "+a+"\nb = "+b);
		
	}

	
	
}
