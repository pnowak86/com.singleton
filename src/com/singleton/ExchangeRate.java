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



    public ExchangeRate() {

    }

    public ExchangeRate(BigDecimal buyPrice, BigDecimal sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }




}
