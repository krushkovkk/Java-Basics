package Exercises_12september;

import java.util.Scanner;

public class Vacation_BookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int page = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int all = pages/page/days;
        System.out.println(all);
    }
}
