package Exercises_19_09;

import java.util.Scanner;

public class Lunch_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*

         */
        String serialname = scanner.nextLine();
        int episodelenght = Integer.parseInt(scanner.nextLine());
        int breaklenght = Integer.parseInt(scanner.nextLine());

        double breaktime = breaklenght / 8.0;
        double lunctime = breaklenght / 4.0;
        double totaltime = episodelenght + breaktime + lunctime;
        if (totaltime <= breaklenght) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialname, Math.ceil(breaklenght - totaltime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialname, Math.ceil(totaltime - breaklenght));
        }

    }
}
