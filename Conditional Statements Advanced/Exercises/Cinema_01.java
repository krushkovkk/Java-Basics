package Exercises_26_09;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int totalplaces = r * c;
        double income = 0.0;

        if (projection.equals("Premiere")){
            income = totalplaces * 12.00;
            System.out.printf("%.2f leva",income);
        }else if (projection.equals("Normal")){
            income = totalplaces * 7.50;
            System.out.printf("%.2f leva", income);
        } else if (projection.equals("Discount")){
            income = totalplaces * 5.00;
            System.out.printf("%.2f leva", income);
        }
    }
}
