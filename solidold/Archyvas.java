package lt.javau9.solid;

import java.util.List;

import lt.javau9.solid.entities.Article;
import lt.javau9.solid.entities.Book;
import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.Startable;
import lt.javau9.solid.interfaces.UI;

public class Archyvas implements Startable {

	private List<Printable> items ;
	private UI ui;
	
	
	public Archyvas(List<Printable> list, UI ui  ) {
		
		this.items = list;
		this.ui = ui;
	}
	
	
	@Override
	public void start() {
		addFiveArticles();
		addFewBooks();
		printList();
	}
	
	
	public void printList() {
		ui.printList(items);
	}
	
	
	private void addFiveArticles() {
		items.add( new Article("AAA"));
		items.add( new Article("AAB"));
		items.add( new Article("AAC"));
		items.add( new Article("ABAC"));
		items.add( new Article("ABCD"));
		
	}
	
	private void addFewBooks() {
		items.add( new Book( "The A", "Mr Some", "Good text"  ));
		items.add( new Book( "The B", "Mr Some", "Bad text"  ));
		items.add( new Book( "The C", "Mr Some", "Some text"  ));
		
	}
	
	

}
