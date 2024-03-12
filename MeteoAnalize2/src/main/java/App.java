import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App {
    public static void main(String[] args){
        String json = JsonData.getStation();
        ObjectMapper om = new ObjectMapper();
        try {
            AllStations allStations = om.readValue(json, AllStations.class);
            for (Test test : allStations.tests) {
                System.out.println(test);
            }
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }


}

