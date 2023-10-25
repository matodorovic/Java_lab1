package org.elpriser;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println();
            System.out.println("Elpriser");
            System.out.println("========");
            System.out.println("1. Inmatning");
            System.out.println("2. Min, Max och Medel");
            System.out.println("3. Sortera");
            System.out.println("4. Bästa Laddningstid (4h)");
            System.out.println("e. Avsluta");

            System.out.println();
            System.out.print("Välj ett alternativ: ");
            input = scanner.next().toLowerCase();

            switch(input) {
                case "1":
                    Prices.elPrices();
                    break;
                case "2":
                    MinMax.minMaxMedel();
                    break;
                case "3":
                    Sort.sorting();
                    break;
                case "4":
                    ChargingTime.bestChargingTime();
                    break;
                case "e":
                    System.out.println("Programmet avslutat.");
                    break;
                default:
                    System.out.println("Fel inmatning, prova en gång till.");
            }

        } while (!input.equals("e"));
    }
}
