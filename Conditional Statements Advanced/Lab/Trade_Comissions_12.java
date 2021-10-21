package Exercises_25_09;

import java.util.Scanner;

public class Trade_Comissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double profit = Double.parseDouble(scanner.nextLine());

        double comission = 0.0;

        switch (city) {
            case "Sofia":
                if (profit >= 0 && profit <= 500) {
                    comission = profit * 0.05;
                    System.out.printf("%.2f", comission);
                } else if (profit > 500 && profit <= 1000) {
                    comission = profit * 0.07;
                    System.out.printf("%.2f", comission);
                } else if (profit > 1000 && profit <= 10000) {
                    comission = profit * 0.08;
                    System.out.printf("%.2f", comission);
                } else if (profit > 10000) {
                    comission = profit * 0.12;
                    System.out.printf("%.2f", comission);
                }
                break;
            case "Varna":
                if (profit >= 0 && profit <= 500) {
                    comission = profit * 0.045;
                    System.out.printf("%.2f", comission);
                } else if (profit > 500 && profit <= 1000) {
                    comission = profit * 0.075;
                    System.out.printf("%.2f", comission);
                } else if (profit > 1000 && profit <= 10000) {
                    comission = profit * 0.10;
                    System.out.printf("%.2f", comission);
                } else if (profit > 10000) {
                    comission = profit * 0.13;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (profit >= 0 && profit <= 500) {
                    comission = profit * 0.055;
                    System.out.printf("%.2f", comission);
                } else if (profit > 500 && profit <= 1000) {
                    comission = profit * 0.08;
                    System.out.printf("%.2f", comission);
                } else if (profit > 1000 && profit <= 10000) {
                    comission = profit * 0.12;
                    System.out.printf("%.2f", comission);
                } else if (profit > 10000) {
                    comission = profit * 0.145;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");

        }
    }

}

