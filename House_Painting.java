package Lab;

import java.util.Scanner;

public class House_Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wall = x * y;
        double window = 1.5 * 1.5;
        double twowalls = 2 * wall - 2 * window;
        double backwall = x * x;
        double entrance = 1.2 * 2;
        double frontrear = 2 * backwall - entrance;
        double all1 = twowalls + frontrear;
        double greenpaint = all1 / 3.4;

        double roof1 = 2 * (x * y);
        double roof2 = 2 * (x * h / 2);
        double all2 = roof1 + roof2;
        double redpaint = all2 / 4.3;

        System.out.printf("%.2f", greenpaint);
        System.out.println();
        System.out.printf("%.2f", redpaint);

    }
}
