package Exercises_03_10;

import java.util.Scanner;

public class Trekking_Mania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int number = 0; number < groups; number++) {
            int groupPeople = Integer.parseInt(scanner.nextLine());

            sum += groupPeople;

            if (groupPeople <= 5) {
                p1 += groupPeople;
            } else if (groupPeople <= 12) {
                p2 += groupPeople;
            } else if (groupPeople <= 25) {
                p3 += groupPeople;
            } else if (groupPeople <= 40) {
                p4 += groupPeople;
            } else {
                p5 += groupPeople;
            }

        }
        System.out.printf("%.2f%%%n", p1 / sum * 100);
        System.out.printf("%.2f%%%n", p2 / sum * 100);
        System.out.printf("%.2f%%%n", p3 / sum * 100);
        System.out.printf("%.2f%%%n", p4 / sum * 100);
        System.out.printf("%.2f%%%n", p5 / sum * 100);

    }
}
