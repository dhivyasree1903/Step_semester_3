public class BmiCalculator {
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25.0) return "Normal";
        else if (bmi < 30.0) return "Overweight";
        else return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("================================================================================");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-12s%n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("================================================================================");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("Person %-3d | %-12.2f | %-12.1f | %-8.2f | %-12s%n",
                    (i + 1), heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
        System.out.println("================================================================================");
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60, 1.82, 1.68, 1.55, 1.70, 1.90, 1.62, 1.78, 1.85};
        double[] weights = {70.0, 90.0, 62.0, 75.0, 42.0, 68.0, 105.0, 58.0, 84.0, 72.0};
        printWellnessReport(heights, weights);
    }
}