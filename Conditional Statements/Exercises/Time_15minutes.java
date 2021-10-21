package Exercises_19_09;

import java.util.Scanner;

public class Time_15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int total = (hours * 60) + minutes + 15;

        int hours1 = total / 60;
        int minutes2 = total % 60;

        if (hours1 == 24) hours1 = 0;
        {
            if (minutes2 < 10) {
                System.out.printf("%d:0%d", hours1, minutes2);
            } else {
                System.out.printf("%d:%d", hours1, minutes2);
            }

        }
    }
}






