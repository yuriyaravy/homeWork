import java.util.Map;

public class ConverterInternetImplements implements IConverter{
	
		Map<String, Double> curMap = InternetCurrency.InterCur();
		
		
	public double fromCurrencytoBLR(double summ, Currency cur){
		if(cur == Currency.USD ){
			return summ*curMap.get("USD");
		}if(cur == Currency.EUR ){
			return summ*curMap.get("EUR");
		}if(cur == Currency.PLN ){
			return summ*curMap.get("PLN");
		}if(cur == Currency.BLR){
			return summ;
		}
		return 0;
	}	
	public double fromBLRtoCarrency(double summ, Currency cur){
		if(cur == Currency.USD ){
			return summ/curMap.get("USD");
		}if(cur == Currency.EUR ){
			return summ/curMap.get("EUR");
		}if(cur == Currency.PLN ){
			return summ/curMap.get("PLN");
		}if(cur == Currency.BLR){
			return summ;
		}
			return 0;
	}	
	public double fromCarrencyToCarrency (double summa, Currency from , Currency to){
		double summaInBLR = fromCurrencytoBLR(summa, from);
		return fromBLRtoCarrency(summaInBLR, to);
	}
}
