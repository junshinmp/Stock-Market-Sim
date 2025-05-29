/**
 * @file PolygonService
 * Calls upon the Polygon API to recieve information
 * about the variety of provided companies, such as:
 * - Company name
 * - Cash Amount
 * - Currency
 * - Etcetra.
 */

package com.stocksim.viewmodel;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stocksim.persistence.PolygonDAO;

@Service
class PolygonService {
    private PolygonDAO polygonDAO; // Polygon Data Access Object
    private String key; // referring to the API key that is currently being handled
    private final RestTemplate restTemplate;

    public PolygonService(PolygonDAO dao){
        this(dao, "l7VJXWkyGldxzCuLTxhrWLC16dPq5bX"); // default key associated with junshimp
    }

    public PolygonService(PolygonDAO dao, String key){
        this.polygonDAO = dao;
        this.key = key;
        this.restTemplate = new RestTemplate();
    }

    public String getKey(){ return key; }

    /**
     * This function can be used to set a new key depending on if a user chooses to.
     * Due to the free plan and paid plan variants, this option is available so that
     * the user is able to now get data that is blocked from the free plan.
     * @param key the key that is replacing the default key.
     */
    public void setKey(String key){ this.key = key; }
}