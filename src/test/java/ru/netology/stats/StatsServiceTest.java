package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // #1 Метод возвращающий сумму всех продаж
    @Test
    void sumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        // вызываем целевой метод:
        int actualSum = service.sumOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedSum, actualSum);

        System.out.println("Sum of all sales is: " + actualSum);
    }

    // #2 Метод возвращающий среднюю сумму продаж в месяц
    @Test
    void avrOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvr = 15;
        // вызываем целевой метод:
        int actualAvr = service.avrOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedAvr, actualAvr);

        System.out.println("Average sum between all sales is: " + actualAvr);
    }

    // #3 Метод возвращающий номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    void numberOfMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 8;

        // вызываем целевой метод:
        int actualMax = service.numberOfMonthWithMaxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedMax, actualMax);

        System.out.println("Number of month with max sales is: " + actualMax);
    }

    // #4 Метод возвращающий номер месяца с минимальными продажами
    @Test
    void numberOfMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;

        // вызываем целевой метод:
        int actualMin = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedMin, actualMin);

        System.out.println("Number of month with min sales is: " + actualMin);
    }

    // #5 Метод возвращающий количество месяцев, в которых продажи были ниже среднего
    @Test
    void countOfMothLessAvrSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLess = 5;

        // вызываем целевой метод:
        int actualLess = service.countOfMonthWithLessAvrSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedLess, actualLess);

        System.out.println("Count of months with sales less then average: " + actualLess);
    }

    // #6 Метод возвращающий количество месяцев, в которых продажи были выше среднего
    @Test
    void countOfMothMoreAvrSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMore = 5;

        // вызываем целевой метод:
        int actualMore = service.countOfMonthWithMoreAvrSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expectedMore, actualMore);

        System.out.println("Count of months with sales more then average: " + actualMore);
    }
}