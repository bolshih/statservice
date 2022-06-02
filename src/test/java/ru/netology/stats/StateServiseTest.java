package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateServiseTest {

    @Test
    void allSalesSummTest() {
        int expectionSumm = 2272;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actualSumm = service.allSalesSumm(sales);

        Assertions.assertEquals(expectionSumm, actualSumm);
    }

    @Test
    void averageSaleSummTest() {
        int expectionSumm = 189;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actualSumm = service.averageSaleSumm(sales);

        Assertions.assertEquals(expectionSumm, actualSumm);
    }

    @Test
    void maxSalesMonthTest() {
        int expectionMonth = 10;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actualMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectionMonth, actualMonth);
    }

    @Test
    void minSalesMonthTest() {
        int expectionMonth = 8;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actualMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectionMonth, actualMonth);
    }

    @Test
    void belowAverageSaleMonthCount() {
        int expection = 9;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actual = service.belowAverageSaleMonthCount(sales);

        Assertions.assertEquals(expection, actual);
    }

    @Test
    void aboveAverageSaleMonthCount() {
        int expection = 3;
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        StatsService service = new StatsService();
        int actual = service.aboveAverageSaleMonthCount(sales);

        Assertions.assertEquals(expection, actual);
    }
}
