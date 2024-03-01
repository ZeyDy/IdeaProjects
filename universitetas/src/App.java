import entities.Student;
import interfaces.Startable;

public class App {
    public static void main(String[] args) {
        Startable smg = new University();
        smg.start();

    }
}
