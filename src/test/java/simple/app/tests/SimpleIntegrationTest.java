package simple.app.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import simple.app.tests.categories.IntegrationTest;

@Category(IntegrationTest.class)
public class SimpleIntegrationTest {
	
	@Test
	public void test001() {
		assertTrue(true);
	}
}
