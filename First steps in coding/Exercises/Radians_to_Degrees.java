package Exercises_12september;

import java.util.Scanner;

public class Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
