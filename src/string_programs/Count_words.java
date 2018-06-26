package string_programs;

import java.util.StringTokenizer;

public class Count_words {
	
	public static void main(String[] args) {
		
		String name = "my name is raja";
		
		StringTokenizer st = new StringTokenizer(name);
		int total_words=st.countTokens();
		
		System.out.println(total_words);
		
	}

}
