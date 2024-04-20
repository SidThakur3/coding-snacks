package coding.strings;

import java.util.Arrays;
import java.util.Objects;

public class maximumNumberOfWordsInString {

    static public void main(String[] args) {
		
		String [] sentences = new String[]{ "Welcome to geeks for geeks",
                "Happy Coding", "We love gfg" };
		
		int x = numbersofWords(sentences);
		System.out.println("Maximum words found in string :" + x);

	}

	 static private int numbersofWords(String[] sentences) {
		
		int maxWords = 0 ;
		
		for(String str : sentences) {
			//Checking if string is empty or null
			if(!str.isEmpty() && Objects.nonNull(str)) {
				
				//Removing trailing whitespaces & splitting based on whitespaces in b/w sentence
				String [] split_str = str.trim().split(" ");
				
				System.out.println(Arrays.toString(split_str));
				System.out.println(split_str.length);
				
				int x = split_str.length;
				if(x > maxWords) {
					maxWords = x ;
				}
				
			}
		}
		
		return maxWords;
	}

}
