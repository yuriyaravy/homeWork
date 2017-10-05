package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskSeventh {

	public static void main(String[] args) {
		
		int counter = 0;
		int sum_fib = 0;
		int fib1 = 0;
		int fib2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" ¬ведите число. ");
		int Number = sc.nextInt();
	
		
		while (counter < Number){
			
			 sum_fib = fib1 + fib2;
	         fib1 = fib2;
	         fib2 = sum_fib;
	         System.out.print(sum_fib+ " ");
			
	         counter++;
	}
}
}