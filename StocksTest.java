package edu.hw3.Task6;

import edu.hw3.Task4;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StocksTest {

    @Test
    void mostValuableStock() {
        Stocks stocks = new Stocks();
        Stock stock1 = new Stock("a", 2);
        Stock stock2 = new Stock("b", 3);
        stocks.add(stock1);
        stocks.add(stock2);
        Stock response = stocks.mostValuableStock();
        Assertions.assertThat(response).isEqualTo(stock2);
    }

    @Test
    void mostValuableStock2() {
        Stocks stocks = new Stocks();
        Stock stock1 = new Stock("a", 22);
        Stock stock2 = new Stock("b", 3);
        stocks.add(stock1);
        stocks.add(stock2);
        Stock response = stocks.mostValuableStock();
        Assertions.assertThat(response).isEqualTo(stock1);
    }
}
