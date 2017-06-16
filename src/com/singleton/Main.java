package com.singleton;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//ExchangeRate exchangeRate = new ExchangeRate(3.72, 3.75);
        MoneyExchanger object = MoneyExchanger.getInstance();
        Money money;
        //object.buy(BigDecimal.valueOf(100),"USD");

        //object.scannerForUpdateRate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to change currency rate please type in currency (USD/EUR/GBP/CHF) or write 'no' to start:");
        object.ourCurrencyToUpdate = scanner.nextLine();
        String option = object.ourCurrencyToUpdate;

        switch (option) {
            case "USD":
            case "EUR":
            case "GBP":
            case "CHF":

                System.out.println("Type in new buying price:");
                object.newBuyPrice = scanner.nextBigDecimal();
                System.out.println("Type in new selling price:");
                object.newSellPrice = scanner.nextBigDecimal();
                scanner.nextLine();
                object.updateCurrencyRate(object.ourCurrencyToUpdate, new ExchangeRate(object.newBuyPrice, object.newSellPrice));

                break;
            default:
                System.out.println("Starting program with default currency rates!");
        }

        System.out.println("Hello, I've got 100 PLN and I want to buy:");

        money = object.buy(BigDecimal.valueOf(100), "USD");
        System.out.println(money.getCurrency());
        money.moneyPrinter();

        //object.showMap();


        money = object.buy(BigDecimal.valueOf(100), "EUR");
        System.out.println(money.getCurrency());
        money.moneyPrinter();


        money = object.buy(BigDecimal.valueOf(100), "GBP");
        System.out.println(money.getCurrency());
        money.moneyPrinter();

        money = object.buy(BigDecimal.valueOf(100), "CHF");
        System.out.println(money.getCurrency());
        money.moneyPrinter();

        System.out.println("Now we have 120 EUR and we wanna buy");
        money = new Money(new BigDecimal(120), "EUR");
        money = object.sell(money);
        System.out.println(money.getCurrency());
        money.moneyPrinter();
    }
}
