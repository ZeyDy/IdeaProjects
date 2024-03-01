package uzduotis6;

public class StudentData {
    private final String studentId = "qwert";
    private String vardas;
    private final int metai = 1999;

    public void print() {
        System.out.println(studentId + vardas + metai);
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
    public String getStudentId() {
        return studentId;
    }


    public int getMetai() {
        return metai;
    }



}
