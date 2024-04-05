package fi.arcada.codechallenge;

public class statistics {

    public static double calcMean(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}
