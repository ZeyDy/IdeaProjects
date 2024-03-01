package lt.javau9.solid;

import java.util.LinkedList;

import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.Startable;
import lt.javau9.solid.ui.ConsoleUi;

public class App {

	public static void main(String[] args) {
		Startable arch = new Archyvas( 
					new LinkedList<Printable>(),
					new ConsoleUi()
				);
		arch.start();
	}

}
