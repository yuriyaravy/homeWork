package by.IntelSoft.HWthird;
import java.util.Scanner;
public class taskFirst {

	public static void main(String[] args) {

		int counter = 1;
		int resualt = 0;
		
		
		
		while(counter < 10){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ����� �����: " + counter);
			boolean checkNumber = sc.hasNextInt();
				
				if(checkNumber){
					
					int number = sc.nextInt();
					resualt = resualt + number;
					counter++;
					
				}else{
					System.out.println("��������� ������� ������ ����� " );
				}
		}
		System.out.println("����� ���� ����� : " + resualt);
	}
}
