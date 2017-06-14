package com.singleton;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//ExchangeRate exchangeRate = new ExchangeRate(3.72, 3.75);
        MoneyExchanger object = MoneyExchanger.getInstance();

       //object.buy(BigDecimal.valueOf(100),"USD");

        object.buy(BigDecimal.valueOf(100),"USD");
       Money money = new Money();
       money.moneyPrinter();

    }
}
