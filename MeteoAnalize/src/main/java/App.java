import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.16.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.16.1

import java.util.Optional;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        String stringUrl = "https://api.meteo.lt/v1/hydro-stations/kauno-vms/observations/measured/2024-03-02";

        long startTime = System.nanoTime();
        String json = HttpClient.getJsonByUrl(stringUrl);
        long duration = (System.nanoTime() - startTime) / 1000000;



        Optional<MeteoData> mdo = JsonUtils.createObject(json, MeteoData.class);

        if (mdo.isPresent()) {
            MeteoData mo = mdo.get();
            mo.observations.forEach(App::printWaterLevel);


        }
        System.out.println(duration + "ms");

    }
    static  void  printWaterLevel(Observation o) {
        System.out.println(o.observationTimeUtc + " " + o.waterLevel + "m.");
    }
}

