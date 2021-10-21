package Exercises_02_10;

import java.util.Scanner;

public class Even_Powers_of_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 0 ; number <= n; number +=2){
            System.out.printf("%.0f%n",Math.pow(2, number));
        }
    }
}
