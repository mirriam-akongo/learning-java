package com.mosh.bigo.fundamentals;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatCurrency {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String myCurrencyInDollars = currency.format(4321678903854.328973);
        System.out.println(myCurrencyInDollars);
        System.out.println();
        NumberFormat number = NumberFormat.getNumberInstance();
        String value = number.format(13849840753.894);
        System.out.println(value);

        BigDecimal valueToFormat = new BigDecimal("4321678903854.328973");
        NumberFormat ugandaFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        String formattedAmount = ugandaFormat.format(valueToFormat);
        System.out.println(formattedAmount);

        System.out.println();
        System.out.println();
        Locale swedish = new Locale("sv", "SE");
        NumberFormat swedishFormat = NumberFormat.getCurrencyInstance(swedish);
        System.out.println("Swedish: " + swedishFormat.format(valueToFormat));
        System.out.println();
        System.out.println();
        System.out.println("Currency Formats for UGANDA");
        Locale uganda = new Locale("sv", "UG");
        NumberFormat ugFormat = NumberFormat.getCurrencyInstance(uganda);

        System.out.println("1. Uganda:  " + ugFormat.format(valueToFormat));
        System.out.println();

        Locale uganda2 = new Locale("en", "UG");
        NumberFormat ug2Format = NumberFormat.getCurrencyInstance(uganda2);
        System.out.println("2. Uganda format2: " + ug2Format.format(valueToFormat));
        System.out.println();

        Locale uganda3 = new Locale("lg", "UG");
        NumberFormat ug2Format3 = NumberFormat.getCurrencyInstance(uganda3);
        System.out.println("3. Uganda format3: " + ug2Format3.format(valueToFormat));
        System.out.println();

        Locale uganda4 = new Locale("en_US", "UG");
        NumberFormat ug2Format4 = NumberFormat.getCurrencyInstance(uganda4);
        System.out.println("4. Uganda format4: " + ug2Format4.format(valueToFormat));
        System.out.println();

        Locale uganda5 = new Locale("en_GB", "UG");
        NumberFormat ug2Format5 = NumberFormat.getCurrencyInstance(uganda5);
        System.out.println("5. Uganda format5: " + ug2Format5.format(valueToFormat));

        System.out.println();
        System.out.println();
        System.out.println("Using Percent");
        NumberFormat percentValue = NumberFormat.getPercentInstance();
        String thePercentage = percentValue.format(0.328973);
        System.out.println(thePercentage);

        System.out.println();
        System.out.println("Method chaining");
        String percent = NumberFormat.getPercentInstance().format(0.12);
        System.out.println(percent);
    }
}
