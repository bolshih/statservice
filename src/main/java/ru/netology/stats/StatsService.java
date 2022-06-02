package ru.netology.stats;


public class StatsService {

    public int allSalesSumm(long[] sales){
        int salesSumm = 0;
        //int i = 0;
        //while (i <= sales.length - 1){
        for (long sale : sales){
            salesSumm = (int) (salesSumm + sale);
         //   salesSumm = (int) (salesSumm + sales[i]);
         //   i = i + 1;
        }
        return salesSumm;
    }

    public int averageSaleSumm (long[] sales){
        int average = allSalesSumm(sales) / sales.length;
        return average;
    }

    public int maxSalesMonth (long [] sales){
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales){
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month +1;
        }
        return maxMonth +1;
    }

    public int minSalesMonth (long [] sales){
        int minMonth = 0;
        int month = 0;
        for (long sale : sales){
            if (sale <= sales[minMonth]){
                minMonth = month;
            }
            month = month +1;
        }
        return minMonth +1;
    }

    public int belowAverageSaleMonthCount (long[] sales){
        int months = 0;

        for (long sale : sales){
            if (sale < averageSaleSumm(sales)){
                months = months + 1;
            }
        }
        return months;
    }

    public int aboveAverageSaleMonthCount (long[] sales){
        int months = 0;

        for (long sale : sales){
            if (sale > averageSaleSumm(sales)){
                months = months + 1;
            }
        }
        return months;
    }
}
