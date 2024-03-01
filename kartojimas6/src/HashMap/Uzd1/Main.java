package HashMap.Uzd1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(11,"vienuolikas");
        hm.put(12,"dvylika");
        hm.put(100,"simtas");
        System.out.println(hm);
        System.out.println(hm.containsKey(12));
        System.out.println(hm.containsValue("simtas"));
        Set set = hm.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry mentry = (Map.Entry)it.next();
            System.out.println("Raktas: " + mentry.getKey() + ", Reiksme: " + mentry.getValue());
        }
    }
}
