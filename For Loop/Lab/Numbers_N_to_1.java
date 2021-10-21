package Exercises_02_10;

import java.util.Scanner;

public class Numbers_N_to_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = n; number >=1 ; number--){
            System.out.println(number);
        }
    }
}
