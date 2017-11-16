package by.IntelSoft.HWHashSet.HWHashSetTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import by.IntelSoft.HWHashSet.RandomNumber;

public class RandomNumberTest {

	@Test
	public void testFindMin() {
		Object[] testArrays = {14,23,34,1,65,56,45,23};
		int minTest = RandomNumber.findMin(testArrays);
		if(minTest != 1){
			Assert.fail();
		}
	}
	@Test
	public void testFindMax() {
		Object[] testArrays = {14,23,34,1,65,56,45,23};
		int minTest = RandomNumber.findMax(testArrays);
		if(minTest != 65){
			Assert.fail();
		}
	}
	//How works with method which has type void
}
