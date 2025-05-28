/**
 * @file: companyAddress.java
 * Holds the companies address, formatting the data to be processed over
 * and used for the embedded map on the front-end. Created when user
 * requests for a company overview from the polygon API.
 */

package com.stocksim.model;

public class companyAddress {
    private final String street;
    private final String streetInfo; // optional return that might not appear
    private final String city;
    private final String state;
    private final int postalCode;

    public companyAddress (String street, String streetInfo, String city, 
                            String state, int postalCode){
        this.street = street;
        this.streetInfo = streetInfo;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    // basic getters
    public String getStreet(){ return street; }
    public String getStreetInfo(){ return streetInfo; }
    public String getCity(){ return city; }
    public String getState(){ return state; }
    public int getPostalCode(){ return postalCode; }
}
