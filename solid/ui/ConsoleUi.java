package lt.javau9.solid.ui;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.UI;

public class ConsoleUi implements UI {

	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void printList(List<Printable> list) {
		
		for(Printable el : list) {
			System.out.println(el);
		}
	}

	@Override
	public void msg(String msg) {
		
		System.out.println(msg);
	}

	@Override
	public String askUser(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	@Override
	public void close() {
		sc.close();
		
	}

	
	

}
