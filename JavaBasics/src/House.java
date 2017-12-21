
public class House {
	
	public static void main(String[] args) {

		Book book1 = new Book(); // An instance of the Book class. 
		
		//ToDo #1: Which constructor in the Book class is used above? 
		
		//Creating instances of the Book class on lines 9-12. 
		Book red_book = new Book("Red Book!"); //This is an Book Object. 
		Book blue_book = new Book("Blue book title!"); //This is an Book Object.
		Book yellow_book = new Book("Yellow Book"); //ToDo #2: This is a __________. 
		Book green_book = new Book("Green Book."); //ToDo #3: What constructor does use? 
		
		//Array of Books 
		Book[] book_cart = { red_book, blue_book, green_book, yellow_book };
		
		/*
		 * This is the long, repetitive way. 
		 * This is calling the public instance variable on each of the Book objects 
		 * that we've created. 
		 * 
		 * How are we combining with a String to do this? Concatenation. 
		 * 
		 * Google that. 
		 */
		System.out.println("The name of the book is: " + red_book.name);
		System.out.println("The name of the book is: " + blue_book.name);
		System.out.println("The name of the book is: " + green_book.name);
		System.out.println("The name of the book is: " + yellow_book.name);
		
		//ToDo #4: What is concatenation?
		
		//This is the really short way :) 
		for(Book book : book_cart) {
			book.printBookName(); //Calls the public method on the book class. 
		}
		
		//BONUS: What type of loop is this?
	}

}
