package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskFifth {

	public static void main(String[] args) {
		
		int counter = 0;
		int oddOrEven = 0;
		int resualt = 0;
		
		while(counter < 10){
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������� ������ ����� " );
			boolean checkNumber = sc.hasNextInt();
			
			if(checkNumber){
				oddOrEven = sc.nextInt();
				int odd = oddOrEven%2 ;
				
				if(odd == 0){
					resualt = resualt + oddOrEven;
					counter++;
				}else{
					System.out.print("������ ������  !!! " );
				}
		}else{
			System.out.print("��� �� ����� �� ��� !!! " );
	}
			
}
		System.out.print("����� ���� ������ ����� = " + resualt);
}
}
