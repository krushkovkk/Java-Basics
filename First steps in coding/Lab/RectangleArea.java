package Exercises_11september;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        //1. две променливи ( а и б) -> конзола
        //2. изчисляваме лицето = а * б
        //3. отпечатваме лицето
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = a * b;
        System.out.println(area);
    }
}
