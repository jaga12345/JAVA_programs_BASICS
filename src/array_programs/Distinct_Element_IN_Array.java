package array_programs;

public class Distinct_Element_IN_Array {
	
	public static void main(String[] args) {
		
		int [] arr = {1,1,2,2,3,3,4,4,5,6,7,88,88,88};
		
		for(int i=0; i<arr.length; i++) {
			
			Boolean isdistinct = false ;
			
			for(int j=0 ; j<i ; j++) {
				
				if(arr[i]==arr[j]) {
					
					isdistinct = true;
					
				}
				
			}
			
			if(!isdistinct) {
				
				System.out.println( arr[i]);
			}
		}
		
		
	}

}
