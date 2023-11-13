package edu.hw3.Task6;

import java.util.PriorityQueue;

public class Stocks implements StockMarket {
    public PriorityQueue<Stock> stocks;

    public Stocks() {
        stocks = new PriorityQueue<>();
    }

    @Override
    public void add(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        stocks.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return this.stocks.peek();
    }
}
