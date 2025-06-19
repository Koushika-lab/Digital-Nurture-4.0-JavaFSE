public class FinancialForecast {

    // Recursive method to forecast future value
    public static double forecastRecursive(double[] growthRates, int year, double initialValue) {
        if (year == 0) return initialValue;
        return forecastRecursive(growthRates, year - 1, initialValue) * (1 + growthRates[year - 1]);
    }

    // Optimized with memoization
    public static double forecastMemo(double[] growthRates, int year, double initialValue, Double[] memo) {
        if (year == 0) return initialValue;
        if (memo[year] != null) return memo[year];
        memo[year] = forecastMemo(growthRates, year - 1, initialValue, memo) * (1 + growthRates[year - 1]);
        return memo[year];
    }

    public static void main(String[] args) {
        double[] growthRates = {0.1, 0.08, 0.12, 0.09}; // yearly growth
        double initialValue = 1000;
        int year = 4;

        double result1 = forecastRecursive(growthRates, year, initialValue);
        System.out.println("Recursive Forecast (Year " + year + "): " + result1);

        Double[] memo = new Double[year + 1];
        double result2 = forecastMemo(growthRates, year, initialValue, memo);
        System.out.println("Memoized Forecast (Year " + year + "): " + result2);
    }
}
