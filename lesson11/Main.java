package by.home.lesson11;

public class Main {

	public static void main(String[] args) {
		Accounte a1 = new Accounte();
		a1.currency = Currency.BLR;
		a1.summa = 1000;
		
		Accounte a2 = new Accounte();
		a2.currency = Currency.USD;
		a2.summa = 1000;
		
		a1.deposit(500, a2);
		
		System.out.println(a1.summa);
		System.out.println(a2.summa);
		
	}
}
