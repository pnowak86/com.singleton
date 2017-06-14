package com.singleton;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-14.
 */
public class MoneyExchanger {


    private static MoneyExchanger instance;

    private MoneyExchanger() {
    }

    public static MoneyExchanger getInstance() {
        if (instance == null) {
            instance = new MoneyExchanger();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }


    public Money buy(BigDecimal amount, String targetCurrency) {




        BigDecimal bought;
        BigDecimal sellPrice;


        Map<String, ExchangeRate> rates = new HashMap<String, ExchangeRate>();
        rates.put("USD", new ExchangeRate(BigDecimal.valueOf(3.72), BigDecimal.valueOf(3.75)));
        rates.put("EUR", new ExchangeRate(BigDecimal.valueOf(4.17), BigDecimal.valueOf(4.19)));
        rates.put("GBP", new ExchangeRate(BigDecimal.valueOf(4.74), BigDecimal.valueOf(4.78)));
        rates.put("CHF", new ExchangeRate(BigDecimal.valueOf(3.84), BigDecimal.valueOf(3.87)));



       sellPrice = rates.get(targetCurrency).getSellPrice();




       bought = amount.divide(sellPrice, 3, RoundingMode.CEILING);


        // bought = amount / rates.get(targetCurrency).;


        return new Money(bought, targetCurrency);

    }

    private Money sell(Money money) {

        return null;
    }


}
