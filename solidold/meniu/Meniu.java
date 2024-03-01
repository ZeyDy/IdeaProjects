package lt.javau9.solid.meniu;

import java.util.Scanner;

import lt.javau9.solid.entities.Article;
import lt.javau9.solid.entities.Book;
import lt.javau9.solid.interfaces.Printable;
import lt.javau9.solid.interfaces.Startable;
import lt.javau9.solid.interfaces.UI;

public class Meniu implements Startable {

    static void men() {
        System.out.println("""
                1 - knygos ivedimas
                2 - leidiniu saraso atspausdinimas
                3 - prideti zurnala
                """);
        Scanner sc = new Scanner(System.in);
        switch (sc) {
            case 1: {
                

            }
            case 2:
            case 3:

        }
    }


    @Override
    public void start() {

    }
}
