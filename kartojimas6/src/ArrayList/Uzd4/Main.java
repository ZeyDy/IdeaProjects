package ArrayList.Uzd4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("aras");
        str.add("ratas");
        str.add("karas");
        str.getFirst();
        System.out.println(str.getLast());
        str.removeFirst();
        str.removeLast();
        System.out.println(str);
        str.push("aras");
        System.out.println(str);
        str.pop();
        System.out.println(str);
    }
}
