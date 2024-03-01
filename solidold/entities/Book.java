package lt.javau9.solid.entities;

public class Book extends Article{
	private String title;
	private String author; 
	
	
	public Book(String title, String author,String text) {
		super(text);
		this.title = title;
		this.author = author;
	}


	@Override
	public String toString() {
		return "Title: " + title + " Author: " + author + " Text: " + super.toString();
	}


	

	

}
