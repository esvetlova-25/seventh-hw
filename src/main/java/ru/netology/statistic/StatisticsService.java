package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax <= income) {
                currentMax = income;
            }
        }
        return currentMax;
    }

    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }

    public int calculateSum(long[] incomes) {
        long currentMin = incomes[0];
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return (int) sum;
    }
}