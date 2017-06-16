package com.singleton;

import java.math.BigDecimal;

/**
 * Created by RENT on 2017-06-14.
 */
public class Money {


    BigDecimal amount;
    String currency;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Money(){

    }

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void moneyPrinter(){
        System.out.println("For this amount you can get: " + getAmount() +" "+ getCurrency() );
        System.out.println("---------------------------------------------------------");
        System.out.println("");
    }

}
