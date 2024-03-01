package uzd1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> aibe = new HashMap<>();
        aibe.put(1,"veinas");
        aibe.put(2, "du");
        aibe.put(3,"trys");
        System.out.println(aibe);
        System.out.println(aibe.containsKey(1));
        System.out.println(aibe.containsValue("du"));
        Set set = aibe.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();

            System.out.println("Raktas: " + mentry.getKey() + ", Reiksme: " + mentry.getValue());
        }
    }
}
