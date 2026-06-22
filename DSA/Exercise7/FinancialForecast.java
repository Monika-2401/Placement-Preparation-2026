public class FinancialForecast {

    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue,
                growthRate,
                years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 1000;
        double growthRate = 0.10;
        int years = 3;

        double result = futureValue(
                currentValue,
                growthRate,
                years);

        System.out.println("Future Value = " + result);
    }
}


/*  OUTPUT:
"c:\Users\monik\OneDrive\文件\Desktop\Placement-Preparation-2026\DSA\Exercise7\" && javac FinancialForecast.java && java FinancialForecast
Future Value = 1331.0

*/