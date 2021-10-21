package Exercises_12september;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeincm = lenght * width * height;
        double volumeinlitres = volumeincm * 0.001;
        double total = volumeinlitres * (1- percentage/100);

        System.out.println(total);
    }
}
