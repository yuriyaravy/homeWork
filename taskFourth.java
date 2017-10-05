package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskFourth {

	public static void main(String[] args) {
		
		int odd = 0;
		int even = 0;
		
		for(int counter = 0; counter < 10; counter++){
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Ведите числа ");
			boolean checkNumber = sc.hasNextInt();
			
				if(checkNumber){
				
					int nubmer = sc.nextInt();
					int checking = nubmer%2;
					
					switch(checking){
					
						case 1:
							odd++;   // нечетные
							break;
						
						case 0:
							even++;	// четные
							break;
					}
					
				}else{
					System.out.print("Ошибка!!! что то пошло не так ");
			}
		}
		System.out.print(" Четных " + even + " Нечетных " + odd);
	}
}
