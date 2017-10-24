package by.IntelSoft.HWEighth;

import java.util.Scanner;

public class PolindromWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to check: ");
		String word = sc.next();
		String  an = new StringBuffer(word).reverse().toString();
			if (an.equals(word)){
				  System.out.print("This word " + word + " palindrome");
			}else{  
				System.out.print("Word is not palindrome");
			}
	}
}