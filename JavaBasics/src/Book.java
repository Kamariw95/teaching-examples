
public class Book {
	
	
	public String name; //instance variable: different each time you create an instance 
	//of this class.
	
	/***
	 * 
	 * Constructor: Called when creating an instance of this class (also known as creating an object). 
	 */
	public Book() {
		
	}
	
	public Book(String parameterName) {
		this.name = parameterName;
	}
	
	public void printBookName() {
		System.out.println("The name of the book is: " + this.name);
	}
	
}
