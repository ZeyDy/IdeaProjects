public class Station {
    public String code;
    public String name;
    public String waterBody;
    public Coordinates coordinates;

    @Override
    public String toString() {
        return "Station{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", waterBody='" + waterBody + '\'' +
                '}';
    }
}
