import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    //https://api.meteo.lt/v1/hydro-stations/kauno-vms/observations/measured/2024-03-02
    public static String getJsonByUrl(String urlString) {
        try {
            return tryGetJson(urlString);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    public static String tryGetJson(String urlString) throws IOException {

        HttpURLConnection connection = getConnection(urlString);


        if (connection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error " + connection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String result = br.readLine();

        if (connection != null)
            connection.disconnect();

        return result;

    }

    private static HttpURLConnection  getConnection( String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        return connection;
    }
}