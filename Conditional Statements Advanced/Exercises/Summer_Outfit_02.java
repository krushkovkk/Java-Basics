package Exercises_26_09;

import java.util.Scanner;

public class Summer_Outfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String weather = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (weather) {
            case "Morning":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (temperature >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
    }
}
