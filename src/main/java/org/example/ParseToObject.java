package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseToObject {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Client JsonToPojo(Client client) throws JsonProcessingException {
        String clientJson = ParseToJSON.pojoToJsonString(client);
        return objectMapper.readValue(clientJson, Client.class);
    }
}
