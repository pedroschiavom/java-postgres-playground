package com.example.financeiro;

import java.util.List;
import java.util.NoSuchElementException;

public class Currency {
    private String from;

    private String to;

    private double quote;

    public Currency(String from, String to, double quote) {
        this.from = from;
        this.to = to;
        this.quote = quote;
    }


    public String getFrom() {
        return from;
    }
    
    public String getTo() {
        return to;
    }

    public double getQuote() {
        return quote;
    }

}
