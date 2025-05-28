/**
 * @file marketTransaction.java
 * Holds the ticker key as well as a list of all transactions that this 
 * specific ticker has made recently.
 * 
 * NOTE: Some tickers will not be processed due to limitations of the Polygon
 * API needing a paid plan. This restricts which companies can be monitored.
 */

package com.stocksim.model;

import java.util.List;

class marketTransaction {
    private final String ticker;
    private final List<marketResponse> results;

    public marketTransaction(String ticker, List<marketResponse> results){
        this.ticker = ticker;
        this.results = results;
    }

    public String getTicker(){ return ticker; }
    public List<marketResponse> getResults(){ return results; }
}
