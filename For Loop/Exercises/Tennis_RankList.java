package Exercises_03_10;

import java.util.Scanner;

public class Tennis_RankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int wins = 0;

        for (int n = 0; n < tournaments; n++) {
            String level = scanner.nextLine();
            switch (level) {
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d\n", points + startPoints);
        System.out.printf("Average points: %d\n", points / tournaments);
        System.out.printf("%.2f%%", wins * 1.0/ tournaments * 100);
    }
}