package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calcMonth(long[] sales) {
        int CalcMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[CalcMonth]) {
                CalcMonth = month;
            }
            month = month + 1;
        }
        return CalcMonth + 1;
    }

    public int averageSales(long[] sales) {
        int averageMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[averageMonth]) {
                averageMonth = month;
            }
            month = month + 1;
        }
        return averageMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int belowAverageMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[belowAverageMonth]) {
                belowAverageMonth = month;
            }
            month = month + 1;
        }
        return belowAverageMonth + 1;
    }

    public int aboveAverageSales(long[] sales) {
        int aboveAverageMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[aboveAverageMonth]) {
                aboveAverageMonth = month;
            }
            month = month + 1;
        }
        return aboveAverageMonth + 1;
    }
}