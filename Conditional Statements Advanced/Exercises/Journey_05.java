package Exercises_26_09;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        double money = 0.0;
        String tripPlace = "";

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                money = 0.30 * budget;
                tripPlace = "Camp";
            } else if (season.equals("winter")) {
                money = 0.70 * budget;
                tripPlace = "Hotel";
            }

        } else if (budget <= 1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                money = 0.40 * budget;
                tripPlace = "Camp";
            } else if (season.equals("winter")) {
                money = 0.80 * budget;
                tripPlace = "Hotel";
            }
        } else {
            place = "Europe";
            money = 0.90 * budget;
            tripPlace = "Hotel";

        }
        System.out.printf("Somewhere in %s", place );
        System.out.println();
        System.out.printf(tripPlace + " - " + "%.2f",money);
    }
}
