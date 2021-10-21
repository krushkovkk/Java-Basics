package Exercises_11september;

import java.util.Scanner;

public class Convertor_InchestoCm {
    public static void main(String[] args) {
        //1. прочитаме инчове ( реално число)
        //2. изчисляваме см: инчове * 2.54
        //3. отпечатваме см
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
