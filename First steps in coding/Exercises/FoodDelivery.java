package Exercises_12september;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        double chicken = 10.35;
        double fish = 12.40;
        double vegatarian = 8.15;

        Scanner scanner = new Scanner(System.in);
        int chickenmenu = Integer.parseInt(scanner.nextLine());
        int fishmenu = Integer.parseInt(scanner.nextLine());
        int vegatarianmenu = Integer.parseInt(scanner.nextLine());

        double chickensum = chickenmenu * chicken;
        double fishsum= fishmenu * fish;
        double vegetariansum = vegatarianmenu * vegatarian;
        double totalmenusum= chickensum + fishsum + vegetariansum;
        double dessertsum = totalmenusum * 0.2;
        double delivery = 2.50;

        double total = totalmenusum + dessertsum + delivery;
        System.out.println(total);

    }
}
