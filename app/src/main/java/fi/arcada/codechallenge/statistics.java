package fi.arcada.codechallenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class statistics {

    public static double calcMedian(ArrayList<Double> values) {

        // Vi skapar en kopia av values
        ArrayList<Double> sorted = new ArrayList<>(values);

        // Sedan sorterar vi kopian. Annars sorteras ursprungliga datanmängden
        Collections.sort(sorted);

        // Detta funkar, ännu bättre skulle vara att kolla skiljt för jämna datamängder -
        // - med medelvärde av de två mittersta
        int midIndex = sorted.size() / 2;

        // Medianen är dett mittersta värdet i vår sorterade datamängd!
        return sorted.get(midIndex);

    }

    public static double calcMean(ArrayList<Double> values) {
        double sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += values.get(i);
        }
        return sum / values.size();
    }

    public static double calcStdev(ArrayList<Double> values) {
        // Räkna medelvärdet av de givna värdena
        double mean = calcMean(values);

        // Beräkna summan av kvadraten på skillnaden mellan varje värde och medelvärdet
        double avvikelse = 0;
        for (int i = 0; i < values.size(); i++) {
            avvikelse += Math.pow(values.get(i) - mean, 2);
        }

        // Räkna kvadratroten ur den genomsnittliga avvikelsen för att få standardavvikelsen!
        return Math.sqrt(avvikelse / values.size());
    }

}