package lt.javau9.solid.entities;

import lt.javau9.solid.interfaces.Printable;

//DTO - Data Transfer Object 
//Entity - DB object
public class Article implements Printable {
	private String text;
	
	public Article(String text) {
		this.text = text;
	}
	
	
	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return "Article with text " + text;
	}
}
