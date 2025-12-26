package ru.netology.Qa126.JavaQaHomework6.servecice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleServiceTest {

    @Test
    public void sumSalesForAllMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgSalesForMonth () {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.avgSales(sales);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void monthWhereSalesMax () {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonth(sales);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void monthWhereSalesMin () {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthsWhereSalesLowerAvg (){
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthLowerAvg(sales);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void countMonthWhereSalesMoreAvg () {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.contMonthMoreAvg(sales);
        Assertions.assertEquals(expected,actual);
    }
}