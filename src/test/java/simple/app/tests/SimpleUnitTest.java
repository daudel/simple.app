package simple.app.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import simple.app.tests.categories.UnitTest;

@Category(UnitTest.class)
public class SimpleUnitTest {
	
	@Test
	public void test001() {
		assertTrue(true);
	}
}
