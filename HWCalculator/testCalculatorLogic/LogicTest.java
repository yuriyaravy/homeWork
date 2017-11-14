package by.IntelSoft.HWCalculator.testCalculatorLogic;

import by.IntelSoft.HWCalculator.Logic;
import by.IntelSoft.HWCalculator.NullException;
import by.IntelSoft.HWCalculator.ZeroException;
import by.IntelSoft.HWCalculator.Calculator;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LogicTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator(2,2);
		Assert.assertEquals(4, Logic.add(cal));
	}

	@Test
	public void testSubstruct() {
		Calculator cal = new Calculator(-4,-2);
		Assert.assertEquals(-2, Logic.substruct(cal));
	}

	@Test
	public void testMultiply() {
		Calculator cal = new Calculator(6,2);
		Assert.assertEquals(12, Logic.multiply(cal));
	}
	@Test
	public void testDivide() throws ZeroException {
		Calculator cal = new Calculator(6,2);
		double result = Logic.divide(cal);
		if(result != 3.0){
			Assert.fail();
		}
	}
/*
	@Test
	public void testDivide() {
		Calculator cal = new Calculator(6 , 2);
		Assert.assertEquals(3.0, Logic.divide(cal));
	}
	*/
	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() throws ZeroException {
		Calculator cal = new Calculator(6,0);
		Logic.divide(cal);
	}

}
