import java.io.IOException;

public class Main {

		public static void main(String[] args) throws IOException {
			Accounte a1 = new Accounte();
			a1.currency = Currency.BLR;
			a1.summa = 1000;
			
			Accounte a2 = new Accounte();
			a2.currency = Currency.EUR;
			a2.summa = 1000;
			
			a1.deposit(10, a2);
			
			System.out.println("Куда ----> "+a1.summa);
			System.out.println("Откуда --> "+a2.summa);
			
			ConverterInternetImplements t = new ConverterInternetImplements();
			System.out.println(t.curMap);
			
			
		}

}
