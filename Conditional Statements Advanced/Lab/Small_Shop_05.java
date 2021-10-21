package Exercises_25_09;

import java.util.Scanner;

public class Small_Shop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());


        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * amount);
            }
            if (product.equals("water")) {
                System.out.println(0.80 * amount);
            }
            if (product.equals("beer")) {
                System.out.println(1.20 * amount);
            }
            if (product.equals("sweets")) {
                System.out.println(1.45 * amount);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.60 * amount);
            }

        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * amount);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * amount);
            }
            if (product.equals("beer")) {
                System.out.println(1.15 * amount);
            }
            if (product.equals("sweets")) {
                System.out.println(1.30 * amount);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.50 * amount);
            }

        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * amount);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * amount);
            }
            if (product.equals("beer")) {
                System.out.println(1.10 * amount);
            }
            if (product.equals("sweets")) {
                System.out.println(1.35 * amount);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.55 * amount);
            }
        }

    }

}
