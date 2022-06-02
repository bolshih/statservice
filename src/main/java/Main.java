import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 500, 13, 15, 17, 20, 680, -20, 7, 1000, 14, 18};
        int saleSumm = service.allSalesSumm(sales);
        int average = service.averageSaleSumm(sales);
        int maxMonth = service.maxSalesMonth(sales);
        int minMonth = service.minSalesMonth(sales);
        int belowAverage = service.belowAverageSaleMonthCount(sales);
        int aboveAverage = service.aboveAverageSaleMonthCount(sales);
        System.out.println("бщая сумма " + saleSumm);
        System.out.println("Средняя " + average);
        System.out.println("Максимальные продажи "+ maxMonth);
        System.out.println("Минимальные продажи " + minMonth);
        System.out.println(belowAverage);
        System.out.println(aboveAverage);
    }
}
