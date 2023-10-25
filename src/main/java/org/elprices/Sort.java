package org.elprices;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    public static void sorting(ElPrices[] elArray) {

        if (elArray[0] == null) {
            System.out.println("Först välj alternativ 1 för att mata in priser");
        } else {
            ElPrices[] arrayCopy = Arrays.copyOf(elArray, elArray.length);


            System.out.println("Priser från den biligaste: ");
            Arrays.sort(arrayCopy, Comparator.comparingInt(ElPrices::getPrice));
            for (int i = 0; i < arrayCopy.length; i++) {
                ElPrices elPrices = arrayCopy[i];
                System.out.println("kl " + elPrices.startTime + "-" + elPrices.endTime + ": " + elPrices.price + " öre");
            }
        }
    }
}
