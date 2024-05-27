public class AverageCalculator<T extends Number> {
    public double average(T[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (T num : arr) {
            sum += num.doubleValue();
        }

        return sum / arr.length;
    }

    public static void generic2(String[] args) {
        AverageCalculator<Integer> intCalc = new AverageCalculator<>();
        Integer[] intArray = {1, 2, 3, 4, 5};
        double intAvg = intCalc.average(intArray);
        System.out.println("Average of integers: " + intAvg);

        AverageCalculator<Double> doubleCalc = new AverageCalculator<>();
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        double doubleAvg = doubleCalc.average(doubleArray);
        System.out.println("Average of doubles: " + doubleAvg);

        AverageCalculator<Float> floatCalc = new AverageCalculator<>();
        Float[] floatArray = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f};
        double floatAvg = floatCalc.average(floatArray);
        System.out.println("Average of floats: " + floatAvg);
    }
}
