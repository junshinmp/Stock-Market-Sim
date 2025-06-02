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

import com.stocksim.persistence.PolygonDAO;
import com.stocksim.model.*;

class PolygonService {
    private final PolygonDAO polygonDAO; // Polygon Data Access Object

    public PolygonService(PolygonDAO polygonDAO){
        this.polygonDAO = polygonDAO;
    }

    public tickerOverview getTickerOverview(String ticker){
        return this.polygonDAO.getTickerOverview(ticker);
    }

    public String getKey(){
        return this.polygonDAO.getKey();
    }

    public void setKey(String key){
        this.polygonDAO.setKey(key);
    }
}