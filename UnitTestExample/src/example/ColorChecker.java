package example;

/**
 * ColorChecker
 * 
 * Class that has a private set of colors and sets a favoriteColor. It can check 
 * for specific colors using checkForColor method.
 * 
 * @author K. Wright
 *
 */
public class ColorChecker {
	  private String[] colors = { "blue", "red", "purple", "yellow" };
	  public String favoriteColor;

	  public ColorChecker() {
	        this.favoriteColor = "";
	  }

	  public ColorChecker(String color) {
	        this.favoriteColor = color;
	  }

	  public boolean checkForColor(String color) {
	    for(String c : colors) {
	      if(c.equals(color)){
	        return true;
	      }
	    }
	    return false;
	  }
}
