/**
 * @file PolygonDAO.java
 * Acts as the interface outlining the utilized interactions
 * from the PolygonDAO. This also provides separation within
 * the persistence and raw implementation from the viewmodel,
 * a.k.a, the public interface for the model layer.
 */

package com.stocksim.persistence;

import com.stocksim.model.*;

public interface PolygonDAO {
    /**
     * Gets the ticker overview JSON from the PolygonAPI overview
     * query, converting into Java object.
     * @param ticker the correlating company ticker
     * @return Java tickerOverview object
     */
    public tickerOverview getTickerOverview(String ticker);

    /**
     * Returns current key that is being used.
     */
    public String getKey();

    /**
     * This function can be used to set a new key depending on if a user chooses to.
     * Due to the free plan and paid plan variants, this option is available so that
     * the user is able to now get data that is blocked from the free plan.
     * @param key the key that is replacing the default key.
     */
    public void setKey(String key);
}