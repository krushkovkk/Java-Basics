package Exercises_02_10;

import java.util.Scanner;

public class Character_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int position = 0; position <= text.length() - 1; position++) {
            char currentSymbol = text.charAt(position);
            System.out.println(currentSymbol);
        }
    }
}
