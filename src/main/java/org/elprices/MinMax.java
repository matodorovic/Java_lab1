package org.elprices;

import java.util.Arrays;
import java.util.Comparator;

public class MinMax {

    public static void minMaxMedel(ElPrices[] elArray) {

        if (elArray[0] == null) {
            System.out.println("Först välj alternativ 1 för att mata in priser");
        } else {
            ElPrices[] arrayCopy = Arrays.copyOf(elArray, elArray.length);

            int total = 0;

            for (int i = 0; i < arrayCopy.length; i++) {
                total += arrayCopy[i].price;
            }

            int averageValue = total / arrayCopy.length;


            Arrays.sort(arrayCopy, Comparator.comparingInt(ElPrices::getPrice));

            System.out.println("Lägsta priset är mellan kl " + arrayCopy[0].startTime + "-" + arrayCopy[0].endTime + ": " + arrayCopy[0].price + " öre");
            System.out.println("Högsta priset är mellan kl " + arrayCopy[arrayCopy.length - 1].startTime + "-" + arrayCopy[arrayCopy.length - 1].endTime + ": " + arrayCopy[arrayCopy.length - 1].price + " öre");
            System.out.println("Medelpriset är då: " + averageValue + " öre");
        }
    }
}
