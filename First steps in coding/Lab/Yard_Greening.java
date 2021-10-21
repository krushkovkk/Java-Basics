package Exercises_11september;

import java.util.Scanner;

public class Yard_Greening {
    public static void main(String[] args) {
        double price = 7.61;

        Scanner scanner = new Scanner(System.in);
        double space = Double.parseDouble(scanner.nextLine());
        double finalprice = space * price;
        double discount = finalprice * 0.18;
        double total = finalprice - discount;
        System.out.println("The final price is: " + total + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
