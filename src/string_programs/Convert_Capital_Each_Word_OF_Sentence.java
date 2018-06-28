package string_programs;

public class Convert_Capital_Each_Word_OF_Sentence {
	
	public static String convert_TO_capital(String str) {
		
		String final_sentence = "";
		str.replaceAll("() (A-Z)", "$1 $2");
		String words[] = str.split(" ");
		
		for (String word : words) {
			
			if(word.length()>0) {
				
				final_sentence +=  Character.toUpperCase(word.charAt(0)) + word.substring(1) + " " ;
				
			}
			
		}
		
		
		return final_sentence;
	
	}
	
	
	public static void main(String[] args) {
		
		String str = "my   name   is   raja";
		System.out.println(convert_TO_capital(str));
		
	
	}

}
