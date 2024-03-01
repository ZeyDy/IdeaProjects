package LocalDateTime.Uzd1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dabar = LocalDateTime.now();
        System.out.println(dabar);
        LocalDateTime plius3 = dabar.minusDays(3);
        System.out.println(plius3);
        LocalDateTime minus5 = dabar.plusHours(5);
        System.out.println(minus5);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");

        System.out.println(dabar.format(dtf));
    }
}
