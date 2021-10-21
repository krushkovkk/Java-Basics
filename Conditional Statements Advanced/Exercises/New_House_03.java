package Exercises_26_09;

import java.util.Scanner;

public class New_House_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowername = scanner.nextLine();
        int flowernumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double discount = 0.0;
        switch (flowername) {
            case "Roses":
                price = flowernumber * 5.00;
                if (flowernumber > 80) {
                    discount = 0.10;
                }
                break;
            case "Dahlias":
                price = flowernumber * 3.80;
                if (flowernumber > 90) {
                    discount = 0.15;
                }
                break;
            case "Tulips":
                price = flowernumber * 2.80;
                if (flowernumber > 80) {
                    discount = 0.15;
                }
                break;
            case "Narcissus":
                price = flowernumber * 3.00;
                if (flowernumber < 120) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = flowernumber * 2.50;
                if (flowernumber < 80) {
                    price = price + price * 0.20;
                }
                break;
        }
        double totalPrice = price;
        price = price - price * discount;
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowernumber,
                    flowername, budget - price);
        } else if (price > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }

    }
}

