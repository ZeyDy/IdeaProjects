import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String a = sca.nextLine();

        List<Student> ourStudents = DataBaseUtil.getAllStudents();
        List<Student> oneStudent = DataBaseUtil.getStudentsByName(a);
        ourStudents.forEach(System.out::println);
        oneStudent.forEach(System.out::println);
    }
}
