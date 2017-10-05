package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskSixth {

	public static void main(String[] args) {
		
		int resualt = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число ");
			boolean checkNumber = sc.hasNextInt();
			
		System.out.println("Введите степень ");
			boolean checkMathDegree = sc.hasNextInt();
		
		if(checkNumber && checkMathDegree){
			
			int number = sc.nextInt();
			int MathDegree = sc.nextInt();

			for(int counter = 0; counter < MathDegree; counter++){
				resualt = resualt * number;
			}
			System.out.println("Рузультат " + resualt);
			
		}else{
			System.out.println("Только числа ");
		}
	}

}
