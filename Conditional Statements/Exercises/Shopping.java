package Exercises_19_09;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videocardsprice = 250 * videocards;
        double processorsprice = videocardsprice * 0.35;
        double ramprice = videocardsprice * 0.10;

        double totalprice = videocardsprice + processors * processorsprice + ram * ramprice;
        if (videocards >= processors) {
            totalprice = totalprice - totalprice * 0.15;
        }

        if (totalprice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalprice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalprice - budget);
        }
    }
}
