package Exercises_03_10;

import java.util.Scanner;

public class Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int number = 0; number < n; number++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;

            if (numbers > max){
                max = numbers;
            }
        }
        sum -=max;
        if (max == sum){
            System.out.printf("Yes\n" + "Sum = %d ", max);
        } else {
            System.out.printf("No\n" + "Diff = %d",Math.abs(max - sum));
        }
    }
}
