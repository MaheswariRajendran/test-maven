package learn.maven.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumTest {
	private static Sum sum;

	@BeforeClass
	public static void initCalculator() {

		sum = new Sum();

	}

	@Before

	public void beforeEachTest() {

		System.out.println("This is executed before each Test");

	}

	@After

	public void afterEachTest() {

		System.out.println("This is exceuted after each Test");

	}

	@Test

	public void testSum() {

		int result = sum.sum(3, 4);

		assertEquals(7, result);

	}

}
