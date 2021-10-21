package Exercises_25_09;

import java.util.Scanner;

public class Working_Hours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if ((hours >= 10 && hours <= 18) && ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday") || day.equals("Saturday")))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}


