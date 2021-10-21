package Exercises_11september;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        double dogs = 2.50;
        int cats = 4;
        Scanner scanner = new Scanner(System.in);
        int dog_food = Integer.parseInt(scanner.nextLine());
        int cat_food = Integer.parseInt(scanner.nextLine());
        double money = dog_food * dogs + cat_food * cats;
        System.out.println(money + " lv");

    }
}
