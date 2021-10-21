package Exercises_02_10;

import java.util.Scanner;

public class Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int number = 1; number <= n; number++) {
            int n2 = Integer.parseInt(scanner.nextLine());
            sum1 += n2;
        }
        for (int number = 1; number <= n; number++) {
            int n3 = Integer.parseInt(scanner.nextLine());
            sum2 += n3;
        }
        int sumAll = Math.abs(sum1 - sum2);

        if (sum1 == sum2) {
            System.out.printf("Yes, sum = " + sum1);
        } else {
            System.out.printf("No, diff = " + sumAll);
        }
    }
}

