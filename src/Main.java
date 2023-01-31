import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        String url="https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=2a767b514413477a92791b5b314936f9&include=minutely";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse=httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}