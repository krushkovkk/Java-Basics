package Exercises_03_10;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5= 0;
        for (int number = 0; number < n ; number++){
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers <200){
                p1++;
            } else if (numbers <400){
                p2++;
            } else if (numbers <600 ){
                p3++;
            } else if (numbers < 800){
                p4++;
            }else {
                p5++;
            }
        }
        System.out.printf("%.2f%%\n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p3 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p4 * 1.0 / n * 100);
        System.out.printf("%.2f%%\n", p5 * 1.0 / n * 100);
    }
}
