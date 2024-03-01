import java.util.*;
import java.util.function.Predicate;

public class App {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 27));
        students.add(new Student("Care", 40));

        //Predicate<Student> ilgesnisTrys = (s) -> s.name.length() > 3;
        //List<Student> filtruotas = getFiltered(ilgesnisTrys);
        //filtruotas.forEach(  student -> System.out.println(student)   );
        //System.out.println(filtruotas);

        Comparator<Student> comp = (a,b) -> a.getName().substring(1).compareTo(b.getName().substring(1));
        Collections.sort(students, comp);
        students.forEach(  student -> System.out.println(student)   );


    }
    static List<Student> getFiltered(Predicate<Student> kriterijus) {
        List<Student> rez = new ArrayList<>();
        for (Student stud : students) {
            if(kriterijus.test(stud))
                rez.add(stud);
        }
        return rez;
    }
}
