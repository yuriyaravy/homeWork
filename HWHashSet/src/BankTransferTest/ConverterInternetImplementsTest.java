package BankTransferTest;
import static org.junit.Assert.*;


import org.junit.Test;

public class ConverterInternetImplementsTest {

	@Test
	public void testFromCurrencytoBLR_1() {
              IConverter con = new ConverterInternetImplements ();
	      double s1 = con.fromCurrencytoBLR(1, Currency.USD);
	      System.assertEquals(1.23, s1);
	}

	@Test
	public void testFromBLRtoCarrency() {
		fail("Not yet implemented");
	}

	@Test
	public void testFromCarrencyToCarrency() {
		fail("Not yet implemented");
	}

}
