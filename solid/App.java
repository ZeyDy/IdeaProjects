package lt.javau9.solid;


import lt.javau9.solid.interfaces.Startable;


public class App {

	public static void main(String[] args) {
		Startable mng = new StudentManager();
		mng.start();
	}

}
