package staticIrFinal.Uzd6;

public class StudentData {
    private final String studentId;
    private String vardas = "Rokas";
    private final int metai = 1999;
    StudentData(String a, String b, int c) {
        studentId = a;
        b = vardas;
        c = metai;

    }
    public void info () {
        System.out.println("Id: " + studentId + ", Vardas: " + vardas + ", Metai: " + metai);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getVardas() {
        return vardas;
    }

    public int getMetai() {
        return metai;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }
}
