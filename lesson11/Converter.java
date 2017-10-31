package by.home.lesson11;

public class Converter {
	
	public static double FromCurrencytoUSD(double summ, Currency cur){
		if(cur == Currency.BLR ){
			return summ/2;
		}if(cur == Currency.EUR ){
			return summ/1.16;
		}if(cur == Currency.PLN ){
			return summ/3.64;
		}if(cur == Currency.USD){
			return summ;
		}
		return 0;
	}	
	public static double FromUSDtoCarrency(double summ, Currency cur){
		if(cur == Currency.BLR ){
			return summ*2;
		}if(cur == Currency.EUR ){
			return summ*1.16;
		}if(cur == Currency.PLN ){
			return summ*3.64;
		}if(cur == Currency.USD){
			return summ;
		}
			return 0;
	}	
	public static double FromCarrencyToCarrency (double summa, Currency from , Currency to){
		double summaInUSD = FromCurrencytoUSD(summa, from);
		return FromUSDtoCarrency(summaInUSD, to);
	}
}