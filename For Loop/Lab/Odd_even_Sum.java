package Exercises_02_10;

import java.util.Scanner;

public class Odd_even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int number = 1; number <= n; number++){
            int n1 = Integer.parseInt(scanner.nextLine());

            if (number % 2 ==0){
                evenSum += n1;
            }else{
                oddSum += n1;
            }
        }
        if (oddSum == evenSum){
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(oddSum - evenSum));
        }
    }
}
