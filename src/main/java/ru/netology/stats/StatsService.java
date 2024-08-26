package ru.netology.stats;

public class StatsService {

    // #1 Метод возвращающий сумму всех продаж
    public int sumOfAllSales(long[] sales) {
        long sumMonth = 0; // изначальное значение суммы продаж за все месяцы

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }

        return (int) sumMonth; // сума значений всех элементов массива
    }

    // #2 Метод возвращающий среднюю сумму продаж в месяц
    public int avrOfAllSales(long[] sales) {
        int avrMonth; // объявление переменной для средней суммы продаж
        int sumMonth = sumOfAllSales(sales); // вызов метода #1 возвращающего сумму всех продаж
        avrMonth = sumMonth / sales.length; // расчет средней суммы продаж в месяц

        return avrMonth; // значение средней суммы продаж
    }

    // #3 Метод возвращающий номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int numberOfMonthWithMaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // #4 Метод возвращающий номер месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // #5 Метод возвращающий количество месяцев, в которых продажи были ниже среднего
    public int countOfMonthWithLessAvrSales(long[] sales) {
        int lessMonth = 0; // число месяцев с продажами ниже среднего значения
        int avrMonth = avrOfAllSales(sales); // вызов метода #2 метода возвращающего среднюю сумму продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avrMonth) { // значит, в рассматриваемом i-м месяце продаж ниже среднего
                lessMonth = lessMonth + 1; // запомним его как минимальный
            }
        }

        return lessMonth; // количество месяцев, в которых продажи были ниже среднего
    }

    // #6 Метод возвращающий количество месяцев, в которых продажи были выше среднего
    public int countOfMonthWithMoreAvrSales(long[] sales) {
        int moreMonth = 0; // число месяцев с продажами выше среднего значения
        int avrMonth = avrOfAllSales(sales); // вызов метода #2 метода возвращающего среднюю сумму продаж в месяц

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avrMonth) { // значит, в рассматриваемом i-м месяце продаж выше среднего
                moreMonth = moreMonth + 1; // запомним его как минимальный
            }
        }

        return moreMonth; // количество месяцев, в которых продажи были выше среднего
    }
}
