package array_programs;

public class Bubble_Sort {
	
	static int temp = 0;
	
	public static void bubblesort(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 1; j < arr.length-i; j++) {
				
				if(arr[j-1]==arr[j]) {
					
				    temp = arr[j-1];
					
					arr[j-1] = arr[j];
					
					arr[j] = temp;
					
				}
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,5,1,2,7,9};
		
		System.out.println("before sorting");
		
		for (int i : arr) {
			
			System.out.print(i);
			
		}
		
		System.out.println();
		
		System.out.println("after sorting");
		
		bubblesort(arr);
		
        for (int i : arr) {
			
			System.out.print(i);
			
		}
		
	}

}
