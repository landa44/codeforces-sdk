package com.landa44.codeforces.sdk;

import com.landa44.codeforces.sdk.user.User;
import com.landa44.codeforces.sdk.user.UserDeserializer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Client {
    private Client(){}

    public static List<User> getInfo(List<String> users) throws IOException {
        URL url = new URL("https://codeforces.com/api/user.info?handles=" + String.join(";", users));
        HttpURLConnection connection = (java.net.HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return UserDeserializer.deserialize(response.toString()).getResult();
        } else{
            BufferedReader errorIn = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            String errorLine;
            StringBuilder errorResponse = new StringBuilder();

            while ((errorLine = errorIn.readLine()) != null) {
                errorResponse.append(errorLine);
            }
            errorIn.close();

            throw new RuntimeException("Error Response: " + errorResponse.toString());
        }
    }
}
