import entities.Student;
import interfaces.Printable;
import interfaces.Startable;
import interfaces.UI;
import ui.ConsoleUi;
import java.util.LinkedList;
import java.util.List;
public class University  implements Startable{
    CSVFileHandler csv;
    private UI ui;

    public University() {
        this.csv = new CSVFileHandler();
        this.ui = new ConsoleUi();
    }

    @Override
    public void start() {
        boolean shouldContinue = true;
        while (shouldContinue) {
            showMenu();
            String str = getMenuOption();
            switch(str) {
                case "1" -> addStudent();
                case "2" -> showExistingList();
                case "X" -> shouldContinue = false;
            }
        }
        ui.close();
    }
    void showMenu() {
        ui.msg("Pasirinkite meniu punkta");
        ui.msg("1 - Prideti studenta");
        ui.msg("2 - rodyti sarasa");
        ui.msg("X - baigti darba");
    }

    String getMenuOption()
    {
        return ui.askUser("");
    }
    void addStudent() {


    }
    void showExistingList() {

    }
    public  void printList(){

    }


}
