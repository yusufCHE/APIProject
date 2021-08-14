package ApiLibrary;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class RequestRespo {
    static HttpClient client = HttpClient.newHttpClient();

    public static void GetRequestRespo(String url) throws IOException, InterruptedException {
        //GET
        HttpRequest Getrequest;
        Getrequest = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(url))
                .build();
        HttpResponse<String> GetResponse = client.send(Getrequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(GetResponse.body());
    }

    public static void PostRequestRespo(String url, String payload) throws IOException, InterruptedException {
        HttpRequest PostRequest= HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> PostResponse = client.send(PostRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(PostResponse.body());
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        PostRequestRespo("http://localhost:8081/Customers/V1","{\"clientCode\":\"5347976\",\"bankCode\":\"9986596\",\"familySituation\":\"F\",\"lastName\":\"chiger\",\"gender\":\"F\",\"firstName\":\"Mohammed\"}");
        GetRequestRespo("http://localhost:8081/Customers");
        RequestInfo.RequestUID();
        RequestInfo.RequestDate();

    }


}
class RequestInfo {
    public static String RequestUID(){
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        System.out.println("Your UUID is: " + uuidString);

        return uuidString;
    }

    public static String RequestDate(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String Date = myDateObj.format(myFormatObj);
        System.out.println("Date: " + Date);

        return Date;
    }

}
