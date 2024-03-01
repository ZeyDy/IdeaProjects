package lt.javau9.solid;


import java.util.List;
import java.util.SequencedCollection;

import lt.javau9.solid.entities.Student;
import lt.javau9.solid.interfaces.Printable;

public class Archyvas{

	private static List<Printable> items ;

	public Archyvas(List<Printable> list) {
		
		this.items = list;
		
	}
	
	
	public static void addStudent() {
		items.add( new Student("Kostia", 69));
		System.out.println("Studentas pridetas");

	}

	 List<Printable> getList(){
		return items;
	}
	
	public void addPrintable(Printable item) {
		items.add (item);
	}

}
