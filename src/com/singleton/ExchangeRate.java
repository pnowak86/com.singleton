package com.singleton;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-14.
 */
public class ExchangeRate {
    BigDecimal buyPrice;



    BigDecimal sellPrice;
   HashMap rates;


    public ExchangeRate() {

    }

    public ExchangeRate(BigDecimal buyPrice, BigDecimal sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public Map createMap() {

        return rates;
    }


}
