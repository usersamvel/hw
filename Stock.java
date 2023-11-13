package edu.hw3.Task6;

public class Stock implements Comparable<Stock> {
    public String name;
    public int price;

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Stock stock) {
        return -this.price + stock.price;
    }
}
