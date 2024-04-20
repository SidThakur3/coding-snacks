package coding.strings;

import java.util.Arrays;

public class StringManipulation {
	
	public static void main(String args[]) {
		
		String str = new String("YASH");
		
		// Splitting string to string array
		String [] str_arr = str.split("");
		
		// Splitting string to char array
		char [] chr_arr = str.toCharArray();
		
		//Printing array
		System.out.println(Arrays.toString(str_arr));
		
		//Printing array
		System.out.println(Arrays.toString(chr_arr));
		
		//Reversing an string
		for(int i = str.length()-1; i>=0 ; i--) {
			System.out.println(str_arr[i]);
		}
		
		// -------- StringBuffer ------------ //
		
		StringBuilder str_build = new StringBuilder(str);
		System.out.println(str_build.reverse());
		
		// -------- StringBuilder ------------ //

		StringBuffer str_buffer = new StringBuffer(str);
		System.out.println(str_buffer.reverse());
	}
}
