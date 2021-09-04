package Rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class RestClient {
    public static void main(String[] args) {
        try {
            RestClient.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void call_me() throws Exception {
        String url = "http://localhost:8080/Customers/Customer";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print in String
        System.out.println(response);

        //Read JSON response and print
        //JSONObject myResponse = new JSONObject(response.toString());
       //System.out.println("result after Reading JSON Response");
        //System.out.println("origin- "+myResponse.getString("origin"));

    }
}
