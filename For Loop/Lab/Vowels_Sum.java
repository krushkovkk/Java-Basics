package Exercises_02_10;

import java.util.Scanner;

public class Vowels_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int sum = 0;

        for (int position = 0; position <= word.length() - 1; position++) {
            char currentSymbol = word.charAt(position);

            switch (currentSymbol) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;

            }
        }
        System.out.println(sum);
    }
}