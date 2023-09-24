package com.landa44.codeforces.sdk;

import com.landa44.codeforces.sdk.user.User;
import com.landa44.codeforces.sdk.util.ResponseDeserializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Client {
    private static final String  CODEFORCES_URL = "https://codeforces.com/api/";
    private static final String USER_INFO_ENDPOINT = "user.info?handles=";
    private static final int HTTP_OK = HttpURLConnection.HTTP_OK;
    private Client(){}

    private static String readResponse(InputStream inputStream) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    private static String get(String urlStr) throws IOException {
        HttpURLConnection connection = null;

        try{
            URL url = new URL(urlStr);
            connection = (java.net.HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream inputStream = (connection.getResponseCode() == HTTP_OK)
                ? connection.getInputStream()
                : connection.getErrorStream();

            return readResponse(inputStream);
        }
        finally {
            if(connection != null)
                connection.disconnect();
        }
    }

    public static ClientResponse<User> getInfo(List<String> users) throws IOException {
        String jsonResponse = get(CODEFORCES_URL + USER_INFO_ENDPOINT + String.join(";", users));

        return ResponseDeserializer.<User>deserialize(jsonResponse);
    }
}
