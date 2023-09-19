package com.landa44.codeforces.sdk.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDeserializer {
    private UserDeserializer(){}

    public static UserResponse deserialize(String json) throws JsonProcessingException {
        ObjectMapper responseMapper = new ObjectMapper();

        return responseMapper.readValue(json, UserResponse.class);
    }
}
