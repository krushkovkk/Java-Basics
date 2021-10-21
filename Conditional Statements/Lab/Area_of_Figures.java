package Exercises_18_09;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        if (figura.equals("square")) {
            double figura1 = Double.parseDouble(scanner.nextLine());
            double lice1 = figura1 * figura1;
            System.out.printf("%.3f", lice1);
        } else if (figura.equals("rectangle")) {
            double figura2 = Double.parseDouble(scanner.nextLine());
            double figura21 = Double.parseDouble(scanner.nextLine());
            double lice2 = figura2 * figura21;
            System.out.printf("%.3f", lice2);
        } else if (figura.equals("circle")) {
            double figura3 = Double.parseDouble(scanner.nextLine());
            double lice3 = Math.PI * (figura3 * figura3);
            System.out.printf("%.3f", lice3);
        } else if (figura.equals("triangle")) {
            double figura4 = Double.parseDouble(scanner.nextLine());
            double figura41 = Double.parseDouble(scanner.nextLine());
            double lice4 = figura4 * figura41 / 2;
            System.out.printf("%.3f", lice4);
        }
    }
}