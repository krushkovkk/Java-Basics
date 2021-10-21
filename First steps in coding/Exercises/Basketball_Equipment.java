package Exercises_12september;

import java.util.Scanner;

public class Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualfee = Integer.parseInt(scanner.nextLine());

        double sneakers = annualfee - annualfee * 0.4;
        double outfit = sneakers - sneakers * 0.2;
        double ball = outfit / 4;
        double accessories = ball / 5;

        double total = sneakers + outfit + ball + accessories + annualfee;
        System.out.println(total);

    }
}
