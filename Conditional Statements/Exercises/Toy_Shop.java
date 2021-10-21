package Exercises_19_09;

import java.util.Scanner;

public class Toy_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionprice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double alltoysprice = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int alltoys = puzzles + dolls + bears + minions + trucks;

        if (alltoys >= 50) {
            alltoysprice = alltoysprice - alltoysprice * 0.25;
        }
        alltoysprice = alltoysprice - alltoysprice * 0.10;

        if (alltoysprice >= excursionprice) {
            System.out.printf("Yes! %.2f lv left.", alltoysprice - excursionprice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionprice - alltoysprice);
        }

    }
}
