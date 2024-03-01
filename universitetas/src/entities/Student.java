package entities;

import interfaces.Printable;

public class Student implements Printable {
    String name;
    int amzius;

    public Student(String name, int amzius) {
        this.name = name;
        this.amzius = amzius;
    }

    //<editor-fold desc="getAndSet">


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
        return "Studentas: " + name  +
                ", amzius:" + amzius ;
    }


    //</editor-fold>
}
