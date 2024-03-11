import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String ivestis = sc.nextLine();
            try {
                int number = Integer.parseInt(ivestis);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("Sum = " + sum);
    }
}



