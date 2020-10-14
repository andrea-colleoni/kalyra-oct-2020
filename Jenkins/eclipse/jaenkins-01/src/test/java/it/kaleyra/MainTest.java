package it.kaleyra;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertTrue(System.currentTimeMillis() % 2 == 0);
	}

}
