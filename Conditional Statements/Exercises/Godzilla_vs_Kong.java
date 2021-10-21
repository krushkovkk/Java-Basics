package Exercises_19_09;

import java.util.Scanner;

public class Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmbudget = Double.parseDouble(scanner.nextLine());
        int statistnumber = Integer.parseInt(scanner.nextLine());
        double statistsuit = Double.parseDouble(scanner.nextLine());

        double dress = statistnumber * statistsuit;
        double filmdecor = filmbudget * 0.10;
        if (statistnumber >= 150) {
            dress = dress - dress * 0.10;
        }
        double totalformovie = dress + filmdecor;
        double total = Math.abs(filmbudget - totalformovie);
        if (totalformovie <= filmbudget) {
            System.out.printf("Action! %n Wingard starts filming with %.2f leva left.", total);
        } else {
            System.out.printf("Not enough money! %n Wingard needs %.2f leva more.", total);
        }

    }
}
