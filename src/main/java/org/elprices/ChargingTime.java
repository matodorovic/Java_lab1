package org.elprices;

import java.util.Arrays;

public class ChargingTime {

    public static void bestChargingTime(ElPrices[] elArray) {

        if (elArray[0] == null) {
            System.out.println("Först välj alternativ 1 för att mata in priser");
        } else {

            int totalOf4 = 2147483647;
            String bestStartTime = "";
            String bestEndTime = "";
            int avaragaePrice = 0;

            for( int i = 0; i < elArray.length-3; i++) {
                int temp =  elArray[i].price + elArray[i+1].price + elArray[i+2].price + elArray[i+3].price;
                if(temp < totalOf4) {
                    totalOf4 = temp;
                    bestStartTime = elArray[i].startTime;
                    bestEndTime = elArray[i+3].endTime;
                    avaragaePrice = totalOf4/4;
                }
            }

            System.out.println("Bäst laddningstid är mellan kl " + bestStartTime + "-" + bestEndTime);
            System.out.println("Medelpriset för el är då: " + avaragaePrice + " öre");

        }
    }
}
