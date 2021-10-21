package Exercises_03_10;

import java.util.Scanner;

public class Clever_Lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int money = 10;
        int toysCount = 0;

        for (int number = 1; number <= age; number++) {
            if (number % 2 == 0) {
                sum += money;
                money += 10;
                sum -= 1;
            } else {
                toysCount++;
            }
        }
        sum += toyPrice * toysCount;
        if (sum >= washingMachine) {
            System.out.printf("Yes! %.2f", sum - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - sum);
        }
    }
}