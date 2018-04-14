import java.util.Scanner;

public class SU_08_Metric_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double value = Double.parseDouble(in.nextLine());
        String inputMetric = in.nextLine();
        String outputMetric = in.nextLine();

        if ("mm".equals(inputMetric)) {
            value /= 1000.0d;
        } else if ("cm".equals(inputMetric)) {
            value /= 100.0d;
        } else if ("mi".equals(inputMetric)) {
            value /= 0.000621371192d;
        } else if ("in".equals(inputMetric)) {
            value /= 39.3700787d;
        } else if ("km".equals(inputMetric)) {
            value /= 0.001d;
        } else if ("ft".equals(inputMetric)) {
            value /= 3.2808399d;
        } else if ("yd".equals(inputMetric)) {
            value /= 1.0936133d;
        }
        if ("mm".equals(outputMetric)) {
            value *= 1000.0d;
        } else if ("cm".equals(outputMetric)) {
            value *= 100.0d;
        } else if ("mi".equals(outputMetric)) {
            value *= 0.000621371192d;
        } else if ("in".equals(outputMetric)) {
            value *= 39.3700787d;
        } else if ("km".equals(outputMetric)) {
            value *= 0.001d;
        } else if ("ft".equals(outputMetric)) {
            value *= 3.2808399d;
        } else if ("yd".equals(outputMetric)) {
            value *= 1.0936133d;
        }
        System.out.printf("%f %s%n", value, outputMetric);

    }
}
