package Exercises_03_10;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgeNumber = Integer.parseInt(scanner.nextLine());


        for (int number = 1; number <= judgeNumber; number++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            academyPoints += judgeName.length() * judgePoints / 2;
            if (academyPoints > 1250.5) {
                break;
            }
        }
        if (academyPoints > 1250.5) {
            System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - academyPoints);
        }
    }
}