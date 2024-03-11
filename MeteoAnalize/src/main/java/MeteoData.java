import java.util.ArrayList;
public class MeteoData {
    public Station station;
    public  ArrayList<Observation> observations;

    @Override
    public String toString() {
        return "MeteoData(" +
                "station: " + station +
                ')';
    }
}
