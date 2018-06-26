package string_programs;

import java.util.Scanner;

public class Count_Vowels_Degits_BlankSpaces {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String ");
		
		String str = sc.nextLine();
		
		 int vowel = 0,blank_spaces=0,degits = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				
				vowel++;
				
			}
			
			else if(Character.isDigit(ch)) {
				
				degits++;
				
			}
			
			else if(Character.isWhitespace(ch)) {
				
				blank_spaces++;
				
			}
			
		}
		
		System.out.println("no of vowels are : "+ vowel );
		System.out.println("no of degits are : "+ degits );
		System.out.println("no of blank spaces are : "+ blank_spaces );
		
		
		
	}

}
