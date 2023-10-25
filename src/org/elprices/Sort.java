package org.elprices;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    public static void sorting(ElPrices[] elArray) {

        System.out.println("Priser från den biligaste: ");
        Arrays.sort(elArray, Comparator.comparingInt(ElPrices::getPrice));
        for (ElPrices elPrices : elArray) {
            System.out.println("Kl" + elPrices.startTime + "-" + elPrices.endTime + ": " + elPrices.price + " öre");
        }
    }
}
