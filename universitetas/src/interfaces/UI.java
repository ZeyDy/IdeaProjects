package interfaces;

import java.util.List;

public interface UI {
    void printList(List<Printable> list);
    void msg(String string);
    String askUser(String msg);
    public void close();
}
