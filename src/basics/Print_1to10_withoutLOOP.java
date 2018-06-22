package basics;

public class Print_1to10_withoutLOOP {
	
	public static void main(String[] args) {
		
		m1(0);
		
	}
	
	public static void m1(int i) {
		
		if(i<10) {
			i++;
			System.out.println(i);
			m1(i);
		}
		
	}

}
