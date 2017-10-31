package by.home.lesson11;

public class ConverterImplements implements IConverter{
	
	public double fromCurrencytoUSD(double summ, Currency cur){
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
	public double fromUSDtoCarrency(double summ, Currency cur){
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
	public double fromCarrencyToCarrency (double summa, Currency from , Currency to){
		double summaInUSD = fromCurrencytoUSD(summa, from);
		return fromUSDtoCarrency(summaInUSD, to);
	}
}