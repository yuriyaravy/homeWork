package by.home.lesson11;

public interface IConverter {
	
	double fromCurrencytoUSD(double summ, Currency cur);
	double fromUSDtoCarrency(double summ, Currency cur);
	double fromCarrencyToCarrency (double summa, Currency from , Currency to);
}
