package org.elprices;

import java.util.Scanner;

public class InputPrices {

    public static ElPrices[] todaysPrices = new ElPrices[24];

    public static void prices() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Skriv in elpriser för senaste 24 timmar i öre (bara siffror): ");

        for( int i = 0; i < 24; i++) {
            ElPrices hourlyPrice = new ElPrices();
            String start = String.format("%02d",  i);
            String end = String.format("%02d",  i+1);
            System.out.print("kl " + start + "-" + end + ": ");
            hourlyPrice.price = scanner.nextInt();
            hourlyPrice.startTime = start;
            hourlyPrice.endTime = end;
            todaysPrices[i]  = hourlyPrice;
        }
    }
}
