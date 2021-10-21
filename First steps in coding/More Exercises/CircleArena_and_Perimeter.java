package Lab;

import java.util.Scanner;

public class CircleArena_and_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double calculated_area = Math.PI * r *r;
        double calculated_parameter = 2 * Math.PI * r;
        System.out.printf("%.2f", calculated_area);
        System.out.println();
        System.out.printf("%.2f", calculated_parameter);
    }
}
