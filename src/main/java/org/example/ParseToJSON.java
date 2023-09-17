package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseToJSON {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String pojoToJsonString(Client client) throws JsonProcessingException {
        return objectMapper.writeValueAsString(client);
    }
}
