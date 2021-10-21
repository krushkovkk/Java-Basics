package Exercises_03_10;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int number = 0; number < openTabs; number++) {
            String browsers = scanner.nextLine();
            switch (browsers) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
        }
        if (salary <= 0) {
            System.out.printf("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
