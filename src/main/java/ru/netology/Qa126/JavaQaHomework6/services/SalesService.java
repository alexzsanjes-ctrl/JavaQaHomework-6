package ru.netology.Qa126.JavaQaHomework6.services;

public class SalesService {

    // Расчитываем сумму продаж за все месяца
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long s : sales) {
            sum = sum + s;
        }
        return sum;

    }

    // Расчитывем среднее значение за месяц
    public long avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // Находим месяц с наибольшими продажами
    public int maxMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Находим месяц с наименьшими продажами
    public int minMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Вычисляем количество месяцев с продажами ниже среднего
    public int countMonthLowerAvg(long[] sales) {
        int count = 0;

        for (long s : sales) {
            if (s < avgSales(sales)) {
                count++;
            }
        }
        return count;

    }

    // Вычисляем количество месяцев с продажами выше среднего
    public int contMonthMoreAvg(long[] sales) {
        int count = 0;

        for (long s : sales) {
            if (s > avgSales(sales)) {
                count++;
            }
        }
        return count;
    }
}
