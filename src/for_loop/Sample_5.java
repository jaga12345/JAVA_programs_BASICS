package for_loop;

public class Sample_5 {
	
	public static void main(String[] args) {
		
		int line = 5;
		int space = 1;
		int star = line;
		
        for (int i = 0; i < line; i++) {
			
			for (int j = 0; j < space; j++) {
				
				System.out.print(" ");
				
				
			}
			
			for (int k = 0; k < star; k++) {
				
				System.out.println("*");
				
			}
			
	     
	     System.out.println();
       }
        
        
        star++;
        space--;
			
		
	}

}
