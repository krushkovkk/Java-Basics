package Exercises_19_09;

import java.util.Scanner;

public class World_Swimming_Record {
    public static void main(String[] args) {
        /*
        ⦁	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
⦁	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
⦁	Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]
         */
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double timeinseconds = Double.parseDouble(scanner.nextLine());

        double totaltoswim = metres * timeinseconds;
        double waterresistance = Math.floor(metres / 15) * 12.5;
        double totaltime = totaltoswim + waterresistance;

        if (record <= totaltime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totaltime -record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totaltime);
        }
    }
}
