import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

public class JsonUtils {
    public static <T> Optional<T> createObject(String json, Class<T> type) {
        ObjectMapper om = new ObjectMapper();

        try {
            return Optional.of(om.readValue(json,type));
        } catch ( JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return Optional.empty();

    }
}
