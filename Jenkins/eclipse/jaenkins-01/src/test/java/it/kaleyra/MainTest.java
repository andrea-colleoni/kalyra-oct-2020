package it.kaleyra;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		long millis = System.currentTimeMillis();
		boolean result = millis % 2 == 0;
		assertTrue("millis:" + millis  + ", result: " + result, result);
	}

}
