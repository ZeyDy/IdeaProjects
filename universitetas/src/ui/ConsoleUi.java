package ui;

import interfaces.Printable;
import interfaces.UI;

import java.util.List;
import java.util.Scanner;

public class ConsoleUi implements UI {
    static Scanner sc = new Scanner(System.in);

    @Override
    public void printList(List<Printable> list) {
        for (Printable e : list) {
            System.out.println(e);
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
