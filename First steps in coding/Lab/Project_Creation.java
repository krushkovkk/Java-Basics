package Exercises_11september;

import java.util.Scanner;

public class Project_Creation {
    public static void main(String[] args) {
        int project_time = 3;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects= Integer.parseInt(scanner.nextLine());
        int hours = projects * project_time;
        System.out.println("The architect " + name +  " will need " + hours + " hours to complete " + projects + " project/s." );

    }
}
