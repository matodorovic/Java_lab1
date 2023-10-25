package org.elprices;

import java.util.Arrays;
import java.util.Comparator;

public class MinMax {

    public static void minMaxMedel(ElPrices[] elArray)  {
            int summa = 0;

            for( int i = 0; i < elArray.length; i++) {
                summa+= elArray[i].price;
            }

            int averageValue = summa/elArray.length;


        Arrays.sort(elArray, Comparator.comparingInt(ElPrices::getPrice));

        System.out.println("Lägsta priset är mellan kl" + elArray[0].startTime + "-" + elArray[0].endTime + ": " + elArray[0].price + " öre");
        System.out.println("Högsta priset är mellan kl" + elArray[elArray.length-1].startTime + "-" + elArray[elArray.length-1].endTime + ": " + elArray[elArray.length-1].price + " öre");
        System.out.println("Medel pris är: " + averageValue + " öre");
    }
}
