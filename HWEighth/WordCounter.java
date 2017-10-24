package by.IntelSoft.HWEighth;

import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test: " );
		String text =sc.nextLine();
		String arraysText [] = text.split(" ");
		System.out.println("Your phrase include " +arraysText.length+ " elements ");
	}
}
