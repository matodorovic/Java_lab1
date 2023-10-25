package org.elpriser;

import java.util.Scanner;

public class InputPrices {

    public static ElPrices[] todaysPrices = new ElPrices[24];

    public static void prices() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Skriv in elpriser för senaste 24 timmar i öre (bara siffror): ");

        for( int i = 0; i < 24; i++) {
            ElPrices hourlyPrice = new ElPrices();
            System.out.print("Kl " + i + " - " + (i+1) + ": ");
            hourlyPrice.price = scanner.nextInt();
            hourlyPrice.startTime = Integer.toString(i);
            hourlyPrice.endTime = Integer.toString(i+1);
            todaysPrices[i]  = hourlyPrice;
        }
    }
}
