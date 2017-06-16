package com.singleton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by RENT on 2017-06-14.
 */
public class MoneyExchanger {


    private static MoneyExchanger instance;
    Map<String, ExchangeRate> rates = new HashMap<String, ExchangeRate>();
    String ourCurrencyToUpdate;
    BigDecimal newBuyPrice;
    BigDecimal newSellPrice;


    private MoneyExchanger() {
        createMap();
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

    public void createMap() {

        rates.put("USD", new ExchangeRate(new BigDecimal(3.72), new BigDecimal(3.75)));
        rates.put("EUR", new ExchangeRate(new BigDecimal(4.17), new BigDecimal(4.19)));
        rates.put("GBP", new ExchangeRate(new BigDecimal(4.74), new BigDecimal(4.78)));
        rates.put("CHF", new ExchangeRate(new BigDecimal(3.84), new BigDecimal(3.87)));

    }

    public void showMap(){
//        for (int i = 0; i <rates.size() ; i++) {
//            System.out.println(rates.get);
//        }

        rates.entrySet().forEach(System.out::println);
    }

    public Money buy(BigDecimal amount, String targetCurrency) {
        if (amount != null) {

            BigDecimal bought;
            BigDecimal sellPrice;

            sellPrice = rates.get(targetCurrency).getSellPrice();

            bought = amount.divide(sellPrice, new MathContext(4));
            return new Money(bought, targetCurrency);
        } else {
            return null;
        }
    }

    public Money sell(Money money) {
        if (money != null) {

            BigDecimal buyPrice;
            BigDecimal tmpAmount;
            buyPrice = rates.get(money.getCurrency()).getBuyPrice();
            tmpAmount = buyPrice.multiply(money.getAmount(), new MathContext(4));
            return new Money(tmpAmount, "PLN");
        } else {
            return null;
        }
    }



    public void updateCurrencyRate(String currency, ExchangeRate exchangeRate){

        if(currency.equals("USD")){
            rates.put("USD",exchangeRate);

        }
        if(currency.equals("EUR")){
            rates.put("EUR",exchangeRate);

        }
        if(currency.equals("GBP")){
            rates.put("GBP",exchangeRate);

        }
        if(currency.equals("CHF")){
            rates.put("CHF",exchangeRate);

        }

    }
}
