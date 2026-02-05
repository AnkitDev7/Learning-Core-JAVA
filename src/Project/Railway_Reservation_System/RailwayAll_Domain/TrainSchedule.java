package Project.Railway_Reservation_System.RailwayAll_Domain;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TrainSchedule {

    private static final String API_KEY =
            "27a738bdf1msh37cef351b88cf5ap14b707jsn96ba17554fbd";

    private static final String HOST =
            "irctc-api2.p.rapidapi.com";

    public static String getTrainSchedule(String trainNumber) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://irctc-api2.p.rapidapi.com/trainSchedule?trainNumber=" + trainNumber
                ))
                .header("x-rapidapi-key", API_KEY)
                .header("x-rapidapi-host", HOST)
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body(); // JSON return
    }
}
