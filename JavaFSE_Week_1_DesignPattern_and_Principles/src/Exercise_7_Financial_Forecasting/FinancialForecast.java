package Exercise_7_Financial_Forecasting;

public class FinancialForecast {

    public static double forecastValue(double principal, double rate, int period) {
        if (period <= 0) {
            return principal;
        }
        return forecastValue(principal, rate, period - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double baseAmount = 8000.0;    // changed from 10000.0
        double annualGrowth = 0.08;    // changed from 0.10 (10%)
        int duration = 6;              // changed from 5

        double estimatedValue = forecastValue(baseAmount, annualGrowth, duration);

        System.out.printf("Estimated future value after %d years: ₹%.2f%n", duration, estimatedValue);
    }
}
