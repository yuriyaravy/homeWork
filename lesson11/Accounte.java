package by.home.lesson11;

public class Accounte {
	
	double summa;
	Currency currency;
	
	void deposit(double summa, Accounte acc){
		acc.summa  = acc.summa - Converter.FromCarrencyToCarrency(summa, currency, acc.currency);
		this.summa = this.summa + summa;
	}

}
