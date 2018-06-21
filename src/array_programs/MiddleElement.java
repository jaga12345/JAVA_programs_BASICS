package array_programs;

//find the middle element in an array where sum of right is equals to sum of left

public class MiddleElement {
	
	public static void main(String[] args) throws Throwable {
		
	       int arr[]= {4,5,1,1,4,5};
	       
	       m1(arr);
		}
	
	public static int m1(int arr[]) throws Exception {
		
		int sum_right=0;
		int sum_left=0;
		int start_index=0;
		int end_index=arr.length-1;
		
		while(true) {
			
			if(sum_left>sum_right) {
				sum_right=sum_right+arr[end_index--];
			}
			else {
				sum_left=sum_left+arr[start_index++];
			}
			
			if(start_index>end_index) {
				if(sum_left==sum_right) {
					break;
					
				}
			}
			
			
		}
		return end_index;
	}
	
	

}
