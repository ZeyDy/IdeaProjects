import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        StringListBox stb = new StringListBox();


    }
    public static <T extends Comparable<T>> T maxElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    public static <T> void reverseList(List<T> list) {
        List<T> reversedList = IntStream.range(0, list.size())
                .mapToObj(i -> list.get(list.size() - i - 1))
                .collect(Collectors.toList());
        list.clear();
        list.addAll(reversedList);
    }
}
interface ListBox<E> {
    void  addElements(E[] values);
    void addElement(E value);
    List<E> getElements();
}
class StringListBox implements ListBox<String> {
    List<String> myList = new ArrayList<>();

    @Override
    public void addElements(String[] values) {
        myList.addAll(Arrays.asList(values));

    }

    @Override
    public void addElement(String value) {
        myList.add(value);
    }

    @Override
    public List<String> getElements() {
        return myList;
    }
}
class Students implements ListBox<Students>{
    List<Students> studList = new ArrayList<>();

    @Override
    public void addElements(Students[] values) {
        studList.addAll(Arrays.asList(values));
    }

    @Override
    public void addElement(Students value) {
        studList.add(value);
    }

    @Override
    public List<Students> getElements() {
        return studList;
    }
}
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void printInfo() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

