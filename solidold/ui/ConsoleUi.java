package lt.javau9.solid.ui;

import java.util.List;

import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.UI;

public class ConsoleUi implements UI {

	@Override
	public void printList(List<Printable> list) {
		
		for(Printable el : list) {
			System.out.println(el);
		}
	}


}
