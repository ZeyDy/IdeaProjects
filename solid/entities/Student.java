package lt.javau9.solid.entities;

import lt.javau9.solid.interfaces.Printable;

//DTO - Data Transfer Object 
//Entity - DB object
public class Student implements Printable {
	private String name;
	private int amzius;
	
	public Student(String name, int amzius) {
		this.name = name;
		this.amzius = amzius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmzius() {
		return amzius;
	}

	public void setAmzius(int amzius) {
		this.amzius = amzius;
	}

	@Override
	public String toString() {
		return "Vardas: " + name + ", Amzius" + amzius;
	}
}
