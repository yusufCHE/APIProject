package Rest;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class RestPostClient {
    public static void main(String[] args) {
        try {
            RestPostClient.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void call_me() throws Exception {

        //Post Request
        URL url = new URL("http://localhost:8080/Customers/V1");
        String jsonInputString ="{\"clientCode\":\"5347976\",\"bankCode\":\"9986596\",\"familySituation\":\"F\",\"lastName\":\"chiger\",\"gender\":\"F\",\"firstName\":\"Mohammed\"}";

        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);



        try(OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }


        //Post Response
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
            StringBuilder response = new StringBuilder();
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response);
        }


    }
}