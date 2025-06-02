/**
 * @file PolygonController
 * Network facing class that recieves and handles HTTP requests that
 * might be made by a user.
 */

package com.stocksim.viewmodel;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.stocksim.persistence.PolygonDAO;
import com.stocksim.model.tickerOverview;

@RestController
public class PolygonController {
    private final PolygonService service;   

    public PolygonController(PolygonDAO polygonDAO){
            this.service = new PolygonService(polygonDAO);
    }

    public ResponseEntity<tickerOverview> getTickerOverview(String ticker){
        tickerOverview result =  this.service.getTickerOverview(ticker);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    public ResponseEntity<String> getKey(){
        String key = this.service.getKey();
        return new ResponseEntity<>(key, HttpStatus.OK);
    }

    public ResponseEntity<Void> setKey(String key){
        this.service.setKey(key);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
