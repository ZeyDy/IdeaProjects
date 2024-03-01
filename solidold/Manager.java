package lt.javau9.solid;

import java.util.LinkedList;

import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.Startable;
import lt.javau9.solid.interfaces.UI;
import lt.javau9.solid.ui.ConsoleUi;

public class Manager implements Startable {

	Archyvas arch ;
	private UI ui;
	
	public Manager() {
		this.arch = new Archyvas(new LinkedList<Printable>());
		this.ui = new ConsoleUi();
	}
	
	@Override
	public void start() {
		boolean shouldContinue = true;
		while(shouldContinue) {
			showMenu();
			String str = getMenuOption();
			switch(str) {
				case "1" -> addNewBook() ;
				case "2" -> addNewJournal();
				case "3" -> showExistingList();
				case "X" -> shouldContinue = false;							
			}
		}
		
		ui.close();
		
	}
	
	void showMenu() {
		ui.msg("Pasirinkite menu punkta");		
		ui.msg("1 - Prideti knyga");		
		ui.msg("2 - Prideti Zurnala");		
		ui.msg("3 - Rodyti sarasa");		
		ui.msg("X - baigti darba");		
	}
	
	
	
	String getMenuOption() {
		return ui.askUser("");
	}
	
	
	void addNewBook() {
		
	}
	
	void addNewJournal() {
		
	}
	
	void showExistingList() {
		
	}

}
