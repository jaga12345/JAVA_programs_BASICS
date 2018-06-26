package array_programs;

public class Distinct_Element_IN_Array {
	
	public static void distinct_elements(int [] arr) {
	
		for(int i=0; i<arr.length; i++) {
			
			Boolean isdistinct = false ;
			
			for(int j=0 ; j<i ; j++) {
				
				if(arr[i]==arr[j]) {
					
					isdistinct = true;
					
					break;
					
				}
				
			}
			
			if(!isdistinct) {
				
				System.out.println( arr[i] + " ");
			}
		}
		
	}	
		public static void main(String[] args) {
			
			int [] arr = {1,1,2,2,3,3,4,4,5,6,7,88,88,88};
			
			distinct_elements(arr);
		
	}
	
	

}
