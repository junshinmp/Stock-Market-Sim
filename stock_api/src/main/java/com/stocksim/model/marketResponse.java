/**
 * @file marketResponse.java
 * Holds all the information from a singular transaction made by the company,
 * converting into a processable and workable format. These are created when
 * user requests for transactions from a company or ticker from the polygon API.
 * 
 * NOTE: This information is never of the present day, usually only from a day prior
 * due to limitations from the free API keys from Polygon. To request up-to-date
 * information requires a paid plan.
 */

package com.stocksim.model;

public class marketResponse {
    private final double weightedAverage;
    private final double closePrice;
    private final double highestPrice;
    private final double lowestPrice;
    private final double openPrice;
    private final long timestamp;
    private final long volume;
    
    public marketResponse(double weightedAverage, double closePrice, double highestPrice, 
                            double lowestPrice, double openPrice, long timestamp, long volume){
        this.weightedAverage = weightedAverage;
        this.closePrice = closePrice;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.openPrice = openPrice;
        this.timestamp = timestamp;
        this.volume = volume;
                            }

    // basic getters
    public double getWeightedAvg(){ return weightedAverage; }
    public double getClosePrice(){ return closePrice; }
    public double getHighestPrice(){ return highestPrice; }
    public double getLowestPrice(){ return lowestPrice; }
    public double getOpenPrice(){ return openPrice; }
    public long getTimeStamp(){ return timestamp; }
    public long getVolume(){ return volume; }
}
