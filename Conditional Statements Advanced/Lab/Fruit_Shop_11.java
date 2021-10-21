package Exercises_25_09;

import java.util.Scanner;

public class Fruit_Shop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayofweek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double sum = 0.0;

        if (dayofweek.equals("Monday") || dayofweek.equals("Tuesday") || dayofweek.equals("Wednesday") ||
                dayofweek.equals("Thursday") || dayofweek.equals("Friday")) {
            if (fruit.equals("banana")) {
                sum = amount * 2.50;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("apple")) {
                sum = amount * 1.20;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("orange")) {
                sum = amount * 0.85;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("grapefruit")) {
                sum = amount * 1.45;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("kiwi")) {
                sum = amount * 2.70;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("pineapple")) {
                sum = amount * 5.50;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("grapes")) {
                sum = amount * 3.85;
                System.out.printf("%.2f",sum);
            }else{
                System.out.println("error");
            }
        } else if (dayofweek.equals("Saturday") || dayofweek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                sum = amount * 2.70;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("apple")) {
                sum = amount * 1.25;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("orange")) {
                sum = amount * 0.90;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("grapefruit")) {
                sum = amount * 1.60;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("kiwi")) {
                sum = amount * 3.00;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("pineapple")) {
                sum = amount * 5.60;
                System.out.printf("%.2f",sum);
            }
            else if (fruit.equals("grapes")) {
                sum = amount * 4.20;
                System.out.printf("%.2f",sum);
            }else{
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

    }
}