package by.home.lesson11;

public class MainColculation {

	public static void main(String[] args) {
		
			IColculation icalc = new ColculationTwoImplements();
			
			System.out.println(icalc.summa(3, 5));

	}
}
