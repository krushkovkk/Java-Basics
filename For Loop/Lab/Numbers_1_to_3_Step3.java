package Exercises_02_10;

import java.util.Scanner;

public class Numbers_1_to_3_Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <=n; number += 3){
            System.out.println(number);
        }
    }
}
