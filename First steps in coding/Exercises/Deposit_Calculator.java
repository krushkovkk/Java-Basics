package Exercises_12september;

import java.util.Scanner;

public class Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestrate = Double.parseDouble(scanner.nextLine());

        double total = deposit + months * ((deposit * interestrate/100)/12);
        System.out.println(total);
    }
}
