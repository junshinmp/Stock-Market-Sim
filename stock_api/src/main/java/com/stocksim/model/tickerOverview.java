/**
 * @file tickerOverview.java
 * Holds all the information on specific transactions from a company (ticker).
 * 
 * NOTE: Information on a company can be grabbed regardless of if their transactions
 * can be processed. This means even free API keys can use this process.
 */

package com.stocksim.model;

public class tickerOverview {
    private final String ticker;
    private final String name;
    private final String market;
    private final String locale; // what country are they working in (ex. "US")
    private final String primExchange; // shortened version of primary exchange
    private final String type; // type is referring to field they are in (ex. "CS")
    private final String currencyType;
    private final companyAddress address;

    public tickerOverview(String ticker, String name, String market,
                        String locale, String primExchange, String type,
                        String currencyType, companyAddress address){
        this.ticker = ticker;
        this.name = name;
        this.market = market;
        this.locale = locale;
        this.primExchange = primExchange;
        this.type = type;
        this.currencyType = currencyType;
        this.address = address;
    }

    public String getTicker(){ return ticker; }
    public String getName(){ return name; }
    public String getMarket(){ return market; }
    public String getLocale(){ return locale; }
    public String getPrimExchange(){ return primExchange; }
    public String getType(){ return type; }
    public String currencyType(){ return currencyType; }
    public companyAddress getAddress(){ return address; }
}
