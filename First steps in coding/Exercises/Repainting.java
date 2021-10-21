package Exercises_12september;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        double nylon = 1.50;
        double paint = 14.50;
        double paintthinner = 5.00;

        Scanner scanner = new Scanner(System.in);
        int nylon1 = Integer.parseInt(scanner.nextLine());
        int paint1 = Integer.parseInt(scanner.nextLine());
        int paintthinner1 = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonsum = (nylon1 + 2) * nylon;
        double paintsum = (paint1 * 1.1) * paint;
        double paintthinersum = paintthinner1 * paintthinner;
        double materials = nylonsum + paintsum + paintthinersum + 0.40;
        double workersum = materials * 0.30 * hours;

        double total = materials + workersum;
        System.out.println(total);

    }
}
