/**
 * @file PolygonFileDAO.java
 * Acts as the implementation of the PolygonDAO, not showing any
 * actual methodolgy to the other tiers.
 */

package com.stocksim.persistence;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stocksim.model.*;

@Component
public class PolygonFileDAO implements PolygonDAO {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private String key; // referring to the API key that is currently being handled

    public PolygonFileDAO(ObjectMapper objectMapper) throws IOException {
        this.objectMapper = objectMapper;
        this.key = "_l7VJXWkyGldxzCuLTxhrWLC16dPq5bX"; // default key used by junshinmp
        this.restTemplate = new RestTemplate();
    }

    public String getKey(){
        return this.key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public tickerOverview getTickerOverview(String ticker){
        String format = "https://api.polygon.io/v3/reference/tickers/" + ticker + "?apiKey=" + key;
        ResponseEntity<tickerOverview> response = restTemplate.getForEntity(format, tickerOverview);
        return response.body();
    }
}
