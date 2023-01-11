package org.example.java8.stream.practice;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Transaction {
    private final Trader trader; // 거래자
    private final int year; // 거래연도
    private final int value; // 거래금액

    @Override
    public String toString() {
        return String.format("{%s, year: %d, value: %d}", trader, year, value);
    }

//    public Transaction(Trader trader, int year, int value) {
//        this.trader = trader;
//        this.year = year;
//        this.value = value;
//    }
//
//    public Trader getTrader() {
//        return trader;
//    }
//    public int getYear() {
//        return year;
//    }
//    public int getValue() {
//        return value;
//    }
//}
}
