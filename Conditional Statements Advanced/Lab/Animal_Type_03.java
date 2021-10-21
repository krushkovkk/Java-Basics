package Exercises_25_09;

import java.util.Scanner;

public class Animal_Type_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
