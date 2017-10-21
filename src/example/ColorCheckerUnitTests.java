package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorCheckerUnitTests {
	/*
	 * Setting variables to use throughout unit testing. You dont have to 
	 * do this, but it's helpful so you don't repeat code. 
	 */
	protected String expectedFavoriteColor = "blue";
	protected ColorChecker testColorChecker = new ColorChecker(expectedFavoriteColor);
	
	/**
	 * This is a unit test. 
	 * 
	 * Unit tests are done using a Unit Test library, here we're using 
	 * JUnit (notice it in the imports that have Junit in them). We're 
	 * using this assert function to check that the statement inside of it 
	 * returns true. 
	 * 
	 * Specifically in this case we are checking that the constructor is
	 * initialized correctly. 
	 * 
	 * Add a variable in the ColorChecker class and initialize it in the base
	 * constructor, then test it here. 
	 **/
	@Test //This lets Junit know that this is a test function; typically called a decorator.
	void testShouldHaveEmptyFavoriteColor() {
		ColorChecker baseColorChecker = new ColorChecker();

		assert(baseColorChecker.favoriteColor.equals(""));
		//assert(baseColorChecker.__________.equals(???));
	}
	
	@Test
	void testShouldSetFavoriteColor() {
		/*
		 * With unit tests, you also can check that objects in a class are what you 
		 * expect them to be. In this case, we use an expected color to be 
		 * "blue", since we created the instance `testColorChecker` with it being 
		 * passed to the constructor, ColorChecker(String color)
		 * 
		 */
		assertEquals(expectedFavoriteColor, testColorChecker.favoriteColor);
	}
	
	@Test
	void testShouldReturnTrue() {
		/*
		 * This is a basic unit test, looking to make sure that the 
		 * checkForColor method returns what we expected it to. In 
		 * this case we expect the boolean result 'true' since 
		 * the color is in the private String[] in the ColorChecker 
		 * class.
		 * 
		 * Be sure to go over to the class and look to be sure. 
		 * Also, add some tests and colors of your own.
		 */
		assertEquals(true, testColorChecker.checkForColor("red"));
	}
	
	@Test
	void testShouldReturnFalse() {
		/*
		 * This is a basic unit test, looking to make sure that the 
		 * checkForColor method returns what we expected it to. In 
		 * this case we expect the boolean result 'false' since 
		 * the color is not in the private String[] in the ColorChecker 
		 * class.
		 */
		assertEquals(false, testColorChecker.checkForColor("magenta"));
	}
	
	@Test
	void testShouldReturnSameValues() {
		ColorChecker anotherTestColorChecker = new ColorChecker("blue");
		/**
		 * Notice that I also created another instance of the class here inside of the
		 * test method. This is a common thing to do when testing. When I write some other 
		 * stuff I'm doing I'll show you how you can test actual and expected results.
		 * 
		 * Actually, ill add it to this tomorrow.
		 */
		assertEquals(anotherTestColorChecker.favoriteColor, testColorChecker.favoriteColor);
	}
	
	@Test
	void testShouldNotReturnTheSameValues() {
		ColorChecker anotherTestColorChecker = new ColorChecker("green");
		
	/**
	 * So there are other asserts you can use, that you can test constructors and
	 * other conditionals. Notice below that I used `assertNotEquals` instead of the
	 * `assertEquals` that I used a lot here.
	 * 
	 * Check out more info about Assert here: 
	 * https://www.tutorialspoint.com/junit/junit_using_assertion.htm
	 */
		assertNotEquals(anotherTestColorChecker.favoriteColor, testColorChecker.favoriteColor);
	}
	

}
