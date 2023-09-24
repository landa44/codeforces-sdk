package com.landa44.codeforces.sdk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.landa44.codeforces.sdk.ClientResponse;

public class ResponseDeserializer {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private ResponseDeserializer(){}

    public static <T> ClientResponse<T> deserialize(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, new TypeReference<ClientResponse<T>>() {});
    }
}
