package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskSecond {

	public static void main(String[] args) {
		
		int counter = 1;
		int resualt = 0;
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите число номер: " + counter);
			boolean checkNumber = sc.hasNextInt();
				
				if(checkNumber){
					
					int number = sc.nextInt();
					resualt = resualt + number;
					counter++;
				}else{
					System.out.println("Программа считает только числа " );
				}
		}while(counter < 10);
		
			System.out.println("Сумма всех числе : " + resualt);

	}
}
