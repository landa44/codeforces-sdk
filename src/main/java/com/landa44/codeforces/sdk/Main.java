package com.landa44.codeforces.sdk;

import com.landa44.codeforces.sdk.user.UserDeserializer;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Client.getInfo(Arrays.asList("benq", "tourist")));
    }
}
