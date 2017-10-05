package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskThird {

	public static void main(String[] args) {
		
		int resualt = 0;
		
		for(int counter = 1; counter < 11; counter++){
			
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите число номер: " + counter);
			boolean checkNumber = sc.hasNextInt();
				
				if(checkNumber){
					int number = sc.nextInt();
					resualt = resualt + number;
				}else{
					
					System.out.println("Программа считает только числа " );
					
				}
			}
		System.out.println("Сумма всех числе : " + resualt);
	}
}