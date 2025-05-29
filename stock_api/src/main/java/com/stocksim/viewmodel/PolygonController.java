/**
 * @file PolygonController
 * Network facing class that recieves and handles HTTP requests that
 * might be made by a user.
 */

package com.stocksim.viewmodel;

import com.stocksim.persistence.PolygonDAO;

public class PolygonController {
    private final PolygonService service;

    public PolygonController(PolygonDAO polygonDAO){
            this.service = new PolygonService(polygonDAO);
    }  

}
