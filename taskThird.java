package by.IntelSoft.HWthird;

import java.util.Scanner;

public class taskThird {

	public static void main(String[] args) {
		
		int resualt = 0;
		
		for(int counter = 1; counter < 11; counter++){
			
		
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ����� �����: " + counter);
			boolean checkNumber = sc.hasNextInt();
				
				if(checkNumber){
					int number = sc.nextInt();
					resualt = resualt + number;
				}else{
					
					System.out.println("��������� ������� ������ ����� " );
					
				}
			}
		System.out.println("����� ���� ����� : " + resualt);
	}
}