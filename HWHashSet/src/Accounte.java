
import java.util.GregorianCalendar;

public class Accounte {
	
	double summa;
	Currency currency;
	
	
	void deposit(double summa, Accounte acc){
		IConverter conv = new  ConverterInternetImplements();
		acc.summa  = acc.summa - conv.fromCarrencyToCarrency(summa, currency, acc.currency);
		this.summa = this.summa + summa;
	}
}
